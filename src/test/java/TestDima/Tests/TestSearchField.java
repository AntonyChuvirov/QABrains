package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchField extends TestInit {

    @Test
    public void checkSearchField() {

        HomePage homePage = new HomePage(driver);

        homePage.goToHomePageHotline();
        homePage.inputToSearchFieldLaptop();
        Assert.assertTrue(homePage.getBtnSearch().isDisplayed());
        homePage.clickBtnSearch();

        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertTrue(productsPage.getResultWithFindedProducts().getText().contains("За запитом «Ноутбук» знайдено"));
    }
}
