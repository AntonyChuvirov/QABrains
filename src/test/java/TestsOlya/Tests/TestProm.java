package TestsOlya.Tests;

import BaseClasses.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestsOlya.pageObject.PromHomePageHelper;

import java.time.Duration;

public class TestProm extends TestInit {
    @Test
    public void checkSearchProm() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();

        promHomePageHelper.getSearchFieldProm().sendKeys("Зволожувач повітря");
        promHomePageHelper.getSearchImageProm().click();
        Assert.assertTrue(promHomePageHelper.getCheckSerch().isDisplayed());
    }

    @Test
    public void checkLogoProm() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getSearchFieldProm().sendKeys("Зволожувач повітря");
        promHomePageHelper.getSearchImageProm().click();
        promHomePageHelper.getlogoProm().click();
        Assert.assertTrue(promHomePageHelper.getlogoProm().isDisplayed());
    }

    @Test
    public void checkCatalog() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getCheckCatalog().click();
        Assert.assertTrue(promHomePageHelper.getCheckNowBuying().isDisplayed());
    }

    @Test
    public void checklanguageChangeUA() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getlanguageChangeUA().click();
        Assert.assertTrue(promHomePageHelper.getCheckUAA().isDisplayed());
    }

    @Test
    public void checklanguageChangeRU() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getlanguageChangeRU().click();
        Assert.assertTrue(promHomePageHelper.getCheckRU().isDisplayed());
    }

    @Test
    public void checkChat() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getChat().click();
        Assert.assertTrue(promHomePageHelper.getCheckChat().isDisplayed());
    }

    @Test
    public void checkSearchImage() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getSearchImageProm().isDisplayed();
        Assert.assertTrue(promHomePageHelper.getSearchImageProm().isDisplayed());

    }

    @Test
    public void checkShowMore() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        promHomePageHelper.getShowMore().click();
        Assert.assertTrue(promHomePageHelper.getCheckMore().isDisplayed());

    }

    @Test
    public void checkCreateStore() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getCreateStore().click();
        Assert.assertTrue(promHomePageHelper.getCheckCreateStore().isDisplayed());
    }

    @Test
    public void checkRegion() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getRegion().click();
        Assert.assertTrue(promHomePageHelper.getCheckRegion().isDisplayed());
    }
@Test
    public void checkPersonalAccount() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getPersonalAccount().click();
        Assert.assertTrue(promHomePageHelper.getCheckCreateAccount().isDisplayed());
    }
}

