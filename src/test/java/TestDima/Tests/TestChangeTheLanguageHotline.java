package TestDima.Tests;

import BaseClasses.TestInit;
import TestDima.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeTheLanguageHotline extends TestInit {

    @Test
    public void checkChangeTheLanguageHotline(){

        HomePage homePage = new HomePage(driver);

        homePage.goToHomePageHotline();
        Assert.assertTrue(homePage.getBtnComparison().getText().contains("Порівняння"));
        homePage.clickBtnRussianLanguage();
        Assert.assertTrue(homePage.getBtnComparison().getText().contains("Сравнения"));
        homePage.clickBtnUkrainianLanguage();
        Assert.assertTrue(homePage.getBtnComparison().getText().contains("Порівняння"));
    }
}
