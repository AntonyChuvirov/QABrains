package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RockBizHomePage extends BasePage {
    public RockBizHomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getInput(){
        return $("//input[@class='form-control input-lg']");
    }
    public WebElement getBtnSearch (){
        return $("//i[@class='fa fa-search']");
    }

    public WebElement otziviRus(){
        return $("//a[text()='Отзывы']");
    }
    public WebElement vidguki(){
        return $("//a[text()='Відгуки']");
    }
    public WebElement getlabelUser(){
        return $("//li[@class='dropdown col-sm-4']");
    }
    public WebElement getBtnRgstr(){
        return $("//a[text()='Реєстрація']");
    }
    public WebElement getAutorization(){
        return $("//a[text()='Авторизація']");
    }
    public WebElement getbtnPirsing(){
        return $("(//a[@class='dropdown-toggle dropdown-img'])[6]");
    }
}
