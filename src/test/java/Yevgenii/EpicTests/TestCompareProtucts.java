package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.ContraceptivesPage;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class TestCompareProtucts extends TestInit {

    @Test
    @Description("Check the addition of products to the compare")
    public void checkCompareProtucts() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.clickMenuProductBtn();
        homePage.actionsMoveTo(homePage.selectSectionProductContraceptives());
        homePage.clickSectionProductContraceptives();
        ContraceptivesPage contraceptivesPage = new ContraceptivesPage(driver);
        contraceptivesPage.clickOpenProtuct0Btn();
        contraceptivesPage.clickAddCompareProtuct0Btn();
        contraceptivesPage.clickCompareBtn();
    }
}
