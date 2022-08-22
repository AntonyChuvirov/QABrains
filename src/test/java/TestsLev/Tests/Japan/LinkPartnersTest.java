package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.JapanHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkPartnersTest extends TestInit {
    @Test
    public void linkPartnersTest(){
        JapanHomePage japanHomePage = new JapanHomePage(driver);

        goToTheJapan();

        japanHomePage.getLinkMetabo().click();
        for(String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);}

        Assert.assertEquals(driver.getCurrentUrl(), "https://metabo-ukraine.com/");
    }
}