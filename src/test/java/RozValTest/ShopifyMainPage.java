package RozValTest;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShopifyMainPage extends BasePage {

    public ShopifyMainPage(WebDriver driver) {
        super(driver);
    }


    //test 1 - elements shopifyCheckHeader ===================================================================================

    public WebElement getLogoShopify() {
        return driver.findElement(By.xpath("//a[@data-ga-action='Logo']"));
    }

    public WebElement getStartBtn() {
        return driver.findElement(By.xpath("//button[@data-ga-action=\"Start Nav\"][1]"));
    }

    public WebElement getStartYourBusinessBtn() {
        return driver.findElement(By.xpath("//a[@data-ga-action=\"Start\"][1]"));
    }

    public WebElement getContactsHrefMap() {
        return driver.findElement(By.xpath("//a[@href=\"/contact\"][1]"));
    }

    public WebElement getContactsBigWomanImg() {
        return driver.findElement(By.xpath("//picture[@class='picture channel-hero-next__image-spill']"));
    }


    public WebElement getSellBtn() {
        return driver.findElement(By.xpath("//button[@data-ga-action=\"Sell Nav\"][1]"));
    }

    public WebElement getSellEverywhereBtn() {
        return driver.findElement(By.xpath("//a[@href=\"/sell\"][1]"));
    }

    public WebElement getSellSpanText() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Sell ')]"));
    }


    public WebElement getMarketBtn() {
        return driver.findElement(By.xpath("//button[@data-ga-action=\"Market Nav\"][1]"));
    }

    public WebElement getMarketEmailMarketingBtn() {
        return driver.findElement(By.xpath("//a[@data-ga-action=\"Email marketing\"][1]"));
    }

    public WebElement getMarketLogToCreateCampaignBtn() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Log in to create campaign')][1]"));
    }

    public WebElement getManageBtn() {
        return driver.findElement(By.xpath("(//button[@data-ga-action=\"Manage Nav\"])[1]"));
    }

    public WebElement getManagePaymentsBtn() {
        return driver.findElement(By.xpath("//button[@data-ga-action=\"Payments\"][1]"));
    }

    public WebElement getManagePaymentsInstallmentsBtn() {
        return driver.findElement(By.xpath("//a[@data-ga-action=\"Installments\"][1]"));
    }

    public WebElement getManagePaymentsInstallmentsFiftyPercentsStrong() {
        return driver.findElement(By.xpath("//strong[normalize-space()='50%']"));
    }

    public WebElement getShopifyPricingBtn() {
        return driver.findElement(By.xpath("//a[@data-ga-action=\"Pricing\"][1]"));
    }

    public WebElement getPricingEmailInput() {
        return driver.findElement(By.xpath("(//input[@type='email'])[2]"));
    }

    public WebElement getPricingEmailSubmitBtn() {
        return driver.findElement(By.xpath("//button[@data-event-label='heading']"));
    }

    public WebElement getLearnBtn() {
        return driver.findElement(By.xpath("//button[@data-ga-action='Learn Nav'][1]"));
    }

    public WebElement getLearnBlogBtn() {
        return driver.findElement(By.xpath("//button[@data-ga-action='Blog'][1]"));
    }

    public WebElement getLearnMerchantBlogBtn() {
        return driver.findElement(By.xpath("//a[@data-ga-action=\"Merchant Blog\"][1]"));
    }

    public WebElement getLearnMerchantBlogShopifyTodayLabel() {
        return driver.findElement(By.xpath("//h1[contains(text(), 'with Shopify today')]"));
    }

    // 2 test elements shopifyMainPageCheckImg ===================================================================================
    public List<WebElement> getShopifyMainPageAllImg() {
        return driver.findElements(By.xpath("//img"));//[contains(@class, 'lazyloaded')]
    }

    //3 test elements shopifyCheckFooterTopA ===================================================================================
    public List<WebElement> getShopifyFooterTopA() {
        return driver.findElements(By.xpath("//div[contains(@class, 'footer-top')]//li//a"));
    }
    public List<WebElement> getShopifyFooterBottomA() {
        return driver.findElements(By.xpath("//div[@class='footer-bottom']//a"));
    }

    //4 test elements LanguagesTest ===================================================================================
    public List<WebElement> getShopifyLanguagesA() {
        return driver.findElements(By.xpath("//ul[@aria-labelledby=\"country-select-heading\"]//a"));
    }
    public WebElement getShopifyLanguageChangeBtn() {
        return driver.findElement(By.xpath("//button[@data-ga-label=\"CountrySelector\"]"));
    }
    public WebElement getShopifyCookiesAcceptBtn() {
        return driver.findElement(By.xpath("//div[contains(@class, 'cookies-notice__inner')]//button[contains(text(), 'OK')]"));
    }
    //5 test prisingTest================================================================================================

    public List<WebElement> getShopifyPrisingPlansPrises() {
        return driver.findElements(By.xpath("//div[contains(@class,'pricing-redesign__pricing-card ')]//div[contains(@class,'pricing-content__monthly')]//span[contains(@class,'price heading--1')]"));
    }
    public List<WebElement> getShopifyPrisingPlansPrisesDiscounted() {
        return driver.findElements(By.xpath("//div[contains(@class,'pricing-redesign__pricing-card ')]//div[contains(@class,'pricing-content__yearly')]//span[contains(@class,'price heading--1')]"));
    }
    public List<WebElement> getShopifyPrisingTryFreeBtns() {
        return driver.findElements(By.xpath("//div[contains(@class, 'pricing-redesign__cards-container')]//button[contains(@data-event-category, \"pricing card\")]"));
    }
    public WebElement getShopifyPrisingYearlyBtn() {
        return driver.findElement(By.xpath("//button[@data-event-label=\"yearly\"]"));
    }
    public WebElement getShopifyPrisingMonthlyBtn() {
        return driver.findElement(By.xpath("//button[@data-event-label=\"monthly\"]"));
    }
    //N
}
