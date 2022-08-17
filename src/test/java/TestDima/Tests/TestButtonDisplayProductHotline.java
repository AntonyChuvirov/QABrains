package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestButtonDisplayProductHotline extends TestInit {

    @Test
    public void checkButtonDisplayProductHotline(){

        HomePage homePage = new HomePage(driver);

        homePage.goToHomePageHotline();
        homePage.clickBtnAllCatalogs();
        homePage.clickBtnElectronicCigarettes();

        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertTrue(productsPage.getPageWithNameProduct1().getText().contains("Електронні сигарети"));
        Assert.assertTrue(productsPage.getButtonDisplayProduct2().isDisplayed());
        productsPage.clickButtonDisplayProduct2();
        Assert.assertTrue(productsPage.getButtonDisplayProduct1().isEnabled());
        productsPage.clickButtonDisplayProduct1();
    }
}
