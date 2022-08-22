package IlonaTests.StylusTests;

import BaseClasses.TestInit;
import IlonaTests.StylusPages.CatalogPageStylus;
import IlonaTests.StylusPages.CheckLogoPage;
import IlonaTests.StylusPages.HomePageStylus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoStylusTest extends TestInit {
    @Test
    public void clickLogoBtn() {
        openUrl("https://stylus.ua/uk/");

        HomePageStylus homePageStylus = new HomePageStylus(driver);
        homePageStylus.changeLanguageBtn().click();

        homePageStylus.clickOnBtnCatalog().click();

        CatalogPageStylus catalogPageStylus = new CatalogPageStylus(driver);
        catalogPageStylus.clickOnBtnInCatalog().click();
        catalogPageStylus.clickOnLogo().click();

        CheckLogoPage checkLogoPage = new CheckLogoPage(driver);
        Assert.assertTrue(checkLogoPage.checkLogoBtn().isDisplayed());

    }
}
