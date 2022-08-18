package TestDima.PromPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElementsPromUa extends BasePage {
    public HomePageElementsPromUa(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField(){
        return $("//input[@class='Dm7py']");
    }


    public WebElement getBtnSearch(){
        return $("//button[@class='VS-Ex yNx5B YY-wN vtaL- gPzcS _4msv1 blBdq aUEOj _3-Fnr Ly27e']");
    }
}
