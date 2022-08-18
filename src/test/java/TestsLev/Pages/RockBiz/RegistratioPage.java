package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistratioPage extends BasePage {
    public RegistratioPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getName() {
        return $("//input[@id='register_firstname']");
    }

    public WebElement getLastName() {
        return $("//input[@id='register_lastname']");
    }
    public WebElement getPhone() {
        return $("//input[@id='register_telephone']");
    }
    public WebElement getEmail() {
        return $("//input[@id='register_email']");
    }
    public WebElement getPassword() {
        return $("//input[@id='register_password']");
    }
    public WebElement getCountry() {
        return $("//select[@id='register_country_id']");
    }
    public WebElement chooseContry() {
        return $("//option[text()='Україна']");
    }
    public WebElement getRigion() {
        return $("//select[@id='register_zone_id']");
    }
    public WebElement chooseRigion() {
        return $("//option[text()='Київська']");
    }
    public WebElement getCity() {
        return $("//select[@id='register_city']");
    }
    public WebElement chooseCity() {
        return $("//option[text()='Київ']");
    }
    public WebElement btnContiniue() {
        return $("//span[text()='Продовжити']");
    }
}
