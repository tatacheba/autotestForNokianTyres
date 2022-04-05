import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.sleep;

public class TestBase {

    @BeforeAll
    static void openBrowser() {
        baseUrl = "https://www.nokiantyres.ru/";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;

//        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

//        String browser = System.getProperty("browser", "chrome");
//        String version = System.getProperty("version", "91");
//        String size = System.getProperty("size", "1920x1080");
//        String remoteUrl = System.getProperty("remoteUrl", "selenoid.autotests.cloud/wd/hub");
        String user = System.getProperty("user","user1");
        String password = System.getProperty("password","1234");
        Configuration.remote = "https://" + user + ":" + password + "@" + System.getProperty("remoteBrowser");

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

    }

    @AfterEach
    void addAttachments() {
        AttachAllure.screenshotAs("Last screenshot");
        AttachAllure.pageSource();
        AttachAllure.browserConsoleLogs();
        AttachAllure.addVideo();
        sleep(5000);
        closeWebDriver();
    }
}
