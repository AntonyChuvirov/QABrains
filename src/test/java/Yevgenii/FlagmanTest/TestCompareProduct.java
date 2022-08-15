package Yevgenii.FlagmanTest;

import BaseClasses.TestInit;
import Yevgenii.FlagmanPage.FlagEholotPage;
import Yevgenii.FlagmanPage.FlagHomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCompareProduct extends TestInit {

    @Test
    @Description("Check whether the product is added to the product comparison")
    public void checkCompareProduct() {
        FlagHomePage flagHomePage = new FlagHomePage(driver);
        FlagEholotPage flagEholotPage = new FlagEholotPage(driver);

        flagHomePage.open();
        flagHomePage.selectCatalogBtn();
        flagHomePage.selectCatalogEholotBtn();
        flagEholotPage.selectEholotBtn();
        flagEholotPage.selectCompareBtn();

        Assert.assertEquals(flagEholotPage.getResaultCompareBtn().getText(),"1");
    }
}
