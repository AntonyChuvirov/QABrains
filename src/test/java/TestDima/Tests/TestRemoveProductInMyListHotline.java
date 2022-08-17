package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRemoveProductInMyListHotline extends TestInit {

    @Test
    public void checkRemoveProductInMyListHotline(){

        HomePage homePage = new HomePage(driver);

        homePage.goToHomePageHotline();
        homePage.inputToSearchFieldAirpods();
        Assert.assertTrue(homePage.getSearchField().isDisplayed());
        homePage.clickBtnSearch();

        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertTrue(productsPage.getResultWithFindedProducts().getText().contains("За запитом «Airpods» знайдено"));
        productsPage.clickBtnAddAirpodsInMyList();
        Assert.assertTrue(productsPage.getWindowWithNameAddProductInMyLists().getText().contains("Apple AirPods"));
        Assert.assertTrue(productsPage.getBtnSaveInMyList().isDisplayed());
        productsPage.clickBtnSaveInMyList();
        Assert.assertTrue(productsPage.getWindowWithNameAddProductInMyLists().getText().contains("Apple AirPods"));
        Assert.assertTrue(productsPage.getTextWithProductSavedToList().isDisplayed());
        Assert.assertTrue(productsPage.getBtnGoToList().isDisplayed());
        productsPage.clickBtnGoToList();
        Assert.assertTrue(productsPage.getBtnDeleteAllProductInMyList().isDisplayed());
        productsPage.clickBtnDeleteAllProductInMyList();
        Assert.assertTrue(productsPage.getWindowWithConfirmAction().isDisplayed());
        Assert.assertTrue(productsPage.getBtnYesInWindowWithConfirmAction().isDisplayed());
        Assert.assertTrue(productsPage.getBtnCancelInWindowWithConfirmAction().isDisplayed());
        productsPage.clickBtnYesInWindowWithConfirmAction();
        Assert.assertTrue(productsPage.getWindowWithNameProductNull().getText().contains("Закладки: 0"));
    }
}
