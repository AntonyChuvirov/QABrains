package IlonaTests;

import BaseClasses.BasePage;
import BaseClasses.TestInit;
import Pages.ComputerMousePage;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFieldTest  extends TestInit {
    @Test
    public void openRozetka() {
        openUrl("https://rozetka.com.ua/ua/");
        HomePage homePage = new HomePage(driver);
        ComputerMousePage computerMouse = new ComputerMousePage(driver);
        homePage.getSearchField().sendKeys("Мишка\n");
        Assert.assertTrue(computerMouse.computerMouseVisible().isDisplayed());
    }




}





