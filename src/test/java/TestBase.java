import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.sleep;

public class TestBase {

    @BeforeAll
    static void openBrowser() {
        Configuration.baseUrl = "https://www.nokiantyres.ru/";
//        Configuration.browserSize = System.getProperty("size", "1920x1080");
//        Configuration.browser = System.getProperty("browser", "chrome");
//        Configuration.pageLoadTimeout = 80000;
//        Configuration.browserVersion = System.getProperty("version");
        SelenideLogger.addListener("allure", new AllureSelenide());

        //password and user for remote browser
        String user = System.getProperty("user","user1");
        String password = System.getProperty("password","1234");

       DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
        Configuration.remote = "https://" + user + ":" + password + "@" + System.getProperty("remoteBrowser","selenoid.autotests.cloud/wd/hub");

//        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";

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
