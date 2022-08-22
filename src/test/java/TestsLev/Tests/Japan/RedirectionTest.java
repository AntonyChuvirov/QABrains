package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.JapanHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedirectionTest extends TestInit {
    @Test
    public void redirectionTest(){
        JapanHomePage japanHomePage = new JapanHomePage(driver);

        goToTheJapan();
        japanHomePage.getParts().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://japan-ukraine.com/ua/makita-parts.php");
    }
}