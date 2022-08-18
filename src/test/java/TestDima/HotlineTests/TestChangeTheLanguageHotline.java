package TestDima.HotlineTests;

import BaseClasses.TestInit;
import TestDima.HotlinePages.HomePageHotlineHotline;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeTheLanguageHotline extends TestInit {

    @Test
    public void checkChangeTheLanguageHotline(){

        HomePageHotlineHotline homePageHotline = new HomePageHotlineHotline(driver);

        homePageHotline.goToHomePageHotline();
        Assert.assertTrue(homePageHotline.getBtnComparison().getText().contains("Порівняння"));
        homePageHotline.clickBtnRussianLanguage();
        Assert.assertTrue(homePageHotline.getBtnComparison().getText().contains("Сравнения"));
        homePageHotline.clickBtnUkrainianLanguage();
        Assert.assertTrue(homePageHotline.getBtnComparison().getText().contains("Порівняння"));
    }
}
