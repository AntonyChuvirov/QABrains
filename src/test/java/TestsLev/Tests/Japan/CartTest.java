package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends TestInit {
    @Test
    public void basketInputandDelete(){
        JapanHomePage japanHomePage = new JapanHomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductsPage pageProducts = new ProductsPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        PopUpCartPage popUpBacket = new PopUpCartPage(driver);
        BasketPage basketPage = new BasketPage(driver);

        goToTheJapan();
        japanHomePage.getSearch().sendKeys("Дрель\n");
        searchPage.getSearchProduct().click();
        pageProducts.getBuy().click();
        popUpBacket.getPopUpBacket().click();

        Assert.assertEquals(headerPage.getProductIntoBasket().getText(),"1 товар");

        basketPage.getDelProduct().click();

        Assert.assertEquals(headerPage.getEmptyBacket().getText(),"Ваш кошик порожній");
    }
}