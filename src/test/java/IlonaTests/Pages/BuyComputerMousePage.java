package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyComputerMousePage extends BasePage {
    public BuyComputerMousePage(WebDriver driver) {
        super(driver);
    }

    public WebElement clickOnBtnBuy() {
        return waitClickableElement("//div[@class = 'product-trade ng-star-inserted']//button[@aria-label = 'Купити']");
    }
}