package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPageRB;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderCheck extends TestInit {
    @Test
    public void headerRockBiz(){
       HeaderPageRB headerPageRB = new HeaderPageRB(driver);
       Actions actions = new Actions(driver);

       openUrl("https://rockway.biz/ua/");

       actions.moveToElement(headerPageRB.getSuvenir()).build().perform();

       Assert.assertTrue(headerPageRB.getTextPazl().isDisplayed());

       actions.moveToElement(headerPageRB.getPirsing()).build().perform();

       Assert.assertTrue(headerPageRB.getVidi().isDisplayed());
    }
}
