package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.AuthorizationPage;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationTest extends TestInit {
    @Test
    public void checkAuthorization(){
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);

        goToRockBiz();
        rockBizHomePage.getlabelUser().click();
        rockBizHomePage.getAutorization().click();
        authorizationPage.getInputEmail().sendKeys("lvovlev88@gmail.com");
        authorizationPage.getInputPassword().sendKeys("lovebug1988");
        authorizationPage.getEnter().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rockway.biz/ua/my-account/");

    }
}