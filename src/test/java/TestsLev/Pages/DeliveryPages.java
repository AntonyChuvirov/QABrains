package TestsLev.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeliveryPages extends BasePage {
    public DeliveryPages(WebDriver driver) {
        super(driver);
    }
    public WebElement linkNP(){
        return driver.findElement(By.xpath("(//a[@class='nofollow'])[1]"));
    }
}
