package TestsLev.Pages.Japan;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JapanHomePage extends BasePage {

    public JapanHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearch(){
        return waitClickableElement("//input[@id='search']");
    }
    public WebElement getParts(){
        return waitClickableElement("(//a[@href='https://japan-ukraine.com/ua/makita-parts.php'])[1]");
    }
    public WebElement getBolgarki(){
        return waitClickableElement("//a[text() = 'Болгарки']");
    }
    public WebElement getNewProduct(){
        return waitClickableElement("//a[text()='Новинки']");
    }
    public WebElement allParts(){
        return waitClickableElement("(//a[@href='https://japan-ukraine.com/ua/makita-parts.php'])[2]");
    }
    public WebElement getLobziki(){
        return waitClickableElement("//a[text() = 'Лобзики']");
    }
    public WebElement getPili(){
        return waitClickableElement("//a[text() = 'Пили']");
    }

    public WebElement getLinkMetabo(){
        return driver.findElement(By.xpath("//a[@href='https://metabo-ukraine.com']"));
    }
}