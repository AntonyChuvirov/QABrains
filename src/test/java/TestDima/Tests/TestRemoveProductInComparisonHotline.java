package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRemoveProductInComparisonHotline extends TestInit {

    @Test
    public void checkRemoveProductInComparisonHotline() {

        HomePage homePage = new HomePage(driver);
        homePage.goToHomePageHotline();
        Assert.assertTrue(homePage.getSearchField().isDisplayed());
        homePage.inputToSearchFieldSmartTV();
        Assert.assertTrue(homePage.getBtnSearch().isDisplayed());
        homePage.clickBtnSearch();

        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertTrue(productsPage.getResultWithFindedProducts().getText().contains("За запитом «Smart Tv» знайдено"));
        productsPage.clickSelectedTV();
        Assert.assertTrue(productsPage.getBtnAddProductInComparison().isDisplayed());
        productsPage.clickBtnAddProductInComparison();
        Assert.assertTrue(productsPage.getListDivision().getText().contains("Товар доданий до порівняння"));
        Assert.assertTrue(productsPage.getWindowResultComparison().isDisplayed());
        Assert.assertTrue(productsPage.getAddedNameProductInComparison().getText().contains("Nokia Smart TV 5000A"));
        Assert.assertTrue(productsPage.getBtnContinueAfterAddInComparison().getText().contains("Продовжити роботу"));
        productsPage.clickBtnContinueAfterAddInDivision();
        Assert.assertTrue(productsPage.getBtnAddedToDivision().isDisplayed());
        productsPage.clickBtnAddedToDivision();
        Assert.assertTrue(productsPage.getBtnCleanComparison().isDisplayed());
        productsPage.clickBtnCleanComparison();
        Assert.assertTrue(productsPage.getTexListDivisionIsClean().getText().contains("Ваш список \"Порівняння\" порожній."));
    }
}
