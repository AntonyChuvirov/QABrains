package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProductSortingHotline extends TestInit {

    @Test
    public void CheckProductSortingHotline(){

        HomePage homePage = new HomePage(driver);

        homePage.goToHomePageHotline();
        homePage.clickBtnInCatalogTourismAndFishing();

        ProductsPage productsPage = new ProductsPage(driver);

        Assert.assertTrue(productsPage.getListCatalogProducts().isDisplayed());
        Assert.assertTrue(productsPage.getFieldTourismAndFishing().isDisplayed());
        Assert.assertTrue(productsPage.getPageWithTextTourismAndFishing().getText().contains("Туризм, Риболовля"));
        Assert.assertTrue(productsPage.getBtnBaggage().getText().contains("Багаж"));
        productsPage.clickBtnBaggage();
        Assert.assertTrue(productsPage.getFieldBaggageProducts().isDisplayed());
        Assert.assertTrue(productsPage.getBtnSuitcase().getText().contains("Валізи"));
        productsPage.clickBtnSuitcase();
        Assert.assertTrue(productsPage.getPageWithNameProduct().getText().contains("Валізу"));
        Assert.assertTrue(productsPage.getSortingField().isDisplayed());
        productsPage.clickCheckBoxTravelBag();
        productsPage.clickCheckBoxMediumSize();
        productsPage.clickCheckBoxVolume31_50l();
        productsPage.clickBtnExpandBrandsFilters();
        productsPage.clickCheckBoxBrandArena();
        productsPage.clickCheckBoxBrandPiquardo();
        Assert.assertTrue(productsPage.getFieldExpandOtherFilters().isDisplayed());
        productsPage.clickBtnExpandOtherFilters();
        productsPage.clickCheckBox4Wheels();
        productsPage.clickCheckBox3__3_99Kg();
        productsPage.clickCheckBlackColor();
        productsPage.clickCheckBoxPolycarbonateMaterial();
        Assert.assertTrue(productsPage.getFieldWithProducts().isDisplayed());
        productsPage.clickToSortedProduct();
    }
}
