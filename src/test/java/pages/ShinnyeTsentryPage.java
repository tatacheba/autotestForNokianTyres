package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ShinnyeTsentryPage {
    private String urlTyresServices = "https://www.nokiantyres.ru/hakka-garanty/shinnye-tsentry/";
    private SelenideElement
            inputCity = $(".select2-search__field"),
            resultCity = $("#results"),
            selectorCity = $("#select2-hakka-guarantee-ru-container");

    public ShinnyeTsentryPage openPageShinnyeTsentry() {
        open(urlTyresServices);
        return this;
    }

    public SelenideElement getInputCity() {
        return inputCity;
    }

    public SelenideElement getResultCity() {
        return resultCity;
    }

    public SelenideElement getSelectorCity() {
        return selectorCity;
    }
}
