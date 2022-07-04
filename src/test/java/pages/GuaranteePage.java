package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlStartingWith;
import static org.assertj.core.api.Assertions.assertThat;

public class GuaranteePage {
    private SelenideElement
            buttonBayTypes = $("a.button[href='https://marketplace.nokiantyres.ru/products']"),
            linkActivateGuarantee = $x("//p/a[@href='https://activation.nokiantyres.ru/saleRegister/']"),
            headerTitleActivateGuarantee = $(".sale-register__title");

    private String
            headerPage = "Расширенная гарантия на шины Нокиан Тайерс - условия программы в России / Nokian Tyres",
            titlePageActivateGuarantee = "АКТИВАЦИЯ ЭЛЕКТРОННОЙ РАСШИРЕННОЙ ГАРАНТИИ",
            urlMarketplace = "https://marketplace.nokiantyres.ru/",
            urlPageGuarantee = "https://www.nokiantyres.ru/hakka-garanty/";

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
}
