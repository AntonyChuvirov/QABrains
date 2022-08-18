package TestDima.HotlinePages;

import org.openqa.selenium.WebDriver;

public class HomePageHotlineHotline extends HomePageElementsHotline {


    public HomePageHotlineHotline(WebDriver driver) {
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

    public void clickBtnAllCatalogs(){
        getBtnAllCatalogs().click();
    }

    public void clickBtnInCatalogTourismAndFishing(){
        getBtnInCatalogTourismAndFishing().click();
    }

    public void clickBtnElectronicCigarettes() {
        getBtnElectronicCigarettes().click();
    }

    public void clickBtnUkrainianLanguage(){
        getBtnUkrainianLanguage().click();
    }

    public void clickBtnRussianLanguage(){
        getBtnRussianLanguage().click();
    }
}
