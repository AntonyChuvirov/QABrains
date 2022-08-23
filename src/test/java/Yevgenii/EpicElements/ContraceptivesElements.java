package Yevgenii.EpicElements;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ContraceptivesElements extends BasePage {

    public ContraceptivesElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getBuyContraceptiveBtn() {
        return waitClickableElement("//button[@data-card-params='304567, ,1']");
    }

    public WebElement getSeeProductAddedBascket() {
        return waitClickableElement("//button[contains(text(),'Оформити покупку')]");
    }

    public WebElement selectBuyContraceptiveBtn() {
        return waitClickableElement("//div[@data-search-index='2']");
    }

    public WebElement getRemoveProductBascketBtn() {
        return waitClickableElement("//a[@id='js-trigger-del']");
    }

    public WebElement getСonfirmRemoveProductBascket() {
        return waitClickableElement("//button[@class='btn btn--white']");
    }

    public WebElement getVisibilityRemoveProductBascket() {
        return waitClickableElement("//p[contains(text(),'Ваш кошик порожній')]");
    }

    public WebElement getOpenProtuct0Btn() {
        return waitClickableElement("//div[@data-search-index='0']");
    }

    public WebElement getAddCompareProtuct0Btn() {
        return waitClickableElement("//button[@data-text='До порівняння']");
    }

    public WebElement getCompareBtn() {
        return waitClickableElement("//span[@class='header__compare-link-icon']");
    }

    public List<WebElement> getSortingBtns() {
        return waitVisibleOfAllElements("//a[@class='btnFiltr changeFilterUrl']");
    }

    public WebElement getSeeProductСheap() {
        return waitClickableElement("//p[@id='price6898348']");
    }
}
