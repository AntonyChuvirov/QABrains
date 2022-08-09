package YevgenTest.PageObjects;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlagHomePage extends BasePage {

    public FlagHomePage(WebDriver driver){
        super(driver);
    }

    public void navigateFlagman(){
        driver.get("https://www.flagman.kiev.ua/");
    }

    public WebElement getElementSearchString(){
        return driver.findElement(By.xpath("//input[@id='search-text']"));
    }

    public void checkLanguageRu(){
        driver.findElement(By.xpath("//a[contains(text(),'Рус')]")).click();
    }
    public void checkLanguageUa(){
        driver.findElement(By.xpath("//a[contains(text(),'Укр')]")).click();
    }
}
