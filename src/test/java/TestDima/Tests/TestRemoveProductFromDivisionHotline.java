package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.HomePageElements;
import TestDima.Pages.ProductsPage;
import TestDima.Pages.ProductsPageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestRemoveProductFromDivisionHotline extends TestInit {

    @Test

    public void JCheckBoxRemoveProductFromDivisionHotline() {
        HomePage homePage = new HomePage(driver);
        HomePageElements homePageElements = new HomePageElements(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        ProductsPageElements productsPageElements = new ProductsPageElements(driver);
        homePage.goToHotline();
        sleep(2);
        homePage.getSearchField();
        homePage.inputToSearchFieldSmartTv();
        Assert.assertTrue(homePageElements.getSearchField().isDisplayed());
        homePage.clickSearchBtn();
        sleep(3);
        Assert.assertTrue(productsPageElements.checkFindingProducts().getText().contains("знайдено"));
        productsPage.clickSmartTv();
        sleep(3);
        productsPage.addProductToDivision();
        sleep(3);
        Assert.assertTrue(productsPageElements.getListDivision().getText().contains("Товар доданий до порівняння"));
        productsPage.clickContinueWorking();
        productsPage.clickBtnAddedToDivision();
        sleep(2);
        Assert.assertTrue(homePageElements.showProductInDivision().isDisplayed());
        sleep(2);
        productsPage.clickBtnCleanDivision();
        sleep(2);
        Assert.assertTrue(productsPageElements.getTexListDivisionIsClean().getText().contains("Ваш список \"Порівняння\" порожній."));

    }

}
