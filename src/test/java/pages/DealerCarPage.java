package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DealerCarPage {
    private String urlDealerCar = "https://www.nokiantyres.ru/hakka-garanty/avtosalony/";
    private SelenideElement
            inputCity = $(".select2-search__field"),
            resultCity = $("#results"),
            selectorCity = $("#select2-hakka-guarantee-ru-container");

    public DealerCarPage openPageDealerCar() {
        open(urlDealerCar);
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
