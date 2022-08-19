package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelectRegionPromUa extends TestInit {


    @Test
    public void checkSelectRegionPromUa(){

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();
        Assert.assertTrue(homePagePromUa.getFieldNameRegion().isDisplayed());
        homePagePromUa.clickFieldNameRegion();
        Assert.assertTrue(homePagePromUa.getFieldInputNameRegion().isDisplayed());
        homePagePromUa.getFieldInputNameRegion().sendKeys("Бровари");
        Assert.assertTrue(homePagePromUa.getTextWithNameRegionUnderFieldInput().getText().contains("Бровари"));
        homePagePromUa.clickTextWithNameRegionUnderFieldInput();
        Assert.assertTrue(homePagePromUa.getFieldNameRegion().getText().contains("Бровари"));
    }
}
