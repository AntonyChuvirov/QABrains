package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickOnBtnBasketPage extends BasePage {
    public ClickOnBtnBasketPage(WebDriver driver) {
        super(driver);
    }
    public WebElement clickOnBasket(){
        return driver.findElement(By.xpath("//span[contains(text(),'В кошику')]"));
    }
}
