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
        return $("//a[text()='Ехолоти']");
    }

    public WebElement clickSortingEholotBtn() {
        return $("//div[contains(@class,'hidden-xs')]//child::select");
    }

    public WebElement clickCompareBtn() {
        return $("//div[contains(@goods-data-gtm, 'Lucky FF 518')]//child::ul/li[@name='compare_details']");
    }

    public WebElement getResaultCompareBtn() {
        return $("//span[@class='compare-count']");
    }

    public WebElement getBasketBtn() {
        return $("//i[@onmousedown='try { rrApi.addToBasket(248992) } catch(e) {}']");
    }

    public WebElement getVisibleBasket() {
        return $("//h1[@class='popup-title']");
    }

    public WebElement getEholotLackyBtn() {
        return $("//a[contains(text(),'Lucky FF 518')]");
    }

    public List<WebElement> getManufacturerProductFilter() {
        return waitVisibilityOfAllElements("//ul[@id='sort_producer']//span[@class='checkbox-custom']");
    }

    public List<WebElement> getVisibilityListProductsLowrance() {
        return waitVisibilityOfAllElements("//div[contains(@goods-data-gtm,'Lowrance')]");
    }
}
