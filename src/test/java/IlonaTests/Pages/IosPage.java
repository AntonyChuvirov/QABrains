package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IosPage  extends BasePage {
    public IosPage(WebDriver driver) {
        super(driver);
    }
    public WebElement AppleStoreVisible(){
        return driver.findElement(By.xpath("//span[contains(text(),'Preview')]"));
    }
}
