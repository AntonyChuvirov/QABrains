package TestsLev.Pages.Japan;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeliveryPage extends BasePage {
    public DeliveryPage(WebDriver driver) {
        super(driver);
    }
    public WebElement linkNP(){
        return waitClickableElement("(//a[@class='nofollow'])[1]");
    }
}
