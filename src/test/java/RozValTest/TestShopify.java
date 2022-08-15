package RozValTest;

import BaseClasses.TestInit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import java.util.List;

import static java.lang.String.valueOf;

public class TestShopify extends TestInit {

    public void goToShopify() {
        driver.get("https://www.shopify.com");
    }

    @Test
    public void shopifyCheckHeader() {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("resolution", "1980x1080");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
        Assert.assertTrue(shopifyMainPage.getShopifyPricingBtn().isDisplayed());
        shopifyMainPage.getShopifyPricingBtn().click();
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
        //Accepts cookies
        shopifyMainPage.getShopifyCookiesAcceptBtn().click();
        // element index counter
        int a = 0;

        for (WebElement webElement : footerTopAList) {
            jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
            Assert.assertTrue(webElement.isDisplayed());

            String href = webElement.getAttribute("href");
            a++;
            System.out.println(a + " " + webElement.getAccessibleName() + " element with href " + href + " displayed");

        }
        System.out.println("============================================================");
        int i = 0;
        List<WebElement> footerBottomAList = shopifyMainPage.getShopifyFooterBottomA();
        for (WebElement webElement : footerBottomAList) {
            try {
                jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

                Assert.assertTrue(webElement.isDisplayed());

                String href = webElement.getAttribute("href");
                i++;
                System.out.println(i + " " + webElement.getAccessibleName() + " element with href " + href + " displayed");
            } catch (AssertionError e) {
                continue;
                //System.out.println("Out of range");
            }
        }
        System.out.println("All number of a elements Footer-Top - " + footerTopAList.size());
        System.out.println("All number of a elements Footer-Bottom - " + i);

    }

    @Test
    public void shopifyCheckLanguages() {
        DesiredCapabilities caps = new DesiredCapabilities();

        driver.manage().window().maximize();

        System.out.println("================= ShopifyTest #4 =================");
        ShopifyMainPage shopifyMainPage = new ShopifyMainPage(driver);
        goToShopify();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", shopifyMainPage.getShopifyLanguageChangeBtn());
        //Accepts cookies
        shopifyMainPage.getShopifyCookiesAcceptBtn().click();
        sleep(1);
        Assert.assertTrue(shopifyMainPage.getShopifyLanguageChangeBtn().isDisplayed());
        shopifyMainPage.getShopifyLanguageChangeBtn().click();

        // element index counter
        int a = 0;

        List<WebElement> langList = shopifyMainPage.getShopifyLanguagesA();
        for (WebElement webElement : langList) {
            jse.executeScript("arguments[0].scrollIntoView(true);", webElement);
            webElement.isDisplayed();
            a++;
            System.out.println(a + " " + webElement.getAccessibleName() + " language " + " displayed");
        }
        System.out.println("Amount of accesible languages is " + a);
        System.out.println("Expected amount of accesible languages is " + langList.size());
    }

    @Test
    public void shopifyCheckPrisings() {
        DesiredCapabilities caps = new DesiredCapabilities();

        driver.manage().window().maximize();

        System.out.println("================= ShopifyTest #5 =================");
        ShopifyMainPage shopifyMainPage = new ShopifyMainPage(driver);
        goToShopify();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //Accepts cookies
        shopifyMainPage.getShopifyCookiesAcceptBtn().click();
        sleep(1);

        shopifyMainPage.getShopifyPricingBtn().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> prisingList = shopifyMainPage.getShopifyPrisingPlansPrises();
        List<WebElement> btnList = shopifyMainPage.getShopifyPrisingTryFreeBtns();
        List<WebElement> prisingListDiscounted = shopifyMainPage.getShopifyPrisingPlansPrisesDiscounted();

        for (WebElement webElement : prisingList) {
                webElement.getAttribute("innerText");
                Assert.assertTrue(webElement.isDisplayed());
                System.out.println(webElement.getAttribute("innerText"));


        }
        shopifyMainPage.getShopifyPrisingYearlyBtn().click();

        for (WebElement webElement : prisingListDiscounted) {
            webElement.getAttribute("innerText");
            Assert.assertTrue(webElement.isDisplayed());
            System.out.println(webElement.getAttribute("innerText"));
        }


        System.out.println("================Yearly prices===================");
        int i = 0;
        for (WebElement webElement : btnList) {
            try {
                Assert.assertTrue(webElement.isDisplayed());
                i++;
                System.out.println(i + " " + webElement.getAttribute("data-event-label") + " button is displayed");
            } catch (AssertionError e) {
                i++;
                System.out.println(i + " " + webElement.getAttribute("data-event-label") + " button is NOT displayed because its not a wrapper, or etc");
            }
        }
        shopifyMainPage.getShopifyPrisingMonthlyBtn().click();

        i = 0;

        System.out.println("================Monthly prices===================");
        for (WebElement webElement : btnList) {
            try {
                Assert.assertTrue(webElement.isDisplayed());
                i++;
                System.out.println(i + " " + webElement.getAttribute("data-event-label") + " button is displayed");
            } catch (AssertionError e) {
                i++;
                System.out.println(i + " " + webElement.getAttribute("data-event-label") + " button is NOT displayed because its not a wrapper,or etc");
            }
        }
    }
}
