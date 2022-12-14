package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage {
    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSuvenir() {
        return waitClickableElement("(//a[@class='dropdown-toggle dropdown-img'])[5]");
    }

    public WebElement getPirsing() {
        return waitClickableElement("(//a[@class='dropdown-toggle dropdown-img'])[6]");
    }

    public WebElement getTextPazl() {
        return waitClickableElement("//a[contains(text(),'Пазли')]");
    }

    public WebElement getVidi() {
        return waitClickableElement("//a[contains(text(),'Види')]");
    }

    public WebElement getLinkInstagram() {
        return waitClickableElement("//a[@href='https://www.instagram.com/rockwaybiz/']");
    }

    public WebElement getLinkFacebook() {
        return waitClickableElement("//i[@class='fab fa-facebook-square']");
    }

    public WebElement getTelegram() {
        return waitClickableElement("//i[@class='fab fa-telegram-plane']");
    }

    public WebElement getPhones() {
        return waitClickableElement("//i[@class='fas fa-mobile-alt dropdown-toggle social']");
    }

    public WebElement phoneNumber() {
        return waitClickableElement("//li[@class='header_phone1']");
    }

    public WebElement getLenguageBtn() {
        return waitClickableElement("//div[@id='form-language']");
    }

    public WebElement getRusLenguage() {
        return waitClickableElement("(//button[@class='btn btn-link btn-block language-select'])[2]");
    }

    public WebElement getUaLenguage() {
        return waitClickableElement("(//button[@class='btn btn-link btn-block language-select'])[1]");
    }

    public WebElement getVzuttya() {
        return waitClickableElement("(//a[@class='dropdown-toggle dropdown-img'])[3]");
    }

    public WebElement getClothes() {
        return waitClickableElement("(//a[@class='dropdown-toggle dropdown-img'])[2]");
    }

    public WebElement getTShirt() {
        return waitClickableElement("//a[text()='Футболки']");
    }
}