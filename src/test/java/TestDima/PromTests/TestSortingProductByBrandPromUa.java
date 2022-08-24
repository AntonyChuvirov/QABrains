package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import TestDima.PromPages.ProductsPagePromUa;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSortingProductByBrandPromUa extends TestInit {


    @Test
    public void checkSortingProductByBrandPromUa(){

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();

        ProductsPagePromUa productsPagePromUa = new ProductsPagePromUa(driver);
        PageCatalogElementsPromUa pageCatalogElementsPromUa = new PageCatalogElementsPromUa(driver);
        Actions actions = new Actions(driver);
//        actions.moveToElement(pageCatalogElementsPromUa.getBtnHouseAndGarden()).build().perform();
        productsPagePromUa.clickProductFromListHouseAndGarden();
        Assert.assertTrue(productsPagePromUa.getPageWithNameProductAfterCatalog().isDisplayed());
        productsPagePromUa.clickTypeProductInListProducts();
        Assert.assertTrue(productsPagePromUa.getPageWithNameProduct().isDisplayed());
        productsPagePromUa.clickBtnShowAll();
        productsPagePromUa.clickCheckBoxBrand();
        Assert.assertTrue(productsPagePromUa.getProductsAfterSorting().isDisplayed());
    }
}
