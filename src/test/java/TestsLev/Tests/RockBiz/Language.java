package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPageRB;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Language extends TestInit {
    @Test
    public void lenguage(){
        HeaderPageRB headerPageRB = new HeaderPageRB(driver);
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);

        openUrl("https://rockway.biz/ua/");
        headerPageRB.getLenguageBtn().click();
        headerPageRB.getRusLenguage().click();

        Assert.assertEquals(rockBizHomePage.otziviRus().getText(),"Отзывы");

        headerPageRB.getLenguageBtn().click();
        headerPageRB.getUaLenguage().click();

        Assert.assertEquals(rockBizHomePage.vidguki().getText(),"Відгуки");
    }
}

