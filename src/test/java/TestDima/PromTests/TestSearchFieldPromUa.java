package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import TestDima.PromPages.ProductsPagePromUa;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchFieldPromUa extends TestInit {

    @Test
    public void checkSearchFieldPromUa(){

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();
        homePagePromUa.inputInSearchFieldXiaomiRedmiNote11();
        homePagePromUa.clickSearchBtn();

        ProductsPagePromUa productsPagePromUa = new ProductsPagePromUa(driver);

        Assert.assertTrue(productsPagePromUa.getPageWithNameProduct().getText().contains("Xiaomi Redmi Note 11"));
        Assert.assertTrue(productsPagePromUa.getFieldWithProduct().isDisplayed());
    }
}
