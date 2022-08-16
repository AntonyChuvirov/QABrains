package IlonaTests.Test;

import IlonaTests.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CatalogTesting extends TestInit {
    @Test
    public void checkCatalog() {
        openUrl("https://rozetka.com.ua/ua/");
        HomePage homePage = new HomePage(driver);
        CatalogBtnPage catalogBtn = new CatalogBtnPage(driver);
        LaptopPage laptopPage = new LaptopPage(driver);
        ClickLaptopPage clickLaptopPage = new ClickLaptopPage(driver);
        CurrentLaptopPage currentLaptopPage = new CurrentLaptopPage(driver);
        homePage.clickTheBtnCatalog();
        sleep(2);
        catalogBtn.clickTheBtnInCatalog();
        sleep(2);
        laptopPage.chooseLaptop().click();
        sleep(1);
        clickLaptopPage.runToLaptop().click();
        sleep(2);
        Assert.assertTrue(currentLaptopPage.informationALaptop().isDisplayed());

    }
}
