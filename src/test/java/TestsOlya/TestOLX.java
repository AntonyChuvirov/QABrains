package TestsOlya;

import BaseClasses.TestInit;
import TestsOlya.pageObject.OLXHomePageHelper;
import org.testng.annotations.Test;

@Test
public class TestOLX extends TestInit {
    public void checkCloseIcon() {
        OLXHomePageHelper olxHomePageHelper = new OLXHomePageHelper(driver);
        olxHomePageHelper.navigateOLX();
        olxHomePageHelper.getCheckCloseIcon().click();
    }

    @Test
    public void checkLogo() {
        OLXHomePageHelper olxHomePageHelper = new OLXHomePageHelper(driver);
        olxHomePageHelper.navigateOLX();
        olxHomePageHelper.getCheckLogo().click();
    }

    @Test
    public void checkCloseCookie() {
        OLXHomePageHelper olxHomePageHelper = new OLXHomePageHelper(driver);
        olxHomePageHelper.navigateOLX();
        olxHomePageHelper.getCloseCookie().click();
    }



}