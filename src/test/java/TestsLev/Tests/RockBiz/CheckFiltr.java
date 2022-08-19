package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.ProductPage;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import TestsLev.Pages.RockBiz.SearchProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckFiltr extends TestInit {
    @Test
    public void filtr(){
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);

        openUrl("https://rockway.biz/ua/");
        rockBizHomePage.getbtnPirsing().click();
        productPage.filtrWhite().click();
        productPage.btnShowResult().click();

        Assert.assertEquals(searchProductPage.getResultWhite().getText(),"Пірсинг Колір Білий");


    }
}
