package TestsOlya.Tests;

import BaseClasses.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestsOlya.pageObject.RozetkaHomePageHelper;
import TestsOlya.pageObject.RozetkaSearchResultPage;

public class TestRozetka extends TestInit {
    @Test
    public void clickEnterBtn() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getSearchImage().click();

        RozetkaSearchResultPage rozetkaSearchResultPage = new RozetkaSearchResultPage(driver);
        Assert.assertTrue(rozetkaSearchResultPage.getSearchImage().isDisplayed());
    }

    @Test
    public void checkSearch() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getSearchFieldRozetka().sendKeys("Зубна щітка");
        rozetkaHomePageHelper.getSearchImage().click();
        Assert.assertTrue(rozetkaHomePageHelper.getPageWithNameProduct().getText().contains("Зубна щітка"));
    }

    @Test
    public void clicklanguageChangeUA() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getlanguageChangeUA().click();
        Assert.assertTrue(rozetkaHomePageHelper.getCheckUA().getText().contains("Знайти"));
    }

    @Test
    public void clicklanguageChangeRU() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getlanguageChangeRU().click();
        Assert.assertTrue(rozetkaHomePageHelper.getCheckRU().getText().contains("Найти"));
    }

    @Test
    public void checkCatalog() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getCheckCatalog().click();
        Assert.assertTrue(rozetkaHomePageHelper.getCheckCatalogIMG().isDisplayed());
    }

    @Test
    public void checkCatalogZoo() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getCheckCatalog().click();
        rozetkaHomePageHelper.getCheckCatalogZoo().click();
        Assert.assertTrue(rozetkaHomePageHelper.getCheckCatalogZOO().isDisplayed());
    }

    @Test
    public void checkLogoHome() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getSearchFieldRozetka().sendKeys("Зубна щітка/n");
        rozetkaHomePageHelper.getCheckLogo().click();
        Assert.assertTrue(rozetkaHomePageHelper.getCheckUA().getText().contains("Знайти"));
    }

    @Test
     public void checkfreeDelivery() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getCheckFreeDelivery().isDisplayed();
        Assert.assertTrue(rozetkaHomePageHelper.getCheckFreeDelivery().isDisplayed());
    }

    @Test
    public void checkAddToCart() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();
        rozetkaHomePageHelper.getSales().click();
        Assert.assertTrue(rozetkaHomePageHelper.getCheckSale().isDisplayed());
    }

    @Test
    public void checkShowMore() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();
        rozetkaHomePageHelper.getMore().click();
        Assert.assertTrue(rozetkaHomePageHelper.getCheckMoree().isDisplayed());

    }

}
