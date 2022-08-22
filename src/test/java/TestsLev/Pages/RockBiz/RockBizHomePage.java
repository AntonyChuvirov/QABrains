package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RockBizHomePage extends BasePage {
    public RockBizHomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getInput(){
        return waitClickableElement("//input[@class='form-control input-lg']");
    }
    public WebElement getBtnSearch (){
        return waitClickableElement("//i[@class='fa fa-search']");
    }

    public WebElement otziviRus(){
        return waitClickableElement("//a[text()='Отзывы']");
    }
    public WebElement vidguki(){
        return waitClickableElement("//a[text()='Відгуки']");
    }
    public WebElement getlabelUser(){
        return waitClickableElement("//li[@class='dropdown col-sm-4']");
    }
    public WebElement getBtnRgstr(){
        return waitClickableElement("//a[text()='Реєстрація']");
    }
    public WebElement getAutorization(){
        return waitClickableElement("//a[text()='Авторизація']");
    }
    public WebElement getbtnPirsing(){
        return waitClickableElement("(//a[@class='dropdown-toggle dropdown-img'])[6]");
    }

}
