package DarynaTests.pageObjects.Mojo;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MojoHomePageElements extends BasePage {
    public MojoHomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogoBtn() { return driver.findElement(By.xpath("//div[@class='header_logo hash_links']"));}

    public WebElement getSearchField() { return driver.findElement(By.xpath("//input[@id='search-input']"));}

    public WebElement getSearchFieldBtn() {
        return driver.findElement(By.xpath("//div[@class='header_search_input_submit js-submit-search-header']"));}

    public WebElement getVoiceSearchBtn() { return driver.findElement(By.xpath("//div[@class='header_search_input_voice js-voice-search-trigger']"));}

    public WebElement getVoiceSearchWindow() { return driver.findElement(By.xpath("//div[@class='header_search_voice js-header-voice-popup active']"));}

    public WebElement getLanguageChangeBtn() { return driver.findElement(By.xpath("//div[@class='header_lang']"));}

    public WebElement getLogInBtn() { return driver.findElement(By.xpath("//div[@class='header_cabinet_link js-auth-modal-show']"));}

    public WebElement getLogIn() { return driver.findElement(By.xpath("//div[@class='login-form_tabs_item js-auth-form-tab active']"));}

    public WebElement getCatalogBtn() { return driver.findElement(By.xpath("//div[@class='header_catalog_btn_text']"));}

    public WebElement getCommunicationBtn() { return driver.findElement(By.xpath("//div[@class='widget-opener__button']"));}

    public WebElement contactChannelsWindow() { return driver.findElement(By.xpath("//div[@class='contact-channels open']"));}

    public WebElement getSalesBtn() { return driver.findElement(By.xpath("//li[@class='header_nav_item header_nav_item--actions']"));}
}
