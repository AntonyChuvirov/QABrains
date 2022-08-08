package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickLaptopPage extends BasePage {
    public ClickLaptopPage(WebDriver driver) {
        super(driver);
    }
    public WebElement runToLaptop(){
        return driver.findElement(By.xpath("//a[@title = 'Ноутбук ASUS ExpertBook B1 B1500CEAE-BQ1663 (90NX0441-M20230) Star Black / Intel Core i3-1115G4 / RAM 8 ГБ / SSD 256 ГБ']"));
    }
}
