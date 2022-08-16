package Yevgenii.FlagmanTest;

import BaseClasses.TestInit;
import Yevgenii.FlagmanPage.FlagHomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginSite extends TestInit {

    @Test
    @Description("Check the login on the site")
    public void checkLoginSite() {
        FlagHomePage flagHomePage = new FlagHomePage(driver);

        flagHomePage.open();
        flagHomePage.clickLoginBtn();
        flagHomePage.inputFieldNamber();
        flagHomePage.inputFieldPassword();
        flagHomePage.clickEnterBtn();

        Assert.assertTrue(flagHomePage.getVisibilityTextLogin().isDisplayed());
    }
}
