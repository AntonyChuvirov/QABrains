package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.DeliveryPage;
import TestsLev.Pages.Japan.HeaderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkNovaPoshtaTest extends TestInit {
    @Test
    public void linkNovaPoshtaTest() {
        HeaderPage headerPage = new HeaderPage(driver);
        DeliveryPage deliveryPages = new DeliveryPage(driver);

        goToTheJapan();
        headerPage.getDelivery().click();
        deliveryPages.linkNP().click();

        for(String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);}

        Assert.assertEquals(driver.getCurrentUrl(),"https://novaposhta.ua/");
    }
}