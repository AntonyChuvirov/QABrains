package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import TestDima.Pages.HomePageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchField extends TestInit {

    @Test
    public void checkSearchField() {
        HomePage homePage = new HomePage(driver);
        HomePageElements homePageElements = new HomePageElements(driver);
        homePage.goToHotline();
        homePage.inputToSearchFieldLaptop();
        Assert.assertTrue(homePageElements.getSearchBtn().isDisplayed());
        homePage.clickSearchBtn();
        Assert.assertTrue(homePage.getSearchField().isDisplayed());
    }
}
