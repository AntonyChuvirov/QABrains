package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckPageMakeOrder extends BasePage {
    public CheckPageMakeOrder(WebDriver driver) {
        super(driver);
    }
    public WebElement checkMakeOrderVisible(){
        return waitClickableElement("//h1");
    }
}
