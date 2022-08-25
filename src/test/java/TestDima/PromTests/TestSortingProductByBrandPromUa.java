package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import TestDima.PromPages.ProductsPagePromUa;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSortingProductByBrandPromUa extends TestInit {


    @Test
    public void checkSortingProductByBrandPromUa() {

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();

        ProductsPagePromUa productsPagePromUa = new ProductsPagePromUa(driver);
        Actions actions = new Actions(driver);
        actions.moveToElement(productsPagePromUa.getList1CatalogCategoryProducts().get(7)).build().perform();
        Assert.assertTrue(productsPagePromUa.getListCategoryProducts().isDisplayed());
        productsPagePromUa.clickCategoryProductInListElementsCategoryProducts();
        Assert.assertTrue(productsPagePromUa.getPageNameTypesProduct().isDisplayed());
        productsPagePromUa.clickProductInListTypeProducts();
        Assert.assertTrue(productsPagePromUa.getPageNameProduct().isDisplayed());
        productsPagePromUa.clickBtnShowAllBrands();
        productsPagePromUa.chooseBrands();
        Assert.assertTrue(productsPagePromUa.getProductsAfterSorting().isDisplayed());
    }
}
