package Yevgenii.FlagmanTest;

import BaseClasses.TestInit;
import Yevgenii.FlagmanElements.FlagEholotElements;
import Yevgenii.FlagmanPage.FlagEholotPage;
import Yevgenii.FlagmanPage.FlagHomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProductFilter extends TestInit {

    @Test
    @Description("Check the product filter by manufacturer")
    public void checkProductFilter() {
        FlagHomePage flagHomePage = new FlagHomePage(driver);
        flagHomePage.open();
        flagHomePage.selectCatalogBtn();
        flagHomePage.selectCatalogEholotBtn();

        FlagEholotPage flagEholotPage = new FlagEholotPage(driver);
        flagEholotPage.selectEholotBtn();
        flagEholotPage.clickManufacturerProductFilter();

        FlagEholotElements flagEholotElements = new FlagEholotElements(driver);
        Assert.assertTrue(flagEholotElements.getVisibilityListProductsLowrance().size() > 10);
    }
}
