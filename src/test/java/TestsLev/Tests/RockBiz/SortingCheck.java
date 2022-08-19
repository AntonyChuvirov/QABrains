package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPageRB;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import TestsLev.Pages.RockBiz.SearchProductPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingCheck extends TestInit {
    @Test
    public void sorting(){
        HeaderPageRB headerPageRB = new HeaderPageRB(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);

        openUrl("https://rockway.biz/ua/");
        headerPageRB.getVzuttya().click();

        Assert.assertEquals(searchProductPage.resultVzuttya().getText(),"Взуття");

        searchProductPage.getSorting().click();
        searchProductPage.getLowHighPrice().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rockway.biz/ua/aksessuary/obuv/?sort=p.price&order=ASC");

    }
}
