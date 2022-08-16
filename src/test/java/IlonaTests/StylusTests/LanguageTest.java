package IlonaTests.StylusTests;

import BaseClasses.TestInit;
import IlonaTests.StylusPages.HomePageStylus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageTest extends TestInit {
    @Test
    public void LanguageBtnTest(){
    openUrl("https://stylus.ua/uk/");

    HomePageStylus homePageStylus = new HomePageStylus(driver);
    homePageStylus.changeLanguageBtn().click();
        Assert.assertTrue(homePageStylus.clickBtnDeliveryPayment().isDisplayed());

    }
}
