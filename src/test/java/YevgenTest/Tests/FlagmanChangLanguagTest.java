package YevgenTest.Tests;

import TestsOlgaVerom.pageObjects.TestInit;

import YevgenTest.PageObjects.FlagHomePage;
import org.testng.annotations.Test;

public class FlagmanChangLanguagTest extends TestInit {

    @Test
    public void changesLanguages(){
        FlagHomePage flagHomePage = new FlagHomePage(driver);
        flagHomePage.navigateFlagman();
        flagHomePage.checkLanguageRu();
        flagHomePage.checkLanguageUa();
    }
}
