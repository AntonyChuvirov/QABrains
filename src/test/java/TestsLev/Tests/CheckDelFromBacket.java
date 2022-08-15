package TestsLev.Tests;

import BaseClasses.TestInit;
import TestsLev.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckDelFromBacket extends TestInit {
    @Test
    public void delFromBacket(){
        JapanHomePage japanHomePage = new JapanHomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        PageProducts pageProducts = new PageProducts(driver);
        PopUpBacket popUpBacket = new PopUpBacket(driver);
        BascketPage bascketPage = new BascketPage(driver);
        HeaderPage headerPage = new HeaderPage(driver);

        openUrl("https://japan-ukraine.com/");
        japanHomePage.getSearch().sendKeys("Дрель\n");
        searchPage.getSearchProduct().click();
        pageProducts.getBuy().click();
        popUpBacket.getPopUpBacket().click();
        bascketPage.getDelProduct().click();

        Assert.assertEquals(headerPage.getEmptyBacket().getText(),"Ваша корзина пуста");
    }
}
