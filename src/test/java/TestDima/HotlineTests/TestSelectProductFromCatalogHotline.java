package TestDima.HotlineTests;

import BaseClasses.TestInit;
import TestDima.HotlinePages.HomePageHotlineHotline;
import TestDima.HotlinePages.ProductsPageHotlineHotline;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelectProductFromCatalogHotline extends TestInit {

    @Test
    public void checkSelectProductFromCatalogHotline(){

        HomePageHotlineHotline homePageHotline = new HomePageHotlineHotline(driver);

        homePageHotline.goToHomePageHotline();
        homePageHotline.clickBtnAllCatalogs();

        ProductsPageHotlineHotline productsPageHotline = new ProductsPageHotlineHotline(driver);

        Assert.assertTrue(productsPageHotline.getListCatalog().isDisplayed());
        productsPageHotline.clickSportsSection();
        sleep(2);
        productsPageHotline.clickLisProductsSportsSelection();
        productsPageHotline.clickElementFromListProducts();
        Assert.assertTrue(productsPageHotline.getNewPageWithNameProducts().getText().contains("Велокомп'ютер"));
    }
}
