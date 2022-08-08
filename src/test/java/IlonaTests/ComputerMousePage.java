package IlonaTests;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputerMousePage extends BasePage {
    public ComputerMousePage(WebDriver driver) {
        super(driver);
    }

    public WebElement computerMouseVisible() {
        return driver.findElement(By.xpath("//h1"));
    }
}
