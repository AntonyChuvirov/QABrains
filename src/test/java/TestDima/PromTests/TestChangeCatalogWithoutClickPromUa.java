package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import TestDima.PromPages.PageCatalogElementsPromUa;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeCatalogWithoutClickPromUa extends TestInit {

    @Test
    public void checkChangeCatalogWithoutClickPromUa(){

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();

        PageCatalogElementsPromUa pageCatalogElementsPromUa = new PageCatalogElementsPromUa(driver);
        Actions actions = new Actions(driver);

        actions.moveToElement(pageCatalogElementsPromUa.getBtnHouseAndGarden()).build().perform();
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldGarden().isDisplayed());
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldDishes().isDisplayed());
        actions.moveToElement(pageCatalogElementsPromUa.getBtnTechnicsAndElectronics()).build().perform();
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldHouseholdAppliances().isDisplayed());
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldAutomotiveElectronics().isDisplayed());
        actions.moveToElement(pageCatalogElementsPromUa.getBtnAccessoriesAndDecorations()).build().perform();
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldJewelry().isDisplayed());
        Assert.assertTrue(pageCatalogElementsPromUa.geFieldHaberdasheryAndAccessories().isDisplayed());
        actions.moveToElement(pageCatalogElementsPromUa.getBtnMedicinesAndMedicalProducts()).build().perform();
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldNaturalDrugs().isDisplayed());
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldMedicalProducts().isDisplayed());
        actions.moveToElement(pageCatalogElementsPromUa.getBtnAutoMoto()).build().perform();
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldMototechnics().isDisplayed());
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldAutoTool().isDisplayed());
    }
}
