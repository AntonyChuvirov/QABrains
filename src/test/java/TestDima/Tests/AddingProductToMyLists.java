package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingProductToMyLists extends TestInit {

    @Test
    public void AddingProductToMyLists() {
        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        homePage.goToHotline();
        homePage.getSearchField();
        homePage.inputToSearchFieldSonyPlayStation();
        Assert.assertTrue(homePage.getSearchField().isDisplayed());
        homePage.clickSearchBtn();
        Assert.assertTrue(productsPage.checkFindingProducts().getText().contains("знайдено"));
        productsPage.clickBtnAddProductToMyLists();
        Assert.assertTrue(productsPage.getWindowWithNameAddingProductToMyLists().getText().contains("Sony PlayStation"));
        Assert.assertTrue(productsPage.getBtnSaveInMyList().isDisplayed());
        productsPage.clickBtnSaveInMyList();
        productsPage.clickBtnGoToList();
    }
}



