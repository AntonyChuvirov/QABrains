package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPageRB extends BasePage {
    public HeaderPageRB(WebDriver driver) {
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

    public WebElement getLinks() {
        return waitClickableElement("//a[@href='https://www.instagram.com/rockwaybiz/']");
    }

    public WebElement getLenguageBtn(){
        return waitClickableElement("//div[@id='form-language']");
    }

    public WebElement getRusLenguage(){
        return waitClickableElement("(//button[@class='btn btn-link btn-block language-select'])[2]");
    }
    public WebElement getUaLenguage(){
        return waitClickableElement("(//button[@class='btn btn-link btn-block language-select'])[1]");
    }

    public WebElement getVzuttya(){
        return waitClickableElement("(//a[@class='dropdown-toggle dropdown-img'])[3]");
    }

    public WebElement getClothes(){
        return waitClickableElement("(//a[@class='dropdown-toggle dropdown-img'])[2]");
    }
    public WebElement getTShirt(){
        return waitClickableElement("//a[text()='Футболки']");
    }
}

