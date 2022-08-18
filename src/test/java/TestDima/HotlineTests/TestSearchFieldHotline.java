package TestDima.HotlineTests;

import BaseClasses.TestInit;
import TestDima.HotlinePages.HomePageHotlineHotline;
import TestDima.HotlinePages.ProductsPageHotlineHotline;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFieldHotline extends TestInit {

    @Test
    public void checkSearchFieldHotline() {

        HomePageHotlineHotline homePageHotline = new HomePageHotlineHotline(driver);

        homePageHotline.goToHomePageHotline();
        homePageHotline.inputToSearchFieldLaptop();
        Assert.assertTrue(homePageHotline.getBtnSearch().isDisplayed());
        homePageHotline.clickBtnSearch();

        ProductsPageHotlineHotline productsPageHotline = new ProductsPageHotlineHotline(driver);

        Assert.assertTrue(productsPageHotline.getResultWithFindedProducts().getText().contains("За запитом «Ноутбук» знайдено"));
    }
}
