package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ComputerMousePage extends BasePage {
    public ComputerMousePage(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> clickComputerMouse(){
        return driver.findElements(By.xpath("//div[@data-tile='small']"));
    }


    public WebElement computerMouseVisible() {
        return driver.findElement(By.xpath("//h1"));
    }
}
