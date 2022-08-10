package IlonaTests.Test;

import BaseClasses.TestInit;
import IlonaTests.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
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
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        openUrl("https://rozetka.com.ua/ua/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        HomePage homePage = new HomePage(driver);
        ComputerMousePage computerMousePage = new ComputerMousePage(driver);
        BuyComputerMousePage buyComputerMousePage = new BuyComputerMousePage(driver);
        CloseButton closeButton = new CloseButton(driver);
        ClickOnBtnBasketPage clickOnBtnBasketPage = new ClickOnBtnBasketPage(driver);
        CheckBasketPage checkBasketPage = new CheckBasketPage(driver);
        homePage.getSearchField().sendKeys("Мишка\n");
        computerMousePage.clickComputerMouse().click();
        driveMouse();
        buyComputerMousePage.clickOnBtnBuy().click();
        try {
            clickOnBtnBasketPage.clickOnBasket().click();
        } catch (Exception e) {
            closeButton.closeTheWindow().click();
            clickOnBtnBasketPage.clickOnBasket().click();
        }
        try {
        Assert.assertTrue(checkBasketPage.basketVisible1().isDisplayed());
        } catch (Exception b) {
            Assert.assertTrue(checkBasketPage.basketVisible().isDisplayed());
        }
    }
}