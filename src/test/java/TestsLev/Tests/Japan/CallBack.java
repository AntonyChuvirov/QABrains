package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.HeaderPage;
import org.testng.annotations.Test;

public class CallBack extends TestInit {
    @Test
    public void checkCallBack(){
        HeaderPage headerPage = new HeaderPage(driver);
        openUrl("https://japan-ukraine.com/ua/");

        headerPage.getCallBack().click();
        headerPage.getIntroduce().sendKeys("Lev");
        headerPage.getNumPhone().sendKeys("0934199668");
        headerPage.getComment().sendKeys("Call me");
        headerPage.getCliclBtnCall().click();

    }

    
}
