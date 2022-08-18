package TestDima.HotlineTests;

import BaseClasses.TestInit;
import TestDima.HotlinePages.HomePageHotlineHotline;
import TestDima.HotlinePages.ProductsPageHotlineHotline;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddProductInMyListsHotline extends TestInit {

    @Test
    public void checkAddProductInMyListsHotline() {

        HomePageHotlineHotline homePageHotline = new HomePageHotlineHotline(driver);

        homePageHotline.goToHomePageHotline();
        homePageHotline.getSearchField();
        homePageHotline.inputInSearchFieldSonyPlayStation();
        Assert.assertTrue(homePageHotline.getSearchField().isDisplayed());
        homePageHotline.clickBtnSearch();

        ProductsPageHotlineHotline productsPageHotline = new ProductsPageHotlineHotline(driver);

        Assert.assertTrue(productsPageHotline.getResultWithFindedProducts().getText().contains("знайдено"));
        productsPageHotline.clickBtnAddPlayStationInMyLists();
        Assert.assertTrue(productsPageHotline.getWindowWithNameAddProductInMyLists().getText().contains("Sony PlayStation"));
        Assert.assertTrue(productsPageHotline.getBtnSaveInMyList().isDisplayed());
        productsPageHotline.clickBtnSaveInMyList();
        Assert.assertTrue(productsPageHotline.getTextWithProductSavedToList().isDisplayed());
        productsPageHotline.clickBtnGoToList();
    }
}



