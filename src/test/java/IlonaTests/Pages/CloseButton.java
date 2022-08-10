package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CloseButton extends BasePage {
    public CloseButton(WebDriver driver) {
        super(driver);
    }
    public WebElement closeTheWindow(){
        return driver.findElement(By.xpath("//button[@class= 'modal__close']"));
    }
}
