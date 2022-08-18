package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import TestDima.PromPages.PageCatalogElementsPromUa;
import TestDima.PromPages.ProductsPagePromUa;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeCatalogByMousePromUa extends TestInit {

    @Test
    public void checkChangeCatalogByMouse(){

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();

        PageCatalogElementsPromUa pageCatalogElementsPromUa = new PageCatalogElementsPromUa(driver);
        Actions actions = new Actions(driver);

        actions.moveToElement(pageCatalogElementsPromUa.getBtnHouseAndGarden()).build().perform();
//        Assert.assertTrue(pageCatalogElementsPromUa.getFieldGarden().getText().contains("Cад"));
//        Assert.assertTrue(pageCatalogElementsPromUa.getFieldModernHouse().getText().contains("Сучасний будинок"));
        actions.moveToElement(pageCatalogElementsPromUa.getBtnTechnicsAndElectronics()).build().perform();
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldHouseholdAppliances().getText().contains("Побутова техніка"));
//        Assert.assertTrue(pageCatalogElementsPromUa.getFieldTV_AndVideoEquipment().getText().contains("TV та відеотехніка"));
        actions.moveToElement(pageCatalogElementsPromUa.getBtnAccessoriesAndDecorations()).build().perform();
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldJewelry().getText().contains("Ювелірні вироби"));
        Assert.assertTrue(pageCatalogElementsPromUa.geFieldHaberdasheryAndAccessories().getText().contains("Галантерея та аксесуари"));
//        actions.moveToElement(pageCatalogElementsPromUa.getBtnMedicinesAndMedicalProducts()).build().perform();
//        Assert.assertTrue(pageCatalogElementsPromUa.getFieldNaturalDrugs().getText().contains("Натуральні препарати"));
//        Assert.assertTrue(pageCatalogElementsPromUa.getFieldMedicalProducts().getText().contains("Товари медичного призначення"));
        actions.moveToElement(pageCatalogElementsPromUa.getBtnAutoMoto()).build().perform();
        Assert.assertTrue(pageCatalogElementsPromUa.getFieldMototechnics().getText().contains("Мототехніка"));
//        Assert.assertTrue(pageCatalogElementsPromUa.getFieldAutoTool().getText().contains("Автоінструмент"));
    }
}
