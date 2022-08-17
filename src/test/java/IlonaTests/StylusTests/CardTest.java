package IlonaTests.StylusTests;

import BaseClasses.TestInit;
import IlonaTests.StylusPages.CardCheckPage;
import IlonaTests.StylusPages.ChooseTVPage;
import IlonaTests.StylusPages.ClickBtnBuyPage;
import IlonaTests.StylusPages.HomePageStylus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CardTest extends TestInit {
    @Test
    public void CardTesting(){
        openUrl("https://stylus.ua/uk/");

        HomePageStylus homePageStylus = new HomePageStylus(driver);
        homePageStylus.changeLanguageBtn().click();
        homePageStylus.getSearchField().sendKeys("Телевізор\n");

        ChooseTVPage chooseTVPage = new ChooseTVPage(driver);
        chooseTVPage.chooseTv().click();

        ClickBtnBuyPage clickBtnBuyPage = new ClickBtnBuyPage(driver);
        clickBtnBuyPage.clickOnBtnBuy().click();

        CardCheckPage cardCheckPage = new CardCheckPage(driver);
        Assert.assertTrue(cardCheckPage.cardVisible().isDisplayed());
    }
}
