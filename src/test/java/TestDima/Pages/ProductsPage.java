package TestDima.Pages;

import org.openqa.selenium.WebDriver;

public class ProductsPage extends ProductsPageElements {


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickBtnAddAirpodsInMyList() {
        getBtnAddAirpodsInMyList().click();
    }

    public void clickBtnDeleteAllProductInMyList() {
        getBtnDeleteAllProductInMyList().click();
    }

    public void clickSelectedPhone() {
        getSelectedPhone().click();
    }

    public void clickBtnAddPlayStationInMyLists() {
        getBtnAddProductToMyLists().click();
    }

    public void clickBtnSaveInMyList() {
        getBtnSaveInMyList().click();
    }

    public void clickBtnAddProductInComparison() {
        getBtnAddProductInComparison().click();
    }

    public void clickBtnYesInWindowWithConfirmAction(){
        getBtnYesInWindowWithConfirmAction().click();
    }

    public void clickBtnAddedToDivision() {
        getBtnAddedToDivision().click();
    }

    public void clickBtnCleanComparison() {
        getBtnCleanComparison().click();
    }

    public void clickSelectedTV() {
        getSelectedTV().click();
    }

    public void clickBtnGoToList() {
        getBtnGoToList().click();
    }

    public void clickBtnContinueAfterAddInDivision() {
        getBtnContinueAfterAddInComparison().click();
    }

    public void clickSportsSection(){
        getBtnSportSection().click();
    }

    public void clickBnBicyclComputers(){
        getBtnBicyclComputers().click();
    }

    public void clickBtnPageNumber5(){
        getBtnPageNumber5().click();
    }

    public void clickPolarV650(){
        getPolarV650().click();
    }
}

