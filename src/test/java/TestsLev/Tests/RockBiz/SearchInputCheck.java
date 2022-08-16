package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class SearchInputCheck extends TestInit {

    @Test
    public void searchCheck(){
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);

        openUrl("https://rockway.biz/ua/");
        rockBizHomePage.getInput().sendKeys("Test");
        rockBizHomePage.getBtnSearch().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rockway.biz/ua/search?search=Test");
    }
}
