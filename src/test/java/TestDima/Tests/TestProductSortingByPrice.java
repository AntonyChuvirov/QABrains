package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProductSortingByPrice extends TestInit {

    @Test
    public void checkProductSortingByPrice(){

        HomePage homePage = new HomePage(driver);

        homePage.goToHomePageHotline();
        Assert.assertTrue(homePage.getBtnAllCatalogs().isDisplayed());
        homePage.clickBtnAllCatalogs();


        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertTrue(productsPage.getBtnSneakers().getText().contains("Кросівки"));
        productsPage.clickBtnSneakers();
        Assert.assertTrue(productsPage.getPageWithNameProduct1().getText().contains("Кросівки"));
        Assert.assertTrue(productsPage.getFieldWithSortedProducts().isDisplayed());
        Assert.assertTrue(productsPage.getSortingField().isDisplayed());
        productsPage.clickCheckBoxForMan();
        productsPage.clickCheckBoxSize42();
        productsPage.clearFieldInputPriceFrom();
        productsPage.inputInFieldInputPriceFrom_2000();
        Assert.assertTrue(productsPage.getFieldInputPriceFrom().isDisplayed());
        sleep(2);
        productsPage.clearFieldInputPriceTo();
        productsPage.inputInFieldInputPriceTo_5000();
        Assert.assertTrue(productsPage.getFieldInputPriceTo().isDisplayed());
        productsPage.clickBtnOk();
        Assert.assertTrue(productsPage.getFieldWithSortedProducts().isDisplayed());
        sleep(2);
        productsPage.clickToAsicsGel_GelExcite8();
        Assert.assertTrue(productsPage.getAsicsGel_GelExcite8().getText().contains("Asics GEL-EXCITE 8"));
        Assert.assertTrue(productsPage.getBtnBuy().isDisplayed());
        productsPage.clickBtnBuy();
        for(String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);}
        Assert.assertEquals(driver.getCurrentUrl(),"https://msport.com.ua/product/18992-asics-gel-excite-8-krossovki");
    }
}