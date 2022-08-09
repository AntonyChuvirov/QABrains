package IlonaTests.Test;

import BaseClasses.TestInit;
import IlonaTests.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.NoSuchElementException;

public class BasketTesting  extends TestInit {

    public void driveMouse() {
        try {
            //moves mouse to the middle of the screen
            new Robot().mouseMove((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2, (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);
            //remember to use try-catch block (always, and remember to delete this)
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void basketChecking() {
        openUrl("https://rozetka.com.ua/ua/");
        HomePage homePage = new HomePage(driver);
        ComputerMousePage computerMousePage = new ComputerMousePage(driver);
        BuyComputerMousePage buyComputerMousePage = new BuyComputerMousePage(driver);
        CloseButton closeButton = new CloseButton(driver);
        ClickOnBtnBasketPage clickOnBtnBasketPage = new ClickOnBtnBasketPage(driver);
        CheckBasketPage checkBasketPage = new CheckBasketPage(driver);
        sleep(2);
        homePage.getSearchField().sendKeys("Мишка\n");
        sleep(10);
        computerMousePage.clickComputerMouse().click();
        driveMouse();
        sleep(2);
        buyComputerMousePage.clickOnBtnBuy().click();
        sleep(7);
        try {
            clickOnBtnBasketPage.clickOnBasket().click();
        } catch (Exception e) {
            closeButton.closeTheWindow().click();
            clickOnBtnBasketPage.clickOnBasket().click();
        }
        sleep(5);
        Assert.assertTrue(checkBasketPage.basketVisible().isDisplayed());
    }
}