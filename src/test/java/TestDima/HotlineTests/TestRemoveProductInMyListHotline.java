package TestDima.HotlineTests;

import BaseClasses.TestInit;
import TestDima.HotlinePages.HomePageHotlineHotline;
import TestDima.HotlinePages.ProductsPageHotlineHotline;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRemoveProductInMyListHotline extends TestInit {

    @Test
    public void checkRemoveProductInMyListHotline(){

        HomePageHotlineHotline homePageHotline = new HomePageHotlineHotline(driver);

        homePageHotline.goToHomePageHotline();
        homePageHotline.inputToSearchFieldAirpods();
        Assert.assertTrue(homePageHotline.getSearchField().isDisplayed());
        homePageHotline.clickBtnSearch();

        ProductsPageHotlineHotline productsPageHotline = new ProductsPageHotlineHotline(driver);

        Assert.assertTrue(productsPageHotline.getResultWithFindedProducts().getText().contains("За запитом «Airpods» знайдено"));
        productsPageHotline.clickBtnAddAirpodsInMyList();
        Assert.assertTrue(productsPageHotline.getWindowWithNameAddProductInMyLists().getText().contains("Apple AirPods"));
        Assert.assertTrue(productsPageHotline.getBtnSaveInMyList().isDisplayed());
        productsPageHotline.clickBtnSaveInMyList();
        Assert.assertTrue(productsPageHotline.getWindowWithNameAddProductInMyLists().getText().contains("Apple AirPods"));
        Assert.assertTrue(productsPageHotline.getTextWithProductSavedToList().isDisplayed());
        Assert.assertTrue(productsPageHotline.getBtnGoToList().isDisplayed());
        productsPageHotline.clickBtnGoToList();
        Assert.assertTrue(productsPageHotline.getBtnDeleteAllProductInMyList().isDisplayed());
        productsPageHotline.clickBtnDeleteAllProductInMyList();
        Assert.assertTrue(productsPageHotline.getWindowWithConfirmAction().isDisplayed());
        Assert.assertTrue(productsPageHotline.getBtnYesInWindowWithConfirmAction().isDisplayed());
        Assert.assertTrue(productsPageHotline.getBtnCancelInWindowWithConfirmAction().isDisplayed());
        productsPageHotline.clickBtnYesInWindowWithConfirmAction();
        Assert.assertTrue(productsPageHotline.getWindowWithNameProductNull().getText().contains("Закладки: 0"));
    }
}
