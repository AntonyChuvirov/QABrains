package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import TestDima.PromPages.ProductsPagePromUa;
import org.testng.annotations.Test;

public class TestAddProductToBasketPromUa extends TestInit {

    @Test
    public void checkAddProductToBasketPromUa(){

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();
        homePagePromUa.getSearchField().sendKeys("Кава");
        homePagePromUa.clickSearchBtn();

        ProductsPagePromUa productsPagePromUa = new ProductsPagePromUa(driver);

        productsPagePromUa.getPageWithNameProduct().getText().contains("Кава");
        productsPagePromUa.getFieldWithProduct().isDisplayed();
    }
}
