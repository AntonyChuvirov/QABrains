package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeLanguage extends TestInit {

    @Test
    @Description("Check site language change")
    public void checkChangeLanguage() {
        HomePage homePage = new HomePage(driver);

        homePage.open();
        homePage.clickSwitchLanguageBtn();

        Assert.assertTrue(homePage.getVisibilityTextBtnRu().isDisplayed());

        homePage.clickSwitchLanguageBtn();

        Assert.assertTrue(homePage.getVisibilityTextBtnUa().isDisplayed());
    }
}
