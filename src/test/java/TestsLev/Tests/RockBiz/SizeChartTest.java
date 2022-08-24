package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPage;
import TestsLev.Pages.RockBiz.ProductPage;
import TestsLev.Pages.RockBiz.SearchProductPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SizeChartTest extends TestInit {
    @Test
    public void sizeChartTest(){
        HeaderPage headerPage = new HeaderPage(driver);
        ProductPage productPage = new ProductPage(driver);
        SearchProductPage searchProductPage = new SearchProductPage(driver);
        Actions actions = new Actions(driver);

        goToRockBiz();
        actions.moveToElement(headerPage.getClothes()).build().perform();
        headerPage.getTShirt().click();
        searchProductPage.firstTshirt().click();
        productPage.getSizeChart().click();

        Assert.assertEquals(productPage.popUpSize().getText(),"В замірах можлива похибка до 2 см");
    }
}