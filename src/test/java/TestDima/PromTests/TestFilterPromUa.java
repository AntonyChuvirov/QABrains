package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import TestDima.PromPages.ProductsPagePromUa;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFilterPromUa extends TestInit {

    @Test
    public void checkFilterPromUa() {

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();
        homePagePromUa.clickProductInListByNow();

        ProductsPagePromUa productsPagePromUa = new ProductsPagePromUa(driver);

        productsPagePromUa.assertAllElementsPriceRangeIsDisplayed();
        Assert.assertTrue(productsPagePromUa.getBtnOkPriceRange().isDisplayed());
        productsPagePromUa.choosePriceRange();
        productsPagePromUa.assertAllElementsMethodBuyIsDisplayed();
        productsPagePromUa.chooseMethodBuy();
        productsPagePromUa.assertAllElementsDeliveryIsDisplayed();
        productsPagePromUa.chooseDelivery();
        productsPagePromUa.assertAllProductsIsDisplayed();
        productsPagePromUa.clickBtnCleanAllInFilter();
        System.out.println(productsPagePromUa.getListElementsPriceRange().get(0).getText());
        Assert.assertEquals(productsPagePromUa.getListElementsPriceRange().get(0).getText(), "");
        Assert.assertTrue(productsPagePromUa.getListElementsPriceRange().get(0).getText().isEmpty());
    }
}
