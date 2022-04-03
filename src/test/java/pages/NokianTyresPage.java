package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlStartingWith;
import static org.assertj.core.api.Assertions.assertThat;

public class NokianTyresPage {
    private SelenideElement headerTitleGuarantee = $("a[href='/hakka-garanty/']");
    private SelenideElement buttonBayTypes = $("a.button[href='https://marketplace.nokiantyres.ru/products']");
    private SelenideElement linkActivateGuarantee = $x("/html/body/div[3]/div/div[2]/section[3]/div/div/div[3]/p[2]/a");
    private SelenideElement cookieElement = $("#CookieDialog");
    private SelenideElement buttonCookieElement = $("button#cookietd3");
    private SelenideElement headerTitleActivateGuarantee = $(".sale-register__title");
    private SelenideElement linkTireCentre = $("a[href='/hakka-garanty/shinnye-tsentry/']");
    private SelenideElement headerTitlePoint = $("section.hakkaturva-outlets h1");
    private SelenideElement selectorCity = $("#select2-hakka-guarantee-ru-container");
    private SelenideElement inputCity = $(".select2-search__field");
    private SelenideElement resultCity = $("#results");
    private SelenideElement linkCarDealer = $("a[href='/hakka-garanty/avtosalony/']");


    private String headerPage = "Расширенная гарантия на шины Нокиан Тайерс - условия программы в России / Nokian Tyres",
            urlMarketplace = "https://marketplace.nokiantyres.ru/",
            titlePageActivateGuarantee = "АКТИВАЦИЯ ЭЛЕКТРОННОЙ РАСШИРЕННОЙ ГАРАНТИИ",
            titleTireCentre = "Расширенная гарантия Nokian Tyres в шинных центрах",
            activationLinkText = "странице активации",
            titleCarDealer = "Расширенная гарантия Nokian Tyres в автосалонах";

    public NokianTyresPage openPageValidate() {
        open(baseUrl);
        return this;
    }

    public NokianTyresPage goToGuaranteePage() {
        headerTitleGuarantee.click();
        String actualTitle = title();
        assertThat(actualTitle).isEqualTo(headerPage);
        if (cookieElement.exists()) {
            buttonCookieElement.click();
        }
        return this;
    }

    public NokianTyresPage goToMarketplace() {
        buttonBayTypes.click();
        switchTo().window(1);
        webdriver().shouldHave(urlStartingWith(urlMarketplace));
        return this;
    }

    public NokianTyresPage goToActivateGuarantee() {
        linkActivateGuarantee.click();
        switchTo().window(1);
        headerTitleActivateGuarantee.shouldHave(text(titlePageActivateGuarantee));
        return this;
    }

    public NokianTyresPage choiceTireCentre() {
        linkTireCentre.click();
        headerTitlePoint.shouldHave(text(titleTireCentre));
        return this;
    }

    public NokianTyresPage choiceCarDealer() {
        linkCarDealer.click();
        headerTitlePoint.shouldHave(text(titleCarDealer));
        return this;
    }

    public SelenideElement getSelectorCity() {
        return selectorCity;
    }

    public SelenideElement getInputCity() {
        return inputCity;
    }

    public void setInputCity(SelenideElement inputCity) {
        this.inputCity = inputCity;
    }

    public SelenideElement getResultCity() {
        return resultCity;
    }

    public void setResultCity(SelenideElement resultCity) {
        this.resultCity = resultCity;
    }

}
