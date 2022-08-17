package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPageRB extends BasePage {
    public HeaderPageRB(WebDriver driver) {
        super(driver);
    }
    public WebElement getSuvenir(){
        return $("(//a[@class='dropdown-toggle dropdown-img'])[5]");
    }
    public WebElement getPirsing(){
        return $("(//a[@class='dropdown-toggle dropdown-img'])[6]");
    }
    public WebElement getTextPazl(){
        return $("//a[contains(text(),'Пазли')]");
    }

    public WebElement getVidi(){
        return $("//a[contains(text(),'Види')]");
    }
}
