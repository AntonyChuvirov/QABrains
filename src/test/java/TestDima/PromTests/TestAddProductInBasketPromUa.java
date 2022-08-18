package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import TestDima.PromPages.ProductsPagePromUa;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddProductInBasketPromUa extends TestInit {

    @Test
    public void checkAddProductBasketPromUa(){

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();
        homePagePromUa.getSearchField().sendKeys("Кава");
        homePagePromUa.clickSearchBtn();

        ProductsPagePromUa productsPagePromUa = new ProductsPagePromUa(driver);

        Assert.assertTrue(productsPagePromUa.getPageWithNameProduct().getText().contains("Кава"));
        Assert.assertTrue(productsPagePromUa.getFieldWithProduct().isDisplayed());
        productsPagePromUa.clickJACOBSMONARCH();
        Assert.assertTrue(productsPagePromUa.getBtnBuyProduct().isDisplayed());
        productsPagePromUa.clickBtnBuyProduct();
        Assert.assertTrue(productsPagePromUa.getWindowWithNameBasket().getText().contains("Кошик"));
        Assert.assertTrue(productsPagePromUa.getNameProductInWindowBasket().getText().contains("JACOBS"));
        Assert.assertTrue(productsPagePromUa.getBtnBuyProductInBasket().isDisplayed());
        productsPagePromUa.clickBtnBuyProductInBasket();
        Assert.assertTrue(productsPagePromUa.getPagePlacingAnOrder().isDisplayed());
    }
}
