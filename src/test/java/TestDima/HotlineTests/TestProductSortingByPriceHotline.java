package TestDima.HotlineTests;

import BaseClasses.TestInit;
import TestDima.HotlinePages.HomePageHotlineHotline;
import TestDima.HotlinePages.ProductsPageHotlineHotline;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProductSortingByPriceHotline extends TestInit {

    @Test
    public void checkProductSortingByPriceHotline() {

        HomePageHotlineHotline homePageHotline = new HomePageHotlineHotline(driver);

        homePageHotline.goToHomePageHotline();
        Assert.assertTrue(homePageHotline.getBtnAllCatalogs().isDisplayed());
        homePageHotline.clickBtnAllCatalogs();

        ProductsPageHotlineHotline productsPageHotline = new ProductsPageHotlineHotline(driver);

        Assert.assertTrue(productsPageHotline.getBtnSneakers().getText().contains("Кросівки"));
        productsPageHotline.clickBtnSneakers();
        Assert.assertTrue(productsPageHotline.getPageWithNameProduct1().getText().contains("Кросівки"));
        Assert.assertTrue(productsPageHotline.getFieldWithSortedProducts().isDisplayed());
        Assert.assertTrue(productsPageHotline.getSortingField().isDisplayed());
        productsPageHotline.clickCheckBoxForMan();
        productsPageHotline.clickCheckBoxSize42();
        productsPageHotline.clearFieldInputPriceFrom();
        productsPageHotline.inputInFieldInputPriceFrom_2000();
        Assert.assertTrue(productsPageHotline.getFieldInputPriceFrom().isDisplayed());
        productsPageHotline.clearFieldInputPriceTo();
        productsPageHotline.inputInFieldInputPriceTo_5000();
        Assert.assertTrue(productsPageHotline.getFieldInputPriceTo().isDisplayed());
        productsPageHotline.clickBtnOk();
        Assert.assertTrue(productsPageHotline.getFieldWithSortedProducts().isDisplayed());
        productsPageHotline.clickToAsicsGel_GelExcite8();
        Assert.assertTrue(productsPageHotline.getPageWithNameProduct2().getText().contains("Asics GEL-EXCITE 8"));
        Assert.assertTrue(productsPageHotline.getBtnBuy().isDisplayed());
        productsPageHotline.clickBtnBuy();
        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
        }
        Assert.assertEquals(driver.getCurrentUrl(), "https://msport.com.ua/product/18992-asics-gel-excite-8-krossovki");
    }
}