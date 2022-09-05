package DarynaTests.tests;

import BaseClasses.TestInit;
import DarynaTests.pageObjects.Mojo.MojoHomePageElements;
import DarynaTests.pageObjects.Mojo.MojoSearchResults;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMojo extends TestInit {

    @Test
    public void checkLogoBtn() {
        openUrl("https://www.moyo.ua/ua/");
        MojoHomePageElements mojoHomePageElements = new MojoHomePageElements(driver);
        mojoHomePageElements.getLogoBtn().click();

        Assert.assertTrue(mojoHomePageElements.getLogoBtn().isDisplayed());
    }

    @Test
    public void checkLogIn() {
        openUrl("https://www.moyo.ua/ua/");
        MojoHomePageElements mojoHomePageElements = new MojoHomePageElements(driver);
        mojoHomePageElements.getLogInBtn().click();

        Assert.assertTrue(mojoHomePageElements.getLogIn().isDisplayed());
    }

    @Test
    public void checkLanguageChangeBnt() {
        openUrl("https://www.moyo.ua/ua/");
        MojoHomePageElements mojoHomePageElements = new MojoHomePageElements(driver);

        Assert.assertTrue(mojoHomePageElements.getLanguageChangeBtn().isDisplayed());
    }

    @Test
    public void checkCommunicationBtn() {
        openUrl("https://www.moyo.ua/ua/");
        MojoHomePageElements mojoHomePageElements = new MojoHomePageElements(driver);
        mojoHomePageElements.getCommunicationBtn().click();

        Assert.assertTrue(mojoHomePageElements.contactChannelsWindow().isEnabled());
    }

    @Test
    public void checkSearchField() {
        openUrl("https://www.moyo.ua/ua/");
        MojoHomePageElements mojoHomePageElements = new MojoHomePageElements(driver);
        mojoHomePageElements.getSearchField().sendKeys("asus");
        mojoHomePageElements.getSearchFieldBtn().click();
        MojoSearchResults mojoSearchResults = new MojoSearchResults(driver);

        Assert.assertTrue(mojoSearchResults.getResultsPage().isEnabled());
    }

    @Test
    public void checkVoiceSearch() {
        openUrl("https://www.moyo.ua/ua/");
        MojoHomePageElements mojoHomePageElements = new MojoHomePageElements(driver);
        mojoHomePageElements.getVoiceSearchBtn().click();

        Assert.assertTrue(mojoHomePageElements.getVoiceSearchWindow().isEnabled());
    }

    @Test
    public void checkCatalogBtn() {
        openUrl("https://www.moyo.ua/ua/");
        MojoHomePageElements mojoHomePageElements = new MojoHomePageElements(driver);
        mojoHomePageElements.getCatalogBtn().click();

    }

    @Test
    public void checkSalesBnt() {
        openUrl("https://www.moyo.ua/ua/");
        MojoHomePageElements mojoHomePageElements = new MojoHomePageElements(driver);
        mojoHomePageElements.getSalesBtn().click();
        String expectedUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, "https://www.moyo.ua/ua/actions.html");
    }
}
