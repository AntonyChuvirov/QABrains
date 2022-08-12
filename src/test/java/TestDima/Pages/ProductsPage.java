package TestDima.Pages;

import org.openqa.selenium.WebDriver;

public class ProductsPage extends ProductsPageElements {


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void clickPhone() {
        getPhone().click();
    }

    public void clickSmartTv(){
        getSmartTvNokia().click();
    }

    public void addProductToDivision() {
        getBtnAddToDivision().click();
    }

    public void clickBtnAddedToDivision(){
        getBtnAddedToDivision().click();
    }

    public void clickBtnCleanDivision(){
        getBtnCleanDivision().click();
    }


    public void clickContinueWorking(){
        getBtnContinueWorking().click();
    }

    }

