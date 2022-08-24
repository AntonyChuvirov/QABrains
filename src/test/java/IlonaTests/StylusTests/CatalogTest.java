package IlonaTests.StylusTests;

import BaseClasses.TestInit;
import IlonaTests.StylusPages.CatalogPageStylus;
import IlonaTests.StylusPages.CheckChosenProductPage;
import IlonaTests.StylusPages.HomePageStylus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CatalogTest extends TestInit {
    @Test
    public void checkCatalog(){
        openUrl("https://stylus.ua/uk/");

        HomePageStylus homePageStylus = new HomePageStylus(driver);
        homePageStylus.changeLanguageBtn().click();
        homePageStylus.clickOnBtnCatalog().click();

        CatalogPageStylus catalogPageStylus = new CatalogPageStylus(driver);
        catalogPageStylus.clickOnBtnInCatalog().click();

        CheckChosenProductPage checkChosenProductPage = new CheckChosenProductPage(driver);
        Assert.assertTrue(checkChosenProductPage.checkChoseProductVisible().isDisplayed());
    }
}
