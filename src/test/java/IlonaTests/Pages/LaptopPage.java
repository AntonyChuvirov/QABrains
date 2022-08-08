package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LaptopPage extends BasePage {
    public LaptopPage(WebDriver driver) {
        super(driver);
    }
    public WebElement chooseLaptop(){
        return driver.findElement(By.xpath("//img[@alt = 'Ноутбуки']"));
    }
}
