package IlonaTests.StylusTests;

import BaseClasses.TestInit;
import IlonaTests.StylusPages.DeliveryPaymentPage;
import IlonaTests.StylusPages.HomePageStylus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeliveryPaymentTest extends TestInit {
    @Test
    public void DeliveryPaymentBtnTest(){
        openUrl("https://stylus.ua/uk/");

        HomePageStylus homePageStylus = new HomePageStylus(driver);
        homePageStylus.clickBtnDeliveryPayment().click();

        DeliveryPaymentPage deliveryPaymentPage = new DeliveryPaymentPage(driver);
        Assert.assertTrue(deliveryPaymentPage.checkDeliveryPayment().isDisplayed());


    }
}
