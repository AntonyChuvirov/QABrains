package IlonaTests.Test;

import BaseClasses.TestInit;
import IlonaTests.Pages.CheckPointCheckOutPage;
import IlonaTests.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointCheckOutTest extends TestInit {
    @Test
    public void checkPointCheckOut(){
        openUrl("https://rozetka.com.ua/ua/");

        HomePage homePage = new HomePage(driver);
        homePage.clickBtnPointCheckOut().click();

        CheckPointCheckOutPage checkPointCheckOutPage = new CheckPointCheckOutPage(driver);
        Assert.assertTrue(checkPointCheckOutPage.pointCheckOutVisible().isDisplayed());
    }
}
