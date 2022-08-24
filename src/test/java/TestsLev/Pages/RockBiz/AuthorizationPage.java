package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthorizationPage extends BasePage {
    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getInputEmail(){
        return waitClickableElement("//input[@id='input-email']");
    }
    public WebElement getInputPassword(){
        return waitClickableElement("//input[@id='input-password']");
    }
    public WebElement getEnter(){
        return waitClickableElement("//input[@class='btn btn-primary']");
    }
}