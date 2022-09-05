package DarynaTests.tests;

import BaseClasses.TestInit;
import DarynaTests.pageObjects.Rztk.RztkHomePageElements;
import DarynaTests.pageObjects.Rztk.RztkPowerBankPage;
import DarynaTests.pageObjects.Rztk.RztkSearchResultsPB;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class TestRztk extends TestInit {

    @Test
    public void checkLanguageChangeBtn() {
        openUrl("https://rozetka.com.ua/ua/");
        RztkHomePageElements rztkHomePageElements = new RztkHomePageElements(driver);
        rztkHomePageElements.getLanguageChangRU().click();
        rztkHomePageElements.getLanguageChangUA().click();

        Assert.assertTrue(rztkHomePageElements.getLanguageChangUA().isEnabled());
    }

    @Test
    public void checkLogoBtn() {
        openUrl("https://rozetka.com.ua/ua/");
        RztkHomePageElements rztkHomePageElements = new RztkHomePageElements(driver);

        Assert.assertTrue(rztkHomePageElements.getLogoBtn().isDisplayed());
    }

    @Test
    public void checkSearchFieldBtn() {
        openUrl("https://rozetka.com.ua/ua/");
        RztkHomePageElements rztkHomePageElements = new RztkHomePageElements(driver);
        rztkHomePageElements.getSearchField().sendKeys("повербанк");
        rztkHomePageElements.getSearchBtn().click();
        RztkSearchResultsPB rztkSearchResultsPB = new RztkSearchResultsPB(driver);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//h1[@class='catalog-heading ng-star-inserted']")));

        Assert.assertTrue(rztkSearchResultsPB.getResultsPage().isDisplayed());
    }

    @Test
    public void checkBasketBtn() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        openUrl("https://rozetka.com.ua/ua/");
        RztkHomePageElements rztkHomePageElements = new RztkHomePageElements(driver);
        rztkHomePageElements.getSearchField().sendKeys("157852276\n");
        RztkPowerBankPage rztkPowerBankPage = new RztkPowerBankPage(driver);
        rztkPowerBankPage.getBuyBtn().click();

        Assert.assertTrue(rztkPowerBankPage.getBasketBtn().isDisplayed());
    }

    @Test
    public  void checkCatalogBtn() {
        openUrl("https://rozetka.com.ua/ua/");
        RztkHomePageElements rztkHomePageElements = new RztkHomePageElements(driver);
        rztkHomePageElements.getCatalogBtn().click();
        Actions actions = new Actions(driver);
        actions.moveToElement(rztkHomePageElements.getPetProductCategory());
        actions.perform();
        sleep(5);
        rztkHomePageElements.getAquariumCategory().click();


    }

    @Test
    public void checkLinkToDonat() {
        openUrl("https://rozetka.com.ua/ua/");
        RztkHomePageElements rztkHomePageElements = new RztkHomePageElements(driver);

        Assert.assertTrue(rztkHomePageElements.getDonatPage().isDisplayed());
    }

    @Test
    public void checkLogIn() {
        openUrl("https://rozetka.com.ua/ua/");
        RztkHomePageElements rztkHomePageElements = new RztkHomePageElements(driver);
        rztkHomePageElements.getLogInBtn().click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[@class='header__button ng-star-inserted']")));

        Assert.assertTrue(rztkHomePageElements.getLogInWindow().isDisplayed());
    }

    @Test
    public void checkMenuBtn() {
        openUrl("https://rozetka.com.ua/ua/");
        RztkHomePageElements rztkHomePageElements = new RztkHomePageElements(driver);
        rztkHomePageElements.getMenuBtn().click();

        Assert.assertTrue(rztkHomePageElements.getMenuWindow().isDisplayed());
    }

    @Test
    public void checkPromoBtn() {
        openUrl("https://rozetka.com.ua/ua/");
        RztkHomePageElements rztkHomePageElements = new RztkHomePageElements(driver);
        rztkHomePageElements.getPromoBtn().click();


    }
}
