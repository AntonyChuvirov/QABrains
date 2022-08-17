package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.JapanHomePage;
import org.testng.annotations.Test;

public class BtnAkcii extends TestInit {

    @Test
    public void checkAkcii(){
        JapanHomePage japanHomePage = new JapanHomePage(driver);
        openUrl("https://japan-ukraine.com/ua");
        japanHomePage.getBtnAkcii().click();

    }
}
