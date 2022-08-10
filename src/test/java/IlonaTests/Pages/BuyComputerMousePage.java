package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyComputerMousePage extends BasePage {
    public BuyComputerMousePage(WebDriver driver) {
        super(driver);
    }
    public WebElement clickOnBtnBuy(){
        return driver.findElement(By.xpath("//span[@class = 'buy-button__label ng-star-inserted' or @title = 'Купити'][1]"));
    }
}
