package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddProductInMyListsHotline extends TestInit {

    @Test
    public void checkAddProductInMyLists() {

        HomePage homePage = new HomePage(driver);

        homePage.goToHomePageHotline();
        homePage.getSearchField();
        homePage.inputInSearchFieldSonyPlayStation();
        Assert.assertTrue(homePage.getSearchField().isDisplayed());
        homePage.clickBtnSearch();

        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertTrue(productsPage.getResultWithFindedProducts().getText().contains("знайдено"));
        productsPage.clickBtnAddPlayStationInMyLists();
        Assert.assertTrue(productsPage.getWindowWithNameAddProductInMyLists().getText().contains("Sony PlayStation"));
        Assert.assertTrue(productsPage.getBtnSaveInMyList().isDisplayed());
        productsPage.clickBtnSaveInMyList();
        Assert.assertTrue(productsPage.getTextWithProductSavedToList().isDisplayed());
        productsPage.clickBtnGoToList();
    }
}



