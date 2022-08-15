package Yevgenii.FlagmanTest;

import BaseClasses.TestInit;
import Yevgenii.FlagmanPage.FlagHomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCallBack extends TestInit {

    @Test
    @Description("Check if you can order a call back")
    public void checkCallBack() {
        FlagHomePage flagHomePage = new FlagHomePage(driver);

        flagHomePage.open();
        flagHomePage.clickCallBackHeader();
        flagHomePage.inputNamber();
        flagHomePage.inputName();
        flagHomePage.inputComment();
        flagHomePage.clickCall();

        Assert.assertTrue(flagHomePage.getVisibilityApplicationCall().isDisplayed());
    }
}
