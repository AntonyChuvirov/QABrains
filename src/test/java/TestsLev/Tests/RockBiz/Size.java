package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPageRB;
import TestsLev.Pages.RockBiz.ProductPage;
import TestsLev.Pages.RockBiz.SearchProductPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Size extends TestInit {
    @Test
    public void checkSizeChart(){
        HeaderPageRB headerPageRB = new HeaderPageRB(driver);
        ProductPage productPage = new ProductPage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        Actions actions = new Actions(driver);

        openUrl("https://rockway.biz/ua/");
        actions.moveToElement(headerPageRB.getClothes()).build().perform();
        headerPageRB.getTShirt().click();
        searchProductPage.firstTshirt().click();
        productPage.getSizeChart().click();

        Assert.assertEquals(productPage.popUpSize().getText(),"В замірах можлива похибка до 2 см");
    }
}
