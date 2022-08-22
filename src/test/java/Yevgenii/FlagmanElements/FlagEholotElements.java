package Yevgenii.FlagmanElements;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class FlagEholotElements extends BasePage {

    public FlagEholotElements(WebDriver driver) {
        super(driver);
    }

    public WebElement clickEholotBtn() {
        return waitClickableElement("//a[text()='Ехолоти']");
    }

    public WebElement clickSortingEholotBtn() {
        return waitClickableElement("//div[contains(@class,'hidden-xs')]//child::select");
    }

    public WebElement clickCompareBtn() {
        return waitClickableElement("//div[contains(@goods-data-gtm, 'Lucky FF 518')]//child::ul/li[@name='compare_details']");
    }

    public WebElement getResaultCompareBtn() {
        return waitClickableElement("//span[@class='compare-count']");
    }

    public WebElement getBasketBtn() {
        return waitClickableElement("//i[@onmousedown='try { rrApi.addToBasket(248992) } catch(e) {}']");
    }

    public WebElement getVisibleBasket() {
        return waitClickableElement("//h1[@class='popup-title']");
    }

    public WebElement getEholotLackyBtn() {
        return waitClickableElement("//a[contains(text(),'Lucky FF 518')]");
    }

    public List<WebElement> getManufacturerProductFilter() {
        return waitVisibleOfAllElements("//ul[@id='sort_producer']//span[@class='checkbox-custom']");
    }

    public List<WebElement> getVisibilityListProductsLowrance() {
        return waitVisibleOfAllElements("//div[contains(@goods-data-gtm,'Lowrance')]");
    }
}
