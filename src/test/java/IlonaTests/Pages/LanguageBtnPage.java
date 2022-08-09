package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LanguageBtnPage extends BasePage {
    public LanguageBtnPage(WebDriver driver) {
        super(driver);
    }
    public void changeTheLanguage(){
        driver.findElement(By.xpath(" //li[@class = 'lang__item __item ng-star-inserted']//a[@class = 'lang__link ng-star-inserted']")).click();
    }
}
