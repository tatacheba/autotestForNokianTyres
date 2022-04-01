package autotests.tests;

import autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class PerformanceLabWebTests extends TestBase {

    @Test
    @Description("Page title should have header text")
    @DisplayName("Проверка текста заголовка")
    void titleTest() {
        step("Открываем страницу 'https://www.performance-lab.ru'", () ->
            open("https://www.performance-lab.ru"));

        step("Проверяем заголовок страницы", () -> {
            String expectedTitle = "Перфоманс Лаб - Услуги по тестированию программного обеспечения";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("'Services and products' menu check")
    @DisplayName("Проверка меню 'Услуги и продукты'")
    void menuProductsTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
            open("https://www.performance-lab.ru"));

        step("Разворачиваем меню 'Услуги и продукты'", () -> {
            $("#menu-item-317").$(byText("Услуги и продукты")).hover();
        });

        step ("Проверяем видимость пункта 'Тестирование сайта'", () -> {
            $("div[class='full_menu_top']").find(byText("Тестирование сайта")).shouldBe(visible);
        });
    }

    @Test
    @Description("'Vacancies' menu check")
    @DisplayName("Проверка меню 'Вакансии'")
    void menuVacanciesTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
            open("https://www.performance-lab.ru"));

        step("Разворачиваем меню 'Вакансии'", () -> {
            $("#menu-item-1619").$(byText("Вакансии")).hover();
        });

        step ("Проверяем видимость пункта 'Вакансии'", () -> {
            $("div[class='full_menu_top']").find(byText("Вакансии")).shouldBe(visible);
        });
    }

    @Test
    @Description("Menu 'Блог' check")
    @DisplayName("Проверка пункта меню 'Блог'")
     void menuBlogTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
            open("https://www.performance-lab.ru"));

        step("Переходим в 'Блог'", () ->
            $("#menu-item-2613").$(byText("Блог")).click());

        step ("Проверяем открылась ли страница 'Блог'", () -> {
            $("header[class='ee-blog-header']").find(byText("Блог")).shouldBe(visible);
        });
    }

    @Test
    @Description("Phone number check")
    @DisplayName("Проверка соответствия номера телефона '7-495-989-6165'")
    void phoneNumberCheckTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
            open("https://www.performance-lab.ru"));

        step("Проверяем соответствие номера телефона", () -> {
            $(".main-page").$("div[class='phone']").shouldHave(text("7-495-989-6165"));
        });
    }

    @Test
    @Description("Social links should exist")
    @DisplayName("Проверка наличия ссылок социальных сетей")
    void socialLinksShouldExist() {
        step("Открываем страницу 'https://www.performance-lab.ru'", () ->
                open("https://www.performance-lab.ru"));

        step("Проверяем ссылку на facebook.com", () -> {
            $(".usr-social-block").$("a[href*='facebook']").should(exist);
        });
        step("Проверяем ссылку на linkedin.com", () -> {
            $(".usr-social-block").$("a[href*='linkedin']").should(exist);
        });
        step("Проверяем ссылку на twitter.com", () -> {
            $(".usr-social-block").$("a[href*='twitter']").should(exist);
        });
        step("Проверяем ссылку на instagram.com", () -> {
            $(".usr-social-block").$("a[href*='instagram']").should(exist);
        });
        step("Проверяем ссылку на vk.com", () -> {
            $(".usr-social-block").$("a[href*='vk.com']").should(exist);
        });
        step("Проверяем ссылку на youtube.com", () -> {
            $(".usr-social-block").$("a[href*='youtube']").should(exist);
        });
    }

    @Test
    @Description("Site testing button should be clickable")
    @DisplayName("Проверка кнопки 'Сайт' на главной странице")
    void servicesButtonSiteTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
                open("https://www.performance-lab.ru"));

        step("Нажимаем кнопку 'Сайт'", () ->
                $("#site_btn").$(byText("Сайт")).click());

        step("Переходим в открывшуюся вкладку", () -> {
            switchTo().window(1);
        });

        step("Проверяем заголовок страницы", () -> {
            String expectedTitle = "Аудит сайта — юзабилити, нагрузочное тестирование QA City";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Mobile services button should be clickable")
    @DisplayName("Проверка кнопки 'Мобильное приложение' на главной странице")
    void servicesButtonMobileTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
                open("https://www.performance-lab.ru"));

        step("Нажимаем кнопку 'Мобильное приложение'", () ->
            $("#mobile_btn").$(byText("Мобильное приложение")).click());

        step("Проверяем открытие формы", () -> {
            switchTo().frame("hs-form-iframe-0");
            $(byText("Свяжитесь с нами")).shouldBe(visible);
        });
    }

    @Test
    @Description("IT-system services button should be clickable")
    @DisplayName("Проверка кнопки 'IT-система' на главной странице")
    void servicesButtonItSystemTest() {
        step("Открываем страницу https://www.performance-lab.ru", () ->
                open("https://www.performance-lab.ru"));

        step("Нажимаем кнопку 'IT-система'", () ->
            $("#mobile_btn").$(byText("Мобильное приложение")).click());

        step("Проверяем открытие формы", () -> {
            switchTo().frame("hs-form-iframe-0");
            $(byText("Свяжитесь с нами")).shouldBe(visible);
        });
    }

    @Test
    @Description("Page console log should not have errors")
    @DisplayName("Проверка лога консоли на наличие ошибок")
    void consoleShouldNotHaveErrorsTest() {
        step("Открываем страницу 'https://www.performance-lab.ru'", () ->
            open("https://www.performance-lab.ru"));

        step("Лог консоли не должен содержать текст 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}