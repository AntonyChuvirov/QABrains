package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.ContraceptivesPage;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBasketEpic extends TestInit {

    @Test
    @Description("Check the buy and remove of the product from the basket")
    public void checkBuyRemoveBasket() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickMenuProductBtn();
        homePage.actionsMoveTo(homePage.selectSectionProductContraceptives());
        homePage.clickSectionProductContraceptives();
        ContraceptivesPage contraceptivesPage = new ContraceptivesPage(driver);
        contraceptivesPage.actionsMoveTo(contraceptivesPage.selectBuyContraceptiveBtn());
        contraceptivesPage.clickBuyContraceptiveBtn();

        Assert.assertTrue(contraceptivesPage.getSeeProductAddedBascket().isDisplayed());

        contraceptivesPage.clickRemoveProductBascketBtn();
        contraceptivesPage.clickСonfirmRemoveProductBascket();

        Assert.assertTrue(contraceptivesPage.getVisibilityRemoveProductBascket().isDisplayed());
    }
}
