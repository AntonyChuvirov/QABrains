package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddressStore extends TestInit {

    @Test
    @Description("Check the store's address change")
    public void CheckAddressStore() {
        HomePage homePage = new HomePage(driver);

        homePage.open();
        homePage.clickBtnAddressStore();
        homePage.clickAddressStore();

        Assert.assertTrue(homePage.getVisibilityTextAddress().getText().contains("Бровари"));
    }
}
