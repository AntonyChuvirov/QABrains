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
        Assert.assertTrue(productsPageHotline.getBtnSportCatalogList().isDisplayed());
        Assert.assertTrue(productsPageHotline.getBtnBicycleComputers().getText().contains("Велокомп'ютери"));
        productsPageHotline.clickBnBicycleComputers();
        Assert.assertTrue(productsPageHotline.getNewPageWithNameProducts().getText().contains("Велокомп'ютер"));
        Assert.assertTrue(productsPageHotline.getListProducts().isDisplayed());
        Assert.assertTrue(productsPageHotline.getFieldWithPagesNumbers().isDisplayed());
        productsPageHotline.clickBtnPageNumber5();
        Assert.assertTrue(productsPageHotline.getListProducts().isDisplayed());
        productsPageHotline.clickPolarV650();
        Assert.assertTrue(productsPageHotline.getPageWithNameProduct1().getText().contains("Polar V650"));
    }
}


