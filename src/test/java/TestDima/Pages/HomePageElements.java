package TestDima.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class HomePageElements extends BasePage {
    public HomePageElements(WebDriver driver) {
        super(driver);
    }
    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@id='searchbox']"));
    }
    public WebElement clickSarchBtn() {
        return driver.findElement(By.xpath("//input[@id='doSearch']"));
    }
    public WebElement getResultSearch(){
        return driver.findElement(By.xpath("//div[@class='search__title']"));
    }
}
