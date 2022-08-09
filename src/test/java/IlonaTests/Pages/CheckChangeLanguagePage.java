package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckChangeLanguagePage extends BasePage {
    public CheckChangeLanguagePage(WebDriver driver) {
        super(driver);
    }
    public WebElement ChangeLang(){
        return driver.findElement(By.xpath("//*[contains(text(),'Акционные предложения')]"));
    }
}
