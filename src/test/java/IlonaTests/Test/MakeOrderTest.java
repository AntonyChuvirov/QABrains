package IlonaTests.Test;

import BaseClasses.TestInit;
import IlonaTests.Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class MakeOrderTest extends TestInit {
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
    public void checkPageMakeOrder(){
        openUrl("https://rozetka.com.ua/ua/");

        HomePage homePage = new HomePage(driver);
        homePage.getSearchField().sendKeys("Мишка\n");

        ComputerMousePage computerMousePage = new ComputerMousePage(driver);
        computerMousePage.clickComputerMouse().get(20).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driveMouse();

        BuyComputerMousePage buyComputerMousePage = new BuyComputerMousePage(driver);
        buyComputerMousePage.clickOnBtnBuy().click();

        ClickOnBtnBasketPage clickOnBtnBasketPage = new ClickOnBtnBasketPage(driver);
        CloseButton closeButton = new CloseButton(driver);
        try {
            clickOnBtnBasketPage.clickOnBasket().click();
        } catch (Exception e) {
            closeButton.closeTheWindow().click();
            clickOnBtnBasketPage.clickOnBasket().click();
        }

        MakeOrderClickPage makeOrderClickPage = new MakeOrderClickPage(driver);
        makeOrderClickPage.clickBtnMakeOrder().click();

        CheckPageMakeOrder checkPageMakeOrder = new CheckPageMakeOrder(driver);
        Assert.assertTrue(checkPageMakeOrder.checkMakeOrderVisible().isDisplayed());

    }
}
