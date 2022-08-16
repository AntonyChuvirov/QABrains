package IlonaTests.StylusTests;

import BaseClasses.TestInit;
import IlonaTests.StylusPages.CreditInfoPage;
import IlonaTests.StylusPages.HomePageStylus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreditInfoTest extends TestInit {
    @Test
    public void CreditInfoCheck(){
        openUrl("https://stylus.ua/uk/");

        HomePageStylus homePageStylus = new HomePageStylus(driver);
        homePageStylus.clickBtnCredit().click();

        CreditInfoPage creditInfoPage = new CreditInfoPage(driver);
        Assert.assertTrue(creditInfoPage.checkInfoCredit().isDisplayed());
    }
}
