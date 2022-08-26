package TestDima.PromPages;

import BaseClasses.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

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

    public void changeCategoriesProductInListCatalog() {
        Actions actions = new Actions(driver);
        TestInit testInit = new TestInit();
        actions.moveToElement(getList1CatalogCategoryProducts().get(4)).build().perform();
        for (int i = 5; i < getList2CatalogCategoryProducts().size() - 4; i++) {
            actions.moveToElement(getList2CatalogCategoryProducts().get(i)).build().perform();
            Assert.assertTrue(getListCategoryProducts().isDisplayed());
            testInit.sleep(1);
        }
    }

    //---------------TestSortingProductByBrandPromUa----------
    public void clickCategoryProductInListElementsCategoryProducts() {
        getListElementsCategoryProducts().get(10).click();
    }

    public void clickProductInListTypeProducts() {
        getListElementsTypeProducts().get(5).click();
    }

    public void clickBtnShowAllBrands() {
        getBtnShowAllBrands().click();
    }

    public void chooseBrands() {

        TestInit testInit = new TestInit();

        for (int i = 45; i < getCheckBoxBrand().size() - 45; i++) {
            getCheckBoxBrand().get(i).click();
            testInit.sleep(1);
        }
    }

    //    -----------------------------TestFilterPromUa-----------------------------------------------------------
    TestInit testInit = new TestInit();

    public void chooseMethodBuy() {
        for (int i = 0; i < getListElementsMethodBuy().size(); i++) {
            getListElementsMethodBuy().get(i).click();
            testInit.sleep(1);
        }
    }

    public void assertAllElementsMethodBuyIsDisplayed() {
        for (int i = 0; i < getListElementsMethodBuy().size(); i++) {
            getListElementsMethodBuy().get(i).isDisplayed();
        }
    }

    public void chooseDelivery() {
        for (int i = 0; i < getListDelivery().size(); i++) {
            getListDelivery().get(i).click();
            testInit.sleep(2);
        }
    }

    public void assertAllElementsDeliveryIsDisplayed() {
        for (int i = 0; i < getListDelivery().size(); i++) {
            getListDelivery().get(i).isDisplayed();
        }
    }

    public void choosePriceRange() {
        getListElementsPriceRange().get(0).sendKeys("1000");
        getListElementsPriceRange().get(1).sendKeys("2000");
        testInit.sleep(2);
        getBtnOkPriceRange().click();
    }

    public void assertAllElementsPriceRangeIsDisplayed() {
        for (int i = 0; i < getListElementsPriceRange().size(); i++) {
            getListElementsPriceRange().get(i).isDisplayed();
        }
    }

    public void assertAllProductsIsDisplayed() {
        for (int i = 0; i < getListProducts().size(); i++) {
            System.out.println(i);
            getListProducts().get(i).isDisplayed();
        }
    }

    public void clickBtnCleanAllInFilter() {
        getBtnCleanAllInFilter().click();
    }
}
