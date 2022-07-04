import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.DealerCarPage;
import pages.GuaranteePage;
import pages.MainPage;
import pages.ShinnyeTsentryPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class WebTests extends TestBase {
    MainPage mainPage = new MainPage();
    GuaranteePage guaranteePage = new GuaranteePage();
    ShinnyeTsentryPage tyresServicesPage = new ShinnyeTsentryPage();
    DealerCarPage dealerCarPage = new DealerCarPage();

    @Test
    @DisplayName("Проверка перехода на страницу 'Расширенная гарантия' с главной страницы")
    void checkOpenPageGuarantee() {
        step("Открыть страницу 'https://www.nokiantyres.ru/'", () -> {
            mainPage.openPage();
        });
        step("Перейти на страницу 'Расширенные гарантии'", () -> {
            mainPage.goToGuaranteePage();
        });
        step("Проверка тайтла страницы", () -> {
            guaranteePage.checkTitleGuaranteePage();
        });
    }

    @Test
    @DisplayName("Проверка перехода на страницу интернет-магазина со страницы 'Расширенная гарантия'")
    void checkOpenPageMarketplace() {
        step("Перейти на страницу 'Расширенные гарантии'", () -> {
            guaranteePage.openPageGuarantee();
        });
        step("Перейти на страницу интернет-магазина https://marketplace.nokiantyres.ru/", () -> {
            guaranteePage.goToMarketplace();
        });
        step("Проверка url страницы", () -> {
            switchTo().window(1);
            guaranteePage.checkUrlMarketplace();
        });
    }

    //    @Disabled
    @Test
    @DisplayName("Проверка перехода на страницу 'Активация гарантии'//Skipped Test")
    void checkOpenPageActivateGuarantee() {
        step("Перейти на страницу 'Расширенные гарантии'", () -> {
            guaranteePage.openPageGuarantee();
        });
        step("Нажать на ссылку активации гарантии в блоке 'АКТИВИРУЙТЕ ГАРАНТИЮ'", () -> {
            guaranteePage.goToActivateGuarantee();
        });
        step("Проверка тайтла страницы", () -> {
            switchTo().window(1);
            guaranteePage.checkTitleActivateGuaranteePage();
        });
    }

    @CsvSource(value = {
            "Специально для Failed Test", "Димитровград", "Унеча"})
    @ParameterizedTest(name = "Проверка выбора города шинных центров {0}")
    void checkChoiceTyresCity(String city) {
        step("Перейти на страницу выбора шинных центров", () -> {
            tyresServicesPage.openPageShinnyeTsentry();
        });
        step("Выбор шинного центра", () -> {
            tyresServicesPage.getSelectorCity().click();
            tyresServicesPage.getInputCity().setValue(city).pressEnter();
        });
        step("Проверка выбранного шинного центра ", () -> {
            tyresServicesPage.getResultCity().shouldHave(text(city));
        });
    }

    @CsvSource(value = {
            "Иваново", "Пермь", "Специально для Failed Test"})
    @ParameterizedTest(name = "Проверка выбора города автосалонов {0}")
    void checkChoiceCarDealer(String city) {
        step("Перейти на страницу выбора автосалонов", () -> {
            dealerCarPage.openPageDealerCar();
        });
        step("Выбор автосалона", () -> {
            dealerCarPage.getSelectorCity().click();
            dealerCarPage.getInputCity().setValue(city).pressEnter();
        });
        step("Проверка выбранного автосалона ", () -> {
            dealerCarPage.getResultCity().shouldHave(text(city));
        });
    }
}
