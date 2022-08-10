package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBasketPage extends BasePage {
    public CheckBasketPage(WebDriver driver) {
        super(driver);
    }
    public WebElement basketVisible(){
        return driver.findElement(By.xpath("//h3[@class = 'modal__heading']"));
    }
    public WebElement basketVisible1(){
        return driver.findElement(By.xpath("//h1[@class = 'cart-page__heading']"));
    }
}
