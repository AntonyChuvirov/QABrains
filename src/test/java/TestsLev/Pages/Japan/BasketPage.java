package TestsLev.Pages.Japan;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage extends BasePage {
    public BasketPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getDelProduct(){
        return waitClickableElement("(//a[@class='delete_item'])[1]");
    }

}
