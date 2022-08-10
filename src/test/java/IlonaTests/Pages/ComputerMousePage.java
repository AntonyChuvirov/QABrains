package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputerMousePage extends BasePage {
    public ComputerMousePage(WebDriver driver) {
        super(driver);
    }
    public WebElement clickComputerMouse(){
        return driver.findElement(By.xpath("//a[@title = 'Миша Logitech M185 Wireless Grey (910-002238/910-002235)']"));
    }

    public WebElement computerMouseVisible() {
        return driver.findElement(By.xpath("//h1"));
    }
}
