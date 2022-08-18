package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.Cabinet;
import TestsLev.Pages.RockBiz.RegistratioPage;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckRegistration extends TestInit {
    @Test
    public void registration(){
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);
        RegistratioPage registratioPage = new RegistratioPage(driver);
        Cabinet cabinet = new Cabinet(driver);

        openUrl("https://rockway.biz/ua/");
        rockBizHomePage.getlabelUser().click();
        rockBizHomePage.getBtnRgstr().click();
        registratioPage.getName().sendKeys("");
        registratioPage.getLastName().sendKeys("");
        registratioPage.getPhone().sendKeys("");
        registratioPage.getEmail().sendKeys("");
        registratioPage.getPassword().sendKeys("");
        registratioPage.getCountry().click();
        registratioPage.chooseContry().click();
        registratioPage.getRigion().click();
        registratioPage.chooseRigion().click();
        registratioPage.getCity().click();
        registratioPage.chooseCity().click();
        registratioPage.btnContiniue().click();
        cabinet.finish().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rockway.biz/ua/my-account/");
    }
}

