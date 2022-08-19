package Yevgenii.EpicPage;

import Yevgenii.EpicElements.ContraceptivesElements;
import org.openqa.selenium.WebDriver;

public class ContraceptivesPage extends ContraceptivesElements {

    public ContraceptivesPage(WebDriver driver) {
        super(driver);
    }

    public ContraceptivesPage clickBuyContraceptiveBtn() {
        getBuyContraceptiveBtn().click();
        return this;
    }

    public ContraceptivesPage clickRemoveProductBascketBtn() {
        getRemoveProductBascketBtn().click();
        return this;
    }

    public ContraceptivesPage clickСonfirmRemoveProductBascket() {
        getСonfirmRemoveProductBascket().click();
        return this;
    }

    public ContraceptivesPage clickOpenProtuct0Btn() {
        getOpenProtuct0Btn().click();
        return this;
    }

    public ContraceptivesPage clickAddCompareProtuct0Btn() {
        getAddCompareProtuct0Btn().click();
        return this;
    }

    public ContraceptivesPage clickCompareBtn() {
        getCompareBtn().click();
        return this;
    }
}
