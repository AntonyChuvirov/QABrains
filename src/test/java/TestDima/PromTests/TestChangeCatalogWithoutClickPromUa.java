package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import TestDima.PromPages.ProductsPagePromUa;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestChangeCatalogWithoutClickPromUa extends TestInit {

    @Test
    public void checkChangeCatalogWithoutClickPromUa(){

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();


        ProductsPagePromUa productsPagePromUa = new ProductsPagePromUa(driver);

//
        Actions actions = new Actions(driver);
//        actions.moveToElement(productsPagePromUa.getListCatalogWithCategoriesProduct()).build().perform();

        productsPagePromUa.moveToCategoriesProductInListCatalogWithCategoriesProduct();
        actions.moveToElement(productsPagePromUa.getBtnMedicinesAndMedicalProducts()).build().perform();
    }
}
