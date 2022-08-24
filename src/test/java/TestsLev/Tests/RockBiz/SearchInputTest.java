package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchInputTest extends TestInit {

    @Test
    public void searchInputTest(){
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);

        goToRockBiz();
        rockBizHomePage.getInput().sendKeys("Test");
        rockBizHomePage.getBtnSearch().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rockway.biz/ua/search?search=Test");
    }
}
