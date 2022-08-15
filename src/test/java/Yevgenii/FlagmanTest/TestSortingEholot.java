package Yevgenii.FlagmanTest;

import BaseClasses.TestInit;
import Yevgenii.FlagmanPage.FlagEholotPage;
import Yevgenii.FlagmanPage.FlagHomePage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class TestSortingEholot extends TestInit {

    @Test
    @Description("Check product sorting in the sonar section")
    public void checkSortingEholot() {
        FlagHomePage flagHomePage = new FlagHomePage(driver);
        FlagEholotPage flagEholotPage = new FlagEholotPage(driver);

        flagHomePage.open();
        flagHomePage.selectCatalogBtn();
        flagHomePage.selectCatalogEholotBtn();
        flagEholotPage.selectEholotBtn();
        flagEholotPage.selectSortingEholotBtn();
        flagEholotPage.selectSortingEholotBtn1();
    }
}
