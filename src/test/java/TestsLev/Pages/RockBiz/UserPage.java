package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserPage extends BasePage {
    public UserPage(WebDriver driver) {
        super(driver);
    }
    public WebElement finish(){
        return waitClickableElement("//a[text()='Продовжити']");
    }
}