package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getName() {
        return waitClickableElement("//input[@id='register_firstname']");
    }

    public WebElement getLastName() {
        return waitClickableElement("//input[@id='register_lastname']");
    }
    public WebElement getPhone() {
        return waitClickableElement("//input[@id='register_telephone']");
    }
    public WebElement getEmail() {
        return waitClickableElement("//input[@id='register_email']");
    }
    public WebElement getPassword() {
        return waitClickableElement("//input[@id='register_password']");
    }
    public WebElement getCountry() {
        return waitClickableElement("//select[@id='register_country_id']");
    }
    public WebElement chooseContry() {
        return waitClickableElement("//option[text()='Україна']");
    }
    public WebElement getRigion() {
        return waitClickableElement("//select[@id='register_zone_id']");
    }
    public WebElement chooseRigion() {
        return waitClickableElement("//option[text()='Київська']");
    }
    public WebElement getCity() {
        return waitClickableElement("//select[@id='register_city']");
    }
    public WebElement chooseCity() {
        return waitClickableElement("//option[text()='Київ']");
    }
    public WebElement btnContiniue() {
        return waitClickableElement("//span[text()='Продовжити']");
    }
}