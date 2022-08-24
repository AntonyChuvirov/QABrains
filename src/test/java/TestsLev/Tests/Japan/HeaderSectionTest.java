package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.HeaderPage;
import TestsLev.Pages.Japan.JapanHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderSectionTest extends TestInit {

    @Test
    public void headerSectionTest(){
        HeaderPage headerPage = new HeaderPage(driver);

        goToTheJapan();

        headerPage.getBtnAkcii().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://japan-ukraine.com/ua/sales.php");

        headerPage.getBtnAboutCompany().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://japan-ukraine.com/ua/company.php");

        headerPage.getBtnContakts().click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://japan-ukraine.com/ua/contacts.php");
    }
}
