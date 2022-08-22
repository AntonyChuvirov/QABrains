package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.HeaderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CallBackTest extends TestInit {
    @Test
    public void callBackTest(){
        HeaderPage headerPage = new HeaderPage(driver);
        goToTheJapan();

        headerPage.getCallBack().click();
        headerPage.getIntroduce().sendKeys("Lev");
        headerPage.getNumPhone().sendKeys("0934199668");
        headerPage.getComment().sendKeys("Call me");
        headerPage.getCliclBtnCall().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://japan-ukraine.com/ua/");
    }
}