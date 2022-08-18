package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.AutorizationPage;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Autorization extends TestInit {
    @Test
    public void checkAutorization(){
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);
        AutorizationPage autorizationPage = new AutorizationPage(driver);

        openUrl("https://rockway.biz/ua/");
        rockBizHomePage.getlabelUser().click();
        rockBizHomePage.getAutorization().click();
        autorizationPage.getInputEmail().sendKeys("lvovlev88@gmail.com");
        autorizationPage.getInputPassword().sendKeys("lovebug1988");
        autorizationPage.getEnter().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rockway.biz/ua/my-account/");
    }
}
