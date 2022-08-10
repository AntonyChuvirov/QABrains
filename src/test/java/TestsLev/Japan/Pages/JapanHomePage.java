package TestsLev.Japan.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JapanHomePage extends BasePage {

    public JapanHomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getBtnAkcii(){
        return driver.findElement(By.xpath("//span[@class='glyphicons glyphicons-ok']"));
    }
}
