package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.UserPage;
import TestsLev.Pages.RockBiz.RegistrationPage;
import TestsLev.Pages.RockBiz.RockBizHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestInit {
    @Test
    public void registration(){
        RockBizHomePage rockBizHomePage = new RockBizHomePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        UserPage userPage = new UserPage(driver);

        goToRockBiz();
        rockBizHomePage.getlabelUser().click();
        rockBizHomePage.getBtnRgstr().click();
        registrationPage.getName().sendKeys("");
        registrationPage.getLastName().sendKeys("");
        registrationPage.getPhone().sendKeys("");
        registrationPage.getEmail().sendKeys("");
        registrationPage.getPassword().sendKeys("");
        registrationPage.getCountry().click();
        registrationPage.chooseContry().click();
        registrationPage.getRigion().click();
        registrationPage.chooseRigion().click();
        registrationPage.getCity().click();
        registrationPage.chooseCity().click();
        registrationPage.btnContiniue().click();
        userPage.finish().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://rockway.biz/ua/my-account/");
    }
}