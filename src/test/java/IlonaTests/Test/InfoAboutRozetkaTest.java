package IlonaTests.Test;

import BaseClasses.TestInit;
import IlonaTests.Pages.CheckInfoAboutRozetkaPage;
import IlonaTests.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InfoAboutRozetkaTest extends TestInit {
    @Test
    public void checkInfoAboutRozetka(){
        openUrl("https://rozetka.com.ua/ua/");

        HomePage homePage = new HomePage(driver);
        homePage.clickBtnInfoAboutCompany().click();

        CheckInfoAboutRozetkaPage checkInfoAboutRozetkaPage = new CheckInfoAboutRozetkaPage(driver);
        Assert.assertTrue(checkInfoAboutRozetkaPage.InfoAboutCompanyVisible().isDisplayed());;
    }
}
