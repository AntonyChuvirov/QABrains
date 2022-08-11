package TestsOlya.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import TestsOlya.pageObject.RozetkaHomePageHelper;
import TestsOlya.pageObject.RozetkaSearchResultPage;
import TestsOlya.pageObject.TestInit;

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
    }

    @Test
    public void clicklanguageChangeRU() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getlanguageChangeRU().click();
    }

    @Test
    public void clicklanguageChangeUA() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getlanguageChangeUA().click();
    }

    @Test
    public void checkCatalog() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getCheckCatalog().click();

    }

    @Test
    public void checkCatalogZoo() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getCheckCatalog().click();
        rozetkaHomePageHelper.getCheckCatalogZoo().click();
    }

    @Test
    public void checkLogoHome() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getSearchFieldRozetka().sendKeys("Зубна щітка/n");
        rozetkaHomePageHelper.getCheckLogo().click();
    }

    @Test
     public void checkfreeDelivery() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getCheckFreeDelivery().isDisplayed();
    }

    @Test
    public void checkAddToCart() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();
        rozetkaHomePageHelper.getSales().click();
    }

    @Test
    public void checkShowMore() {
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();
        rozetkaHomePageHelper.getMore().click();
    }

}
