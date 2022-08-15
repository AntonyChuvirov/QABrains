package TestsLev.Tests;

import BaseClasses.TestInit;
import TestsLev.Pages.HeaderPage;
import org.testng.annotations.Test;

public class CallBack extends TestInit {
    @Test
    public void checkCallBack(){
        HeaderPage headerPage = new HeaderPage(driver);
        openUrl("https://japan-ukraine.com/ua/");
        sleep(10);
        headerPage.getCallBack().click();
        headerPage.getIntroduce().sendKeys("Lev");
        headerPage.getNumPhone().sendKeys("0934199668");
        headerPage.getComment().sendKeys("Call me");
        headerPage.getCliclBtnCall().click();
        sleep(10);
    }

    
}
