package TestsLev.Pages.Japan;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageProducts extends BasePage {
    public PageProducts(WebDriver driver) {
        super(driver);
    }
    public WebElement getBuy(){
        return $("(//a[text()='Купить'])[1]");

    }
}
