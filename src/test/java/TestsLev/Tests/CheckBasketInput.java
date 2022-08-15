package TestsLev.Tests;

import BaseClasses.TestInit;
import TestsLev.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBasketInput extends TestInit {
    @Test
    public void basketInput(){
        JapanHomePage japanHomePage = new JapanHomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        PageProducts pageProducts = new PageProducts(driver);
        HeaderPage headerPage = new HeaderPage(driver);
        PopUpBacket popUpBacket = new PopUpBacket(driver);

        openUrl("https://japan-ukraine.com/");
        japanHomePage.getSearch().sendKeys("Дрель\n");
        searchPage.getSearchProduct().click();
        pageProducts.getBuy().click();
        popUpBacket.getPopUpBacket().click();
        sleep(5);


        Assert.assertEquals(headerPage.getProductIntoBasket().getText(),"1 товар");
    }
}
