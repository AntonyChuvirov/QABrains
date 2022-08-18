package TestDima.HotlineTests;

import BaseClasses.TestInit;
import TestDima.HotlinePages.HomePageHotlineHotline;
import TestDima.HotlinePages.ProductsPageHotlineHotline;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRemoveProductInComparisonHotline extends TestInit {

    @Test
    public void checkRemoveProductInComparisonHotline() {

        HomePageHotlineHotline homePageHotline = new HomePageHotlineHotline(driver);
        homePageHotline.goToHomePageHotline();
        Assert.assertTrue(homePageHotline.getSearchField().isDisplayed());
        homePageHotline.inputToSearchFieldSmartTV();
        Assert.assertTrue(homePageHotline.getBtnSearch().isDisplayed());
        homePageHotline.clickBtnSearch();

        ProductsPageHotlineHotline productsPageHotline = new ProductsPageHotlineHotline(driver);

        Assert.assertTrue(productsPageHotline.getResultWithFindedProducts().getText().contains("За запитом «Smart Tv» знайдено"));
        productsPageHotline.clickSelectedTV();
        Assert.assertTrue(productsPageHotline.getBtnAddProductInComparison().isDisplayed());
        productsPageHotline.clickBtnAddProductInComparison();
        Assert.assertTrue(productsPageHotline.getListDivision().getText().contains("Товар доданий до порівняння"));
        Assert.assertTrue(productsPageHotline.getWindowResultComparison().isDisplayed());
        Assert.assertTrue(productsPageHotline.getAddedNameProductInComparison().getText().contains("Nokia Smart TV 5000A"));
        Assert.assertTrue(productsPageHotline.getBtnContinueAfterAddInComparison().getText().contains("Продовжити роботу"));
        productsPageHotline.clickBtnContinueAfterAddInDivision();
        Assert.assertTrue(productsPageHotline.getBtnAddedToDivision().isDisplayed());
        productsPageHotline.clickBtnAddedToDivision();
        Assert.assertTrue(productsPageHotline.getBtnCleanComparison().isDisplayed());
        productsPageHotline.clickBtnCleanComparison();
        Assert.assertTrue(productsPageHotline.getTexListDivisionIsClean().getText().contains("Ваш список \"Порівняння\" порожній."));
    }
}
