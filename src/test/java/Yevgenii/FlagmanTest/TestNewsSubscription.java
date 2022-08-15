package Yevgenii.FlagmanTest;

import BaseClasses.TestInit;
import Yevgenii.FlagmanPage.FlagHomePage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class TestNewsSubscription extends TestInit {

    @Test
    @Description("Check your subscription to news")
    public void checkNewsSubscription() {
        FlagHomePage flagHomePage = new FlagHomePage(driver);

        flagHomePage.open();
        flagHomePage.enterFieldNewsSubscription();
        flagHomePage.clickFieldNewsSubscriptionBtn();
    }
}
