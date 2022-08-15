package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddProductInComparison extends TestInit {

    @Test
    public void checkAddProductInComparison() {

        HomePage homePage = new HomePage(driver);

        homePage.goToHomePageHotline();
        homePage.inputInSearchFieldModelPhone();
        Assert.assertTrue(homePage.getSearchField().isDisplayed());
        homePage.clickBtnSearch();

        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertTrue(productsPage.getResultWithFindedProducts().getText().contains("За запитом «Realme 9 pro» знайдено"));
        productsPage.clickSelectedPhone();
        Assert.assertTrue(productsPage.getBtnAddProductInComparison().isDisplayed());
        productsPage.clickBtnAddProductInComparison();
        Assert.assertTrue(productsPage.getWindowResultComparison().isDisplayed());
        productsPage.clickBtnContinueAfterAddInDivision();
    }
}
