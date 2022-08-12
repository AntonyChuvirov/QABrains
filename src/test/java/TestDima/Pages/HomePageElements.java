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

    public WebElement getBtnCleanDivision(){
        return driver.findElement(By.xpath("//a[@href='#']"));
    }

    public WebElement getBtnAddedToDivision(){
        return driver.findElement(By.xpath("//span[text()='Порівняння']"));

    }

    public WebElement getSearchBtn() {
        return driver.findElement(By.xpath("//input[@id='doSearch']"));
    }

    public WebElement getResultSearch() {
        return driver.findElement(By.xpath("//div[@class='search__title']"));
    }

    public WebElement showProductNullInDivision(){
        return driver.findElement(By.xpath("//div[contains(text(),'Ваш список \"Порівняння\" порожній.')]"));
    }

    public WebElement showProductInDivision(){
        return driver.findElement(By.xpath("//a[contains(text(),'Очистити список \"Порівняння\"')]"));
    }
}
