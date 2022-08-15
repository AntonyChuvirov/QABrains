package TestDima.Pages;

import org.openqa.selenium.WebDriver;

public class ProductsPage extends ProductsPageElements {


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickRealme8pro() {
        getRealme8pro().click();
    }

    public void clickSmartTv(){
        getSmartTvNokia().click();
    }

    public void clickBtnAddProductToMyLists(){
        getBtnAddProductToMyLists().click();
    }

    public void clickBtnSaveInMyList(){
        getBtnSaveInMyList().click();
    }



    public void clickBtnAddToDivision() {
        getBtnAddToDivision().click();
    }

    public void clickBtnAddedToDivision(){
        getBtnAddedToDivision().click();
    }


    public void clickBtnCleanDivision(){
        getBtnCleanDivision().click();
    }


    public void clickContinueWorkingAfterRemove(){
        getBtnContinueWorkingAfterRemove().click();
    }


    public void clickBtnGoToList(){
        getBtnGoToList().click();
    }

    public void clickBtnContinueAfterAddingToDivision(){
        getBtnContinueAfterAddingToDivision().click();
    }



    }

