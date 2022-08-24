package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.ContraceptivesPage;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSortingProducts extends TestInit {

    @Test
    @Description("Check sorting products")
    public void checkSortingProducts() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.closePopupWindow().click();
        homePage.clickMenuProductBtn();
        Actions actions = new Actions(driver);
        actions.moveToElement(homePage.selectSectionProductContraceptives()).build().perform();
        homePage.clickSectionProductContraceptives();
        ContraceptivesPage contraceptivesPage = new ContraceptivesPage(driver);
        contraceptivesPage.clickSortingBtn();

        Assert.assertTrue(contraceptivesPage.getSeeProductСheap().isDisplayed());
    }
}
