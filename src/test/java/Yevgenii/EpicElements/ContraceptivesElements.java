package Yevgenii.EpicElements;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContraceptivesElements extends BasePage {

    public ContraceptivesElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getBuyContraceptiveBtn() {
        return $("//button[@data-card-params='304564, ,1']");
    }

    public WebElement getSeeProductAddedBascket() {
        return $("//button[contains(text(),'Оформити покупку')]");
    }

    public WebElement selectBuyContraceptiveBtn() {
        return $("//div[@data-search-index='2']");
    }

    public WebElement getRemoveProductBascketBtn() {
        return $("//a[@id='js-trigger-del']");
    }

    public WebElement getСonfirmRemoveProductBascket() {
        return $("//button[@class='btn btn--white']");
    }

    public WebElement getVisibilityRemoveProductBascket() {
        return $("//p[contains(text(),'Ваш кошик порожній')]");
    }
}
