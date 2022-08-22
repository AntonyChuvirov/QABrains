package IlonaTests.Test;

import BaseClasses.TestInit;
import IlonaTests.Pages.AndroidPage;
import IlonaTests.Pages.HomePage;
import IlonaTests.Pages.IosPage;
import IlonaTests.Pages.PopUpWindowPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;


public class AppBtnTest extends TestInit {

    @Test
    public void testingAppBtn() {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        openUrl("https://rozetka.com.ua/ua/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        HomePage homePage = new HomePage(driver);
        homePage.clickTheBtnOpenMenu().click();

        PopUpWindowPage popUpWindowPage = new PopUpWindowPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        scrollToElement(popUpWindowPage.clickAppBtnAndroid());

        popUpWindowPage.clickAppBtnAndroid().click();
        changeTab(0);

        AndroidPage androidPage = new AndroidPage(driver);
        Assert.assertTrue(androidPage.GooglePlayVisible().isDisplayed());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        scrollToElement(popUpWindowPage.clickAppBtnAndroid());
        popUpWindowPage.clickAppBtnIos().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        changeTab(2);

        IosPage iosPage = new IosPage(driver);
        Assert.assertTrue(iosPage.AppleStoreVisible().isDisplayed());
    }
}