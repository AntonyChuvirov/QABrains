package Yevgenii.FlagmanTest;

import BaseClasses.TestInit;
import Yevgenii.FlagmanPage.FlagHomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFieldInput extends TestInit {

    @Test
    @Description("Check the product search term")
    public void checkFieldInput() {
        FlagHomePage flagHomePage = new FlagHomePage(driver);

        flagHomePage.open();
        flagHomePage.selectFieldInput();
        flagHomePage.selectSearchBtn();

        Assert.assertEquals(flagHomePage.getVisibilityText().getText(),"«АТРАКТАНТ»");

        flagHomePage.selectFieldInput1();
        flagHomePage.selectSearchBtn();

        Assert.assertEquals(flagHomePage.getVisibilityNotText().getText(),"Нічого не знайдено");
    }
}
