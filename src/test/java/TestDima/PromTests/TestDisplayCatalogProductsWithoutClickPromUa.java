package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import TestDima.PromPages.ProductsPagePromUa;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestDisplayCatalogProductsWithoutClickPromUa extends TestInit {

    @Test
    public void checkCatalogProductsWithoutClickPromUa() {

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();

        ProductsPagePromUa productsPagePromUa = new ProductsPagePromUa(driver);

        productsPagePromUa.changeCategoriesProductInListCatalog();
    }
}
