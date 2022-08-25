package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class TestFilterProducts extends TestInit {

    @Test
    @Description("Check product filter")
    public void checkFilterProducts() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.inputSearchFieldCarSeats();
        homePage.getNextBoxBrands().click();
        homePage.clickAllBrandsProducts();
        homePage.getSeeListSelectedProducts();
    }
}
