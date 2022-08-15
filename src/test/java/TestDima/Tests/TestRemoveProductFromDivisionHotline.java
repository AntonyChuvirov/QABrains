package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.HomePageElements;
import TestDima.Pages.ProductsPage;
import TestDima.Pages.ProductsPageElements;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRemoveProductFromDivisionHotline extends TestInit {

    @Test
    public void JCheckBoxRemoveProductFromDivisionHotline() {
        HomePage homePage = new HomePage(driver);
        HomePageElements homePageElements = new HomePageElements(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        ProductsPageElements productsPageElements = new ProductsPageElements(driver);
        homePage.goToHotline();
        homePage.getSearchField();
        homePage.inputToSearchFieldSmartTv();
        Assert.assertTrue(homePageElements.getSearchField().isDisplayed());
        homePage.clickSearchBtn();
        Assert.assertTrue(productsPageElements.checkFindingProducts().getText().contains("знайдено"));
        productsPage.clickSmartTv();
        productsPage.addProductToDivision();
        Assert.assertTrue(productsPageElements.getListDivision().getText().contains("Товар доданий до порівняння"));
        productsPage.clickContinueWorking();
        productsPage.clickBtnAddedToDivision();
        Assert.assertTrue(homePageElements.showProductInDivision().isDisplayed());
        productsPage.clickBtnCleanDivision();
        Assert.assertTrue(productsPageElements.getTexListDivisionIsClean().getText().contains("Ваш список \"Порівняння\" порожній."));
    }
}
