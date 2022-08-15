package TestDima.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends HomePageElements {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToHotline() {
        driver.get("https://hotline.ua/");
    }
    public void inputToSearchFieldLaptop() {
        getSearchField().sendKeys("Ноутбук");
    }

    public void clickSearchBtn() {
        getSearchBtn().click();
    }

    public void inputToSearchFieldRealme8pro() {
        getSearchField().sendKeys("Realme 8 pro");

    }


    public void inputToSearchFieldSmartTv(){
        getSearchField().sendKeys("SmartTv");
    }

    public void inputToSearchFieldSonyPlayStation(){
        getSearchField().sendKeys("Sony PlayStation");
    }

    public void clickBtnAddedToDivision(){
        getBtnAddedToDivision().click();
    }

    public void clickBtnCleanDivision(){
        getBtnCleanDivision().click();
    }
}
