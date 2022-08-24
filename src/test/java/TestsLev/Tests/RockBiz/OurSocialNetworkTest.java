package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OurSocialNetworkTest extends TestInit {
    @Test
    public void networksLinks() {
        HeaderPage headerPage = new HeaderPage(driver);

        goToRockBiz();
        headerPage.getLinkInstagram().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/rockwaybiz/");

        goToRockBiz();
        headerPage.getLinkFacebook().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/rockway.biz");

        goToRockBiz();
        headerPage.getTelegram().click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://t.me/+380951622888");

        goToRockBiz();
        headerPage.getPhones().click();

        Assert.assertEquals(headerPage.phoneNumber().getText(), "+38 (095) 162-28-88");
    }
}