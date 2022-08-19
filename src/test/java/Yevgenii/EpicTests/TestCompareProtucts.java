package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.ContraceptivesPage;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCompareProtucts extends TestInit {

    @Test
    @Description("Check the addition of products to the compare")
    public void checkCompareProtucts() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.closePopupWindow().click();
        homePage.clickMenuProductBtn();
        Actions actions = new Actions(driver);
        actions.moveToElement(homePage.selectSectionProductContraceptives()).build().perform();
        homePage.clickSectionProductContraceptives();
        ContraceptivesPage contraceptivesPage = new ContraceptivesPage(driver);
        contraceptivesPage.clickOpenProtuct0Btn();
        contraceptivesPage.clickAddCompareProtuct0Btn();
        contraceptivesPage.clickCompareBtn();
    }
}
