package TestDima.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends BasePage {


    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return $("//input[@id='searchbox']");
    }

    public WebElement getBtnSearch() {
        return $("//input[@id='doSearch']");
    }

    public WebElement getBtnAllCatalogs(){
        return $("//a[@href='/catalog/']");
    }
}
