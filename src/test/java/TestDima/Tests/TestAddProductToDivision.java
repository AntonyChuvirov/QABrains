package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import TestDima.Pages.ProductsPageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddProductToDivision extends TestInit {

    @Test
    public void checkAddProductToDivision() {
        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        ProductsPageElements productsPageElements = new ProductsPageElements(driver);
        homePage.goToHotline();
        homePage.inputToSearchFieldPhone();
        homePage.clickSearchBtn();
        Assert.assertTrue(productsPageElements.checkFindingProducts().isDisplayed());
        productsPage.clickPhone();
        productsPage.addProductToDivision();
        Assert.assertTrue(productsPageElements.getBtnAddToDivision().isDisplayed());
        Assert.assertTrue(productsPageElements.getResultDivision().isDisplayed());
    }
}
