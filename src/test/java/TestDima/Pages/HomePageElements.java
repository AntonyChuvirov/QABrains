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
        return $("//input[@id='searchbox']");
    }

    public WebElement getBtnCleanDivision(){
        return $("//a[@href='#']");
    }

    public WebElement getBtnAddedToDivision(){
        return $("//span[text()='Порівняння']");

    }

    public WebElement getSearchBtn() {
        return $("//input[@id='doSearch']");
    }

    public WebElement getResultSearch() {
        return $("//div[@class='search__title']");
    }

    public WebElement showProductNullInDivision(){
        return $("//div[contains(text(),'Ваш список \"Порівняння\" порожній.')]");
    }

    public WebElement showProductInDivision(){
        return $("//a[contains(text(),'Очистити список \"Порівняння\"')]");
    }
}
