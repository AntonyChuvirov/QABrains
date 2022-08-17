package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPageRB;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Links extends TestInit {
    @Test
    public void networksLinks(){
        HeaderPageRB headerPageRB = new HeaderPageRB(driver);


        openUrl("https://rockway.biz/ua/");
        headerPageRB.getLinks().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/rockwaybiz/");
    }
}
