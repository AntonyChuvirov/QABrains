package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfoCenterCheck extends BasePage {
    public InfoCenterCheck(WebDriver driver) {
        super(driver);
    }
    public WebElement InfoCenterVisible(){
        return driver.findElement(By.xpath("//a[contains(text(),'Довідковий центр')]"));
    }
}
