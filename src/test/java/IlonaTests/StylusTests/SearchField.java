package IlonaTests.StylusTests;

import BaseClasses.TestInit;
import IlonaTests.StylusPages.HomePageStylus;
import IlonaTests.StylusPages.InputSpecialSymbolsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchField extends TestInit {
    @Test
    public void checkSearchField(){
        openUrl("https://stylus.ua/uk/");

        HomePageStylus homePageStylus = new HomePageStylus(driver);
        homePageStylus.changeLanguageBtn().click();
        homePageStylus.getSearchField().sendKeys("@$\n");
//        Input special symbols in search field
//        Expected result : nothing found

        InputSpecialSymbolsPage inputSpecialSymbolsPage = new InputSpecialSymbolsPage(driver);
        Assert.assertTrue(inputSpecialSymbolsPage.notFoundVisible().isDisplayed());
    }
}
