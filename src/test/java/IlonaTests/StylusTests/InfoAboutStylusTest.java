package IlonaTests.StylusTests;

import BaseClasses.TestInit;
import IlonaTests.StylusPages.DropDownPage;
import IlonaTests.StylusPages.HomePageStylus;
import IlonaTests.StylusPages.InfoAboutStylusPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InfoAboutStylusTest extends TestInit {
    @Test
    public void checkInfoAboutStylus(){
        openUrl("https://stylus.ua/uk/");

        HomePageStylus homePageStylus = new HomePageStylus(driver);
        homePageStylus.changeLanguageBtn().click();
        homePageStylus.clickBtnInformation().click();

        DropDownPage dropDownPage = new DropDownPage(driver);
        dropDownPage.clickBtnAboutCompany().click();

        InfoAboutStylusPage infoAboutStylusPage = new InfoAboutStylusPage(driver);
        Assert.assertTrue(infoAboutStylusPage.infoAboutCompanyVisible().isDisplayed());

    }
}
