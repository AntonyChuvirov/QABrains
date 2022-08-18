package TestDima.HotlineTests;

import BaseClasses.TestInit;
import TestDima.HotlinePages.HomePageHotlineHotline;
import TestDima.HotlinePages.ProductsPageHotlineHotline;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestButtonDisplayProductHotline extends TestInit {

    @Test
    public void checkButtonDisplayProductHotline(){

        HomePageHotlineHotline homePageHotline = new HomePageHotlineHotline(driver);

        homePageHotline.goToHomePageHotline();
        homePageHotline.clickBtnAllCatalogs();
        homePageHotline.clickBtnElectronicCigarettes();

        ProductsPageHotlineHotline productsPageHotline = new ProductsPageHotlineHotline(driver);

        Assert.assertTrue(productsPageHotline.getPageWithNameProduct1().getText().contains("Електронні сигарети"));
        Assert.assertTrue(productsPageHotline.getButtonDisplayProduct2().isDisplayed());
        productsPageHotline.clickButtonDisplayProduct2();
        Assert.assertTrue(productsPageHotline.getButtonDisplayProduct1().isEnabled());
        productsPageHotline.clickButtonDisplayProduct1();
    }
}
