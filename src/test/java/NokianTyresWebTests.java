import io.qameta.allure.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.NokianTyresPage;

import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class NokianTyresWebTests extends TestBase {
    NokianTyresPage ntpage = new NokianTyresPage();

    @Test
    @Description("Page title should have header text 'Расширенная гарантия'")
    @DisplayName("Переход на страницу 'Расширенная гарантия'")
    void openPageGuarantee() {

        step("Открыть страницу 'https://www.nokiantyres.ru/'", () -> ntpage.openPageValidate());

        step("Перейти на страницу 'Расширенные гарантии'", () -> ntpage.goToGuaranteePage());

    }


    @Test
    @Description("Go to the online store page https://marketplace.nokiantyres.ru/")
    @DisplayName("Переход на страницу https://marketplace.nokiantyres.ru/ со страницы 'Расширенная гарантия'")
    void openPageMarketplace() {

        step("Открыть страницу 'https://www.nokiantyres.ru/'", () -> ntpage.openPageValidate());

        step("Перейти на страницу 'Расширенные гарантии'", () -> ntpage.goToGuaranteePage());

        step("Перейти на страницу интернет-магазина https://marketplace.nokiantyres.ru/", () -> ntpage.goToMarketplace());
    }


    @Test
    @Description("Go to the 'Активация гарантии' page")
    @DisplayName("Переход на страницу 'Активация гарантии'")
    void openPageActivateGuarantee() {
        step("Открыть страницу 'https://www.nokiantyres.ru/'", () -> ntpage.openPageValidate());

        step("Перейти на страницу 'Расширенные гарантии'", () -> ntpage.goToGuaranteePage());

        step("Нажать на ссылку активации гарантии в блоке 'АКТИВИРУЙТЕ ГАРАНТИЮ'", () -> ntpage.goToActivateGuarantee());

    }


    @CsvSource(value = {
            "Ангарск",
            "Димитровград",
            "Унеча"
    })
    @Description("Сhoice of tire centers")
    @ParameterizedTest(name = "Выбор города шинных центров {0}")
    void choiceCity(String city) {
        step("Открыть страницу 'https://www.nokiantyres.ru/'", () -> ntpage.openPageValidate());
        step("Перейти на страницу 'Расширенные гарантии'", () -> ntpage.goToGuaranteePage());
        step("Выбор шинного центра '", () -> {
            ntpage.choiceTireCentre();
            ntpage.getSelectorCity().click();
            ntpage.getInputCity().setValue(city).pressEnter();
            ntpage.getResultCity().shouldHave(text(city));
        });
    }

    @CsvSource(value = {
            "Иваново", "Пермь", "Яблоновский"})
    @Description("Сhoice of Car Dealer")
    @ParameterizedTest(name = "Выбор города автосалонов {0}")
    void choiceCarDealer(String city) {
        step("Открыть страницу 'https://www.nokiantyres.ru/'", () -> ntpage.openPageValidate());
        step("Перейти на страницу 'Расширенные гарантии'", () -> ntpage.goToGuaranteePage());
        step("Выбор автосалона ", () -> {
            ntpage.choiceCarDealer();
            ntpage.getSelectorCity().click();
            ntpage.getInputCity().setValue(city).pressEnter();
            ntpage.getResultCity().shouldHave(text(city));
        });
    }
}
