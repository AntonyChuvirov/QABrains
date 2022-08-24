package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.CartPage;
import TestsLev.Pages.RockBiz.ProductPage;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import TestsLev.Pages.RockBiz.SearchProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends TestInit {
    @Test
    public void cartInputAndDel(){
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        goToRockBiz();
        rockBizHomePage.getInput().sendKeys("Футболка");
        rockBizHomePage.getBtnSearch().click();
        searchProductPage.getChooseProduct().click();
        productPage.getSize().click();
        productPage.buy().click();
        cartPage.popUpBascket().click();

        Assert.assertEquals(cartPage.basketWithProduct().getText(), "Товарів: 1 (200 грн)");

        cartPage.delbtn().click();

        Assert.assertEquals(cartPage.baskeEmpty().getText(),"Товарів: 0 (0 грн)");
    }
}