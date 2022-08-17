package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicElements.HomeElements;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFieldSearch extends TestInit {

    @Test
    @Description("Checking the term of product search")
    public void checkFieldSearch() {
        HomePage homePage = new HomePage(driver);
        HomeElements homeElements = new HomeElements(driver);

        homePage.open();
        homePage.inputSearchField();
        Assert.assertTrue(homeElements.getVisibilityProduct().size() > 10);
    }
}
