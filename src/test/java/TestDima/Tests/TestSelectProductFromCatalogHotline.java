package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelectProductFromCatalogHotline extends TestInit {

    @Test
    public void checkSelectProductFromCatalogHotline(){

        HomePage homePage = new HomePage(driver);

        homePage.goToHomePageHotline();
        homePage.clickBtnAllCatalogs();

        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertTrue(productsPage.getListCatalog().isDisplayed());
        productsPage.clickSportsSection();
        Assert.assertTrue(productsPage.getBtnSportCatalogList().isDisplayed());
        Assert.assertTrue(productsPage.getBtnBicycleComputers().getText().contains("Велокомп'ютери"));
        productsPage.clickBnBicycleComputers();
        Assert.assertTrue(productsPage.getNewPageWithNameProducts().getText().contains("Велокомп'ютер"));
        Assert.assertTrue(productsPage.getListProducts().isDisplayed());
        Assert.assertTrue(productsPage.getFieldWithPagesNumbers().isDisplayed());
        productsPage.clickBtnPageNumber5();
        Assert.assertTrue(productsPage.getListProducts().isDisplayed());
        productsPage.clickPolarV650();
        Assert.assertTrue(productsPage.getPageWithNameProduct().getText().contains("Polar V650"));
    }
}


