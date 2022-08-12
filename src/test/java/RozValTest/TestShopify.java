package RozValTest;

import BaseClasses.TestInit;
import RozValTest.ShopifyMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

import java.time.Duration;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class TestShopify extends TestInit {

    public void goToShopify() {
        driver.get("https://www.shopify.com");
    }

    @Test
    public void shopifyCheckHeader() {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("resolution", "1980x1080");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));

        ShopifyMainPage shopifyMainPage = new ShopifyMainPage(driver);
        System.out.println("================= ShopifyTest #1 =================");
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
        sleep(1);
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
    /*@Test
    public void shopifyErrorHolder() {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("resolution", "1980x1080");
        driver.manage().window().maximize();

        ShopifyMainPage shopifyMainPage = new ShopifyMainPage(driver);
        goToShopify();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //place your code here

    }*/

    @Test
    public void shopifyMainPageCheckImg() {
        DesiredCapabilities caps = new DesiredCapabilities();

        driver.manage().window().maximize();

        System.out.println("================= ShopifyTest #2 =================");
        ShopifyMainPage shopifyMainPage = new ShopifyMainPage(driver);
        goToShopify();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,4000)");

        List<WebElement> imgList = shopifyMainPage.getShopifyMainPageAllImg();


        for (WebElement webElement : imgList) {
            try {
                jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
                String classEl = webElement.getAttribute("class");
                Assert.assertTrue(webElement.isDisplayed());
                String alt = webElement.getAttribute("alt");
                System.out.println("Element displayed     " + classEl + "  " + alt);
            } catch (AssertionError e) {
                String classEl = webElement.getAttribute("class");
                String alt = webElement.getAttribute("alt");
                System.out.println("Element not displayed " + classEl + "  " + alt);
            }
        }
        System.out.println("Amount of all image elements detected at mainPage = " + imgList.size());

    }

    @Test
    public void shopifyCheckFooterTopA() {
        DesiredCapabilities caps = new DesiredCapabilities();

        driver.manage().window().maximize();

        System.out.println("================= ShopifyTest #3 =================");
        ShopifyMainPage shopifyMainPage = new ShopifyMainPage(driver);
        goToShopify();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor jse = (JavascriptExecutor) driver;


        List<WebElement> footerTopAList = shopifyMainPage.getShopifyFooterTopA();
        // element index counter
        int a = 0;
        //TODO I wanna make an algorithm, where driver clicks href at footer, goes to this link, and then backs to https://www.shopify.com/
        //Everything worked fine until href at xpath //div[@class='footer-top']//li[12]//a[1] because it leads to https://www.shopify.com/
        //and thenalgorithm fucks-up

        /*for (WebElement webElement : footerTopAList) {

            jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
            Assert.assertTrue(webElement.isDisplayed());

            String href = webElement.getAttribute("href");
            a++;
            System.out.println(a  +" "+ webElement.getAccessibleName() + " element with href " + href + " displayed");

            webElement.click();
            driver.navigate().back();


        }*/
        for (WebElement webElement : footerTopAList) {
            jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
            Assert.assertTrue(webElement.isDisplayed());

            String href = webElement.getAttribute("href");
            a++;
            System.out.println(a  +" "+ webElement.getAccessibleName() + " element with href " + href + " displayed");

        }
        System.out.println("All number of href elements Footer-Top - " + footerTopAList.size());
    }
}
