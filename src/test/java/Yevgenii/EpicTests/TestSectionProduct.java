package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSectionProduct extends TestInit {

    @Test
    @Description("Check the Contraceptives product section")
    public void checkSectionProduct() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickMenuProductBtn();
        homePage.actionsMoveTo(homePage.selectSectionProductContraceptives());
        homePage.clickSectionProductContraceptives();
        Assert.assertTrue(homePage.getVisibilityTextContraceptives().isDisplayed());
    }
}
