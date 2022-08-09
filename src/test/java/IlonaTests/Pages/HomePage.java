package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getSearchField() {

        return driver.findElement(By.xpath("//input[@name = 'search']"));
    }
    public void clickTheBtnCatalog(){
        driver.findElement(By.xpath("//*[@id = 'fat-menu']")).click();
    }
    public WebElement clickTheBtnOpenMenu(){
        return driver.findElement(By.xpath("//button[@class = 'header__button ng-tns-c94-1']"));
    }
}




