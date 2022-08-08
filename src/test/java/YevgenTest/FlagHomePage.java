package YevgenTest;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlagHomePage extends BasePage {
    public FlagHomePage(WebDriver driver){
        super(driver);
    }

    public void checkLanguageRu(){
        driver.findElement(By.xpath("//a[contains(text(),'Рус')]")).click();
    }
    public void checkLanguageUa(){
        driver.findElement(By.xpath("//a[contains(text(),'Укр')]")).click();
    }
}
