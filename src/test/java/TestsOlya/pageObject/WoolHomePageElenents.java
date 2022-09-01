package TestsOlya.pageObject;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarmadeHomePageElenents extends BasePage {

    public MarmadeHomePageElenents(WebDriver driver) {
        super(driver);}

        public WebElement getCreateAccount() {
            return driver.findElement(By.xpath("//a[@class='userbar__button __active']"));}
    public WebElement getClickRegistration() {return waitClickableElement("//span[@class='login-tabs-txt']");}
    public WebElement getClickEmail(){return waitClickableElement("//input[@name='user[email]']");}
    public WebElement getClickName(){return waitClickableElement("//input[@name='user[title]']");}
    public WebElement getClickPass(){return waitClickableElement("//input[@name='user[pass]");}


}
