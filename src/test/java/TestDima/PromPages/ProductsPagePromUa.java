package TestDima.PromPages;

import BaseClasses.TestInit;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ProductsPagePromUa extends ProductsPageElementsPromUa {
    public ProductsPagePromUa(WebDriver driver) {
        super(driver);
    }

    public void clickCoffee() {
        getJACOBSMONARCH().click();
    }

    public void clickBtnBuyProduct() {
        getBtnBuyProduct().click();
    }

    public void clickBtnBuyProductInBasket() {
        getBtnBuyProductInBasket().click();
    }

    public void moveToCategoriesProductInListCatalogWithCategoriesProduct() {
        Actions actions = new Actions(driver);
        TestInit testInit = new TestInit();
        for (int i = 0; i < getCategoriesProduct().size(); i++) {
            actions.moveToElement(getCategoriesProduct().get(i)).perform();
            testInit.sleep(1);
        }
    }
    //---------------TestSortingProductByBrandPromUa----------
    public void clickProductFromListHouseAndGarden() {
        getListProductsFromListHouseAndGarden().get(36).click();
    }

    public void clickTypeProductInListProducts() {
        getListTypeProducts().get(6).click();
    }

    public void clickBtnShowAll() {
        getBtnShowAll().click();
    }

    public void clickCheckBoxBrand() {
        TestInit testInit = new TestInit();
        for (int i = 0; i < getCheckBoxBrand().size() - 20; i++) {
            getCheckBoxBrand().get(i).click();
            testInit.sleep(2);
        }
    }
}
