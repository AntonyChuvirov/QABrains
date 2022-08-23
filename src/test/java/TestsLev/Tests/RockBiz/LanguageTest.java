package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPage;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageTest extends TestInit {
    @Test
    public void languageTest(){
        HeaderPage headerPage = new HeaderPage(driver);
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);

        goToRockBiz();
        headerPage.getLenguageBtn().click();
        headerPage.getRusLenguage().click();

        Assert.assertEquals(rockBizHomePage.otziviRus().getText(),"Отзывы");

        headerPage.getLenguageBtn().click();
        headerPage.getUaLenguage().click();

        Assert.assertEquals(rockBizHomePage.vidguki().getText(),"Відгуки");
    }
}