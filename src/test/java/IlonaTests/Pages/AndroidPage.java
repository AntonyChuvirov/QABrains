package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AndroidPage extends BasePage {
    public AndroidPage(WebDriver driver) {
        super(driver);
    }
    public WebElement GooglePlayVisible(){
        return driver.findElement(By.xpath("//img[@alt = 'Google Play']"));
    }
}
