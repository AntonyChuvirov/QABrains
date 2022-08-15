package Yevgenii.FlagmanTest;

import BaseClasses.TestInit;
import Yevgenii.FlagmanPage.FlagHomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChengeLanguag extends TestInit {

    @Test
    @Description("Check language change")
    public void checkChangesLanguages() {
        FlagHomePage flagHomePage = new FlagHomePage(driver);

        flagHomePage.open();
        flagHomePage.selectLanguageBtnRu();

        Assert.assertEquals(flagHomePage.getResaultLenguagRu().getText(),"Войти с паролем");

        flagHomePage.selectLanguageBtnUa();

        Assert.assertEquals(flagHomePage.getResaultLenguagUa().getText(),"Увійти з паролем");
    }
}
