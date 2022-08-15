package TestDima.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends HomePageElements {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToHomePageHotline() {
        driver.get("https://hotline.ua/");
    }

    public void inputToSearchFieldLaptop() {
        getSearchField().sendKeys("Ноутбук");
    }

    public void clickBtnSearch() {
        getBtnSearch().click();
    }

    public void inputInSearchFieldModelPhone() {
        getSearchField().sendKeys("Realme 9 pro");
    }

    public void inputToSearchFieldAirpods(){
        getSearchField().sendKeys("Airpods");
    }

     public void inputToSearchFieldSmartTV(){
        getSearchField().sendKeys("Smart Tv");
    }

    public void inputInSearchFieldSonyPlayStation(){
        getSearchField().sendKeys("Sony PlayStation");
    }
}
