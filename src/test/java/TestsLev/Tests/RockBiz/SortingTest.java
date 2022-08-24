package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPage;
import TestsLev.Pages.RockBiz.SearchProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortingTest extends TestInit {
    @Test
    public void sorting(){
        HeaderPage headerPage = new HeaderPage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);

        goToRockBiz();
        headerPage.getVzuttya().click();

        Assert.assertEquals(searchProductPage.resultVzuttya().getText(),"Взуття");

        searchProductPage.getSorting().click();
        searchProductPage.getLowToHighPrice().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rockway.biz/ua/aksessuary/obuv/?sort=p.price&order=ASC");
    }
}