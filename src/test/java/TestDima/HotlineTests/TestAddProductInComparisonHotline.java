package TestDima.HotlineTests;

import BaseClasses.TestInit;
import TestDima.HotlinePages.HomePageHotlineHotline;
import TestDima.HotlinePages.ProductsPageHotlineHotline;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddProductInComparisonHotline extends TestInit {

    @Test
    public void checkAddProductInComparisonHotline() {

        HomePageHotlineHotline homePageHotline = new HomePageHotlineHotline(driver);

        homePageHotline.goToHomePageHotline();
        homePageHotline.inputInSearchFieldModelPhone();
        Assert.assertTrue(homePageHotline.getSearchField().isDisplayed());
        homePageHotline.clickBtnSearch();

        ProductsPageHotlineHotline productsPageHotline = new ProductsPageHotlineHotline(driver);

        Assert.assertTrue(productsPageHotline.getResultWithFindedProducts().getText().contains("За запитом «Realme 9 pro» знайдено"));
        productsPageHotline.clickSelectedPhone();
        Assert.assertTrue(productsPageHotline.getBtnAddProductInComparison().isDisplayed());
        productsPageHotline.clickBtnAddProductInComparison();
        Assert.assertTrue(productsPageHotline.getWindowResultComparison().isDisplayed());
        productsPageHotline.clickBtnContinueAfterAddInDivision();
    }
}
