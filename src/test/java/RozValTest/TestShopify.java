package tests;

import BaseClasses.TestInit;
import RozValTest.ShopifyMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

import java.time.Duration;

public class TestShopify extends TestInit {

    public void goToShopify(){driver.get("https://www.shopify.com/restaurant-online-ordering");}
    @Test
    public void checkHeader()  {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("resolution", "1980x1080");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));

        ShopifyMainPage shopifyMainPage = new ShopifyMainPage(driver);

        //Start
        goToShopify();

        Assert.assertTrue(shopifyMainPage.getLogoShopify().isDisplayed());
        shopifyMainPage.getStartBtn().click();
        shopifyMainPage.getStartYourBusinessBtn().click();
        shopifyMainPage.getContactsHrefMap().click();
        Assert.assertTrue(shopifyMainPage.getContactsBigWomanImg().isDisplayed());

        //Sell
        shopifyMainPage.getSellBtn().click();
        Assert.assertTrue(shopifyMainPage.getSellEverywhereBtn().isDisplayed());
        shopifyMainPage.getSellEverywhereBtn().click();
        Assert.assertTrue(shopifyMainPage.getSellSpanText().isDisplayed());

        //Market
        Assert.assertTrue(shopifyMainPage.getMarketBtn().isDisplayed());
        shopifyMainPage.getMarketBtn().click();
        Assert.assertTrue(shopifyMainPage.getMarketEmailMarketingBtn().isDisplayed());
        shopifyMainPage.getMarketEmailMarketingBtn().click();
        Assert.assertTrue(shopifyMainPage.getMarketLogToCreateCampaignBtn().isDisplayed());
        shopifyMainPage.getMarketLogToCreateCampaignBtn().click();
        driver.navigate().back();
        Assert.assertTrue(shopifyMainPage.getLogoShopify().isDisplayed());

        //Manage
        shopifyMainPage.getLogoShopify().click();
        shopifyMainPage.getManageBtn().click();
        Assert.assertTrue(shopifyMainPage.getManagePaymentsBtn().isDisplayed());
        shopifyMainPage.getManagePaymentsBtn().click();
        sleep(2);
        Assert.assertTrue(shopifyMainPage.getManagePaymentsInstallmentsBtn().isDisplayed());
        shopifyMainPage.getManagePaymentsInstallmentsBtn().click();
        Assert.assertTrue(shopifyMainPage.getManagePaymentsInstallmentsFiftyPercentsStrong().isDisplayed());

        //Pricing
        Assert.assertTrue(shopifyMainPage.getPricingBtn().isDisplayed());
        shopifyMainPage.getPricingBtn().click();
        //email test57tin@gmail.com
        shopifyMainPage.getPricingEmailInput().sendKeys("test57tin@gmail.com");
        Assert.assertTrue(shopifyMainPage.getPricingEmailSubmitBtn().isDisplayed());
        shopifyMainPage.getPricingEmailSubmitBtn().click();
        driver.navigate().back();

        //Learn
        Assert.assertTrue(shopifyMainPage.getLearnBtn().isDisplayed());
        shopifyMainPage.getLearnBtn().click();
        sleep(2);
        Assert.assertTrue(shopifyMainPage.getLearnBlogBtn().isDisplayed());
        shopifyMainPage.getLearnBlogBtn().click();
        shopifyMainPage.getLearnMerchantBlogBtn().click();
        Assert.assertTrue(shopifyMainPage.getLearnMerchantBlogShopifyTodayLabel().isDisplayed());


    }
    // I use this to handle some parts of big test that is shown upper
    @Test
    public void errorHolder(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("resolution", "1980x1080");
        driver.manage().window().maximize();

        ShopifyMainPage shopifyMainPage = new ShopifyMainPage(driver);
        goToShopify();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //place your code here

    }
}
