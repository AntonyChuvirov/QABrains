package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPageRB extends BasePage {
    public HeaderPageRB(WebDriver driver) {
        super(driver);
    }

    public WebElement getSuvenir() {
        return $("(//a[@class='dropdown-toggle dropdown-img'])[5]");
    }

    public WebElement getPirsing() {
        return $("(//a[@class='dropdown-toggle dropdown-img'])[6]");
    }

    public WebElement getTextPazl() {
        return $("//a[contains(text(),'Пазли')]");
    }

    public WebElement getVidi() {
        return $("//a[contains(text(),'Види')]");
    }

    public WebElement getLinks() {
        return $("//a[@href='https://www.instagram.com/rockwaybiz/']");
    }

    public WebElement getLenguageBtn(){
        return $("//div[@id='form-language']");
    }

    public WebElement getRusLenguage(){
        return $("(//button[@class='btn btn-link btn-block language-select'])[2]");
    }
    public WebElement getUaLenguage(){
        return $("(//button[@class='btn btn-link btn-block language-select'])[1]");
    }

    public WebElement getVzuttya(){
        return $("(//a[@class='dropdown-toggle dropdown-img'])[3]");
    }
}

