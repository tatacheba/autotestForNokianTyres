package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private SelenideElement headerTitleGuarantee = $("a[href='/hakka-garanty/']"),
            cookieElement = $("#CookieDialog"),
            buttonCookieElement = $("button#cookietd3");

    public MainPage openPage() {
        open(baseUrl);
        if (cookieElement.exists()) {
            buttonCookieElement.click();
        }
        return this;
    }

    public MainPage goToGuaranteePage() {
        headerTitleGuarantee.click();
        return this;
    }
}
