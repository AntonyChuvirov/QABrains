package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CurrentLaptopPage extends BasePage {
    public CurrentLaptopPage(WebDriver driver) {
        super(driver);
    }
    public WebElement informationALaptop(){
        return driver.findElement(By.xpath("//h1[@class = 'product__title']"));
    }
}
