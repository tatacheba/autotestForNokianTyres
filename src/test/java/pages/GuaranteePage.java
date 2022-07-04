package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlStartingWith;
import static org.assertj.core.api.Assertions.assertThat;

public class GuaranteePage {
    private SelenideElement buttonBayTypes = $("a.button[href='https://marketplace.nokiantyres.ru/products']"),
            selectorCity = $("#select2-hakka-guarantee-ru-container"),
            inputCity = $(".select2-search__field"),
            resultCity = $("#results"),
            linkCarDealer = $("a[href='/hakka-garanty/avtosalony/']"),
            linkActivateGuarantee = $x("//p/a[@href='https://activation.nokiantyres.ru/saleRegister/']"),
            linkTireCentre = $("a[href='/hakka-garanty/shinnye-tsentry/']"),
            headerTitlePoint = $("section.hakkaturva-outlets h1");
    public SelenideElement headerTitleActivateGuarantee = $(".sale-register__title");

    private String headerPage = "Расширенная гарантия на шины Нокиан Тайерс - условия программы в России / Nokian Tyres",
            titlePageActivateGuarantee = "АКТИВАЦИЯ ЭЛЕКТРОННОЙ РАСШИРЕННОЙ ГАРАНТИИ",
            urlMarketplace = "https://marketplace.nokiantyres.ru/",
            urlPageGuarantee = "https://www.nokiantyres.ru/hakka-garanty/",
            titleTyreCenter = "Расширенная гарантия Nokian Tyres в шинных центрах",
            titleCarDealer = "Расширенная гарантия Nokian Tyres в автосалонах";


    public GuaranteePage openPageGuarantee() {
        open(urlPageGuarantee);
        return this;
    }

    public GuaranteePage goToMarketplace() {
        buttonBayTypes.click();
        return this;
    }

    public GuaranteePage goToActivateGuarantee() {
        linkActivateGuarantee.click();
        return this;
    }

    public GuaranteePage checkTitleGuaranteePage() {
        String actualTitle = title();
        assertThat(actualTitle).isEqualTo(headerPage);
        return this;
    }

    public GuaranteePage checkTitleActivateGuaranteePage() {
        headerTitleActivateGuarantee.shouldHave(text(titlePageActivateGuarantee));
        return this;
    }

    public GuaranteePage checkUrlMarketplace() {
        webdriver().shouldHave(urlStartingWith(urlMarketplace));
        return this;
    }

    public GuaranteePage choiceTyreCentre() {
        linkTireCentre.click();
        headerTitlePoint.shouldHave(text(titleTyreCenter));
        return this;
    }

    public GuaranteePage choiceCarDealer() {
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

    public SelenideElement getResultCity() {
        return resultCity;
    }
}
