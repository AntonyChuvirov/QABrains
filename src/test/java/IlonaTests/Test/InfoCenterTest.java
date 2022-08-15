package IlonaTests.Test;

import BaseClasses.TestInit;
import IlonaTests.Pages.HomePage;
import IlonaTests.Pages.InfoCenterCheck;
import IlonaTests.Pages.PopUpWindowPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class InfoCenterTest extends TestInit {
    @Test
    public void InfoCenterTesting(){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        openUrl("https://rozetka.com.ua/ua/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        HomePage homePage = new HomePage(driver);
        homePage.clickTheBtnOpenMenu().click();

        PopUpWindowPage popUpWindowPage = new PopUpWindowPage(driver);
        popUpWindowPage.clickInfoBtn().click();

        InfoCenterCheck infoCenterCheck = new InfoCenterCheck(driver);
        Assert.assertTrue(infoCenterCheck.InfoCenterVisible().isDisplayed());


    }
}
