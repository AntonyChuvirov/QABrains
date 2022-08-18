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
}
