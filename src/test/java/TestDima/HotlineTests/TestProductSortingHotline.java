package TestDima.HotlineTests;

import BaseClasses.TestInit;
import TestDima.HotlinePages.HomePageHotlineHotline;
import TestDima.HotlinePages.ProductsPageHotlineHotline;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProductSortingHotline extends TestInit {

    @Test
    public void CheckProductSortingHotline(){

        HomePageHotlineHotline homePageHotline = new HomePageHotlineHotline(driver);

        homePageHotline.goToHomePageHotline();
        homePageHotline.clickBtnInCatalogTourismAndFishing();

        ProductsPageHotlineHotline productsPageHotline = new ProductsPageHotlineHotline(driver);

        Assert.assertTrue(productsPageHotline.getListCatalogProducts().isDisplayed());
        Assert.assertTrue(productsPageHotline.getFieldTourismAndFishing().isDisplayed());
        Assert.assertTrue(productsPageHotline.getPageWithTextTourismAndFishing().getText().contains("Туризм, Риболовля"));
        Assert.assertTrue(productsPageHotline.getBtnBaggage().getText().contains("Багаж"));
        productsPageHotline.clickBtnBaggage();
        Assert.assertTrue(productsPageHotline.getFieldBaggageProducts().isDisplayed());
        Assert.assertTrue(productsPageHotline.getBtnSuitcase().getText().contains("Валізи"));
        productsPageHotline.clickBtnSuitcase();
        Assert.assertTrue(productsPageHotline.getPageWithNameProduct1().getText().contains("Валізу"));
        Assert.assertTrue(productsPageHotline.getSortingField().isDisplayed());
        productsPageHotline.clickCheckBoxTravelBag();
        productsPageHotline.clickCheckBoxMediumSize();
        productsPageHotline.clickCheckBoxVolume31_50l();
        productsPageHotline.clickBtnExpandBrandsFilters();
        productsPageHotline.clickCheckBoxBrandCheckBoxBrandAmericanTourister();
        productsPageHotline.clickCheckBoxBrandPiquardo();
        Assert.assertTrue(productsPageHotline.getFieldExpandOtherFilters().isDisplayed());
        productsPageHotline.clickBtnExpandOtherFilters();
        productsPageHotline.clickCheckBox4Wheels();
        productsPageHotline.clickCheckBox3__3_99Kg();
        productsPageHotline.clickCheckBlackColor();
        productsPageHotline.clickCheckBoxPolycarbonateMaterial();
        Assert.assertTrue(productsPageHotline.getFieldWithSortedProducts().isDisplayed());
        productsPageHotline.clickToSortedProduct();
    }
}
