package Yevgenii.FlagmanElements;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlagEholotElements extends BasePage {

    public FlagEholotElements(WebDriver driver){
        super(driver);
    }

    public WebElement clickEholotBtn(){
        return $("//a[text()='Ехолоти']");
    }

    public WebElement clickSortingEholotBtn(){
        return $("//div[contains(@class,'hidden-xs')]//child::select");
    }

    public WebElement clickCompareBtn(){
        return $("//div[contains(@goods-data-gtm, 'Lucky FF 518')]//child::ul/li[@name='compare_details']");
    }

    public WebElement getResaultCompareBtn(){
        return $("//span[@class='compare-count']");
    }

    public WebElement getBasketBtn(){
        return $("//i[@onmousedown='try { rrApi.addToBasket(248992) } catch(e) {}']");
    }

    public WebElement getVisibleBasket(){
        return $("//h1[@class='popup-title']");
    }
}
