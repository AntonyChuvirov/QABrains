package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.BascketPageRB;
import TestsLev.Pages.RockBiz.ProductPage;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import TestsLev.Pages.RockBiz.SearchProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BascketCheckInput extends TestInit {
    @Test
    public void checkBascketInput(){
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        ProductPage productPage = new ProductPage(driver);
        BascketPageRB bascketPageRB = new BascketPageRB(driver);

        openUrl("https://rockway.biz/ua/");
        rockBizHomePage.getInput().sendKeys("Футболка");
        rockBizHomePage.getBtnSearch().click();
        searchProductPage.getChooseProduct().click();
        productPage.getSize().click();
        productPage.buy().click();
        bascketPageRB.popUpBascket().click();

        Assert.assertEquals(bascketPageRB.text().getText(),"Оформлення замовлення");


    }
}
