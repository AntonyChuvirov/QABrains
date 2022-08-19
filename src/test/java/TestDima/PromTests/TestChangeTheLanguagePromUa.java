package TestDima.PromTests;

import BaseClasses.TestInit;
import TestDima.PromPages.HomePagePromUa;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestChangeTheLanguagePromUa extends TestInit {

    @Test
    public void checkChangeTheLanguagePromUa(){

        HomePagePromUa homePagePromUa = new HomePagePromUa(driver);

        homePagePromUa.goToHomePagePromUa();
        Assert.assertTrue(homePagePromUa.getBtnLanguageUkrainian().isDisplayed());
        Assert.assertTrue(homePagePromUa.getBtnLanguageRussian().isDisplayed());
        homePagePromUa.clickBtnLanguageRussian();
        sleep(2);
        Assert.assertTrue(homePagePromUa.getBtnSignIn().getText().contains("Войти"));
        homePagePromUa.clickBtnLanguageUkrainian();
        sleep(2);
        Assert.assertTrue(homePagePromUa.getBtnSignIn().getText().contains("Увійти"));
    }
}
