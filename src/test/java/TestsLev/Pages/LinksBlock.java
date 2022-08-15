package TestsLev.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksBlock extends BasePage {
    public LinksBlock(WebDriver driver) {
        super(driver);
    }
    public WebElement getLinkMetabo(){
        return driver.findElement(By.xpath("//a[@href='https://metabo-ukraine.com']"));
    }
    public WebElement getLinkBosch(){
        return driver.findElement(By.xpath("//a[@href='https://bosch-kiev.com']"));
    }
    public WebElement getLinkDewalt(){
        return driver.findElement(By.xpath("//a[@href='https://dw-ukraine.com']"));
    }
    public WebElement getLinkOleomac(){
        return driver.findElement(By.xpath("https://oleo-mac-ukraine.com"));
    }
}
