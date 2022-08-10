package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchField extends TestInit {

    @Test
    public void checkSearchField() {
        HomePage homePage = new HomePage(driver);

        homePage.openHotline();
        homePage.selectSearchField();

        sleep(2);
        Assert.assertTrue(homePage.getResultSearch().isDisplayed());
    }
}
