package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpWindowPage extends BasePage {
    public PopUpWindowPage(WebDriver driver) {
        super(driver);
    }
    public WebElement clickInfoBtn(){
        return driver.findElement(By.xpath("//a[contains(text(),' Довідковий центр ')]"));
    }
    public WebElement clickAppBtnAndroid(){
        return driver.findElement(By.xpath("//a[@aria-label = 'Додаток для Android']"));
    }
    public WebElement clickAppBtnIos(){
        return driver.findElement(By.xpath("//a[@aria-label = 'Додаток для iOS']"));
    }
}
