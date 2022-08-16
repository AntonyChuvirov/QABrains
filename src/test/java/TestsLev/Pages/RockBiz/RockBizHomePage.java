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
}
