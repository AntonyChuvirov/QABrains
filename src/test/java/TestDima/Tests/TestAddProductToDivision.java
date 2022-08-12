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
        sleep(5);
        Assert.assertTrue(productsPageElements.checkFindingProducts().isDisplayed());
        productsPage.clickPhone();
        sleep(2);
        productsPage.addProductToDivision();
        sleep(2);
        Assert.assertTrue(productsPageElements.getBtnAddToDivision().isDisplayed());
        Assert.assertTrue(productsPageElements.getResultDivision().isDisplayed());
    }
}
