package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSectionProduct extends TestInit {

    @Test
    @Description("Check the Contraceptives product section")
    public void checkSectionProduct() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.closePopupWindow().click();
        homePage.clickMenuProductBtn();
        Actions actions = new Actions(driver);
        actions.moveToElement(homePage.selectSectionProductContraceptives()).build().perform();
        homePage.clickSectionProductContraceptives();
        Assert.assertTrue(homePage.getVisibilityTextContraceptives().isDisplayed());
    }
}
