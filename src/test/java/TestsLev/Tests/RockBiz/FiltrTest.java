package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.ProductPage;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import TestsLev.Pages.RockBiz.SearchProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FiltrTest extends TestInit {
    @Test
    public void filtrTest(){
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);

        goToRockBiz();
        rockBizHomePage.getbtnPirsing().click();
        productPage.filtrWhite().click();
        productPage.btnShowResult().click();

        Assert.assertEquals(searchProductPage.getResultWhite().getText(),"Пірсинг Колір Білий");
    }
}