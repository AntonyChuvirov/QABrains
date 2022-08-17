package IlonaTests.StylusTests;

import BaseClasses.TestInit;
import IlonaTests.StylusPages.CheckContactsPage;
import IlonaTests.StylusPages.HomePageStylus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactInfoTest extends TestInit {
    @Test
    public void ContactInfo(){
        openUrl("https://stylus.ua/uk/");

        HomePageStylus homePageStylus = new HomePageStylus(driver);
        homePageStylus.changeLanguageBtn().click();
        homePageStylus.clickBtnContacts().click();

        CheckContactsPage checkContactsPage = new CheckContactsPage(driver);
        Assert.assertTrue(checkContactsPage.checkContactsVisible().isDisplayed());


    }
}
