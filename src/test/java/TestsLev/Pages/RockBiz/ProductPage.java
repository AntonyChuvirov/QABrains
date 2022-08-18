package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getSize(){
        return $("//span[text()='XL']");
    }
    public WebElement buy(){
        return $("//button[@id='button-cart-product']");
    }
}
