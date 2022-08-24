package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderSectionTest extends TestInit {
    @Test
    public void headerTest(){
       HeaderPage headerPage = new HeaderPage(driver);
       Actions actions = new Actions(driver);

       goToRockBiz();
       actions.moveToElement(headerPage.getSuvenir()).build().perform();

       Assert.assertTrue(headerPage.getTextPazl().isDisplayed());

       actions.moveToElement(headerPage.getPirsing()).build().perform();

       Assert.assertTrue(headerPage.getVidi().isDisplayed());
    }
}