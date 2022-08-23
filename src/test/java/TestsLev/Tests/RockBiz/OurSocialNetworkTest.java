package TestsLev.Tests.RockBiz;

import BaseClasses.TestInit;
import TestsLev.Pages.RockBiz.HeaderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OurSocialNetworkTest extends TestInit {
    @Test
    public void networksLinks(){
        HeaderPage headerPage = new HeaderPage(driver);

        goToRockBiz();
        headerPage.getLinks().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.instagram.com/rockwaybiz/");
    }
}