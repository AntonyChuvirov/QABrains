package IlonaTests.Test;

import BaseClasses.TestInit;
import IlonaTests.Pages.HomePage;
import IlonaTests.Pages.ComputerMousePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFieldTest  extends TestInit {
    @Test
    public void openRozetka() {
        openUrl("https://rozetka.com.ua/ua/");
        HomePage homePage = new HomePage(driver);
        ComputerMousePage computerMouse = new ComputerMousePage(driver);
        homePage.getSearchField().sendKeys("Мишка\n");
        sleep(2);
        Assert.assertTrue(computerMouse.computerMouseVisible().isDisplayed());
    }




}





