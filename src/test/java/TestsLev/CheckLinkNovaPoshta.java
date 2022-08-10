package TestsLev;

import BaseClasses.TestInit;
import TestsLev.Pages.DeliveryPages;
import TestsLev.Pages.HeaderPage;
import org.testng.annotations.Test;

public class CheckLinkNovaPoshta extends TestInit {
    @Test
    public void getLink() {
        HeaderPage headerPage = new HeaderPage(driver);
        openUrl("https://japan-ukraine.com/ua");
        headerPage.getDelivery().click();
        DeliveryPages deliveryPages = new DeliveryPages(driver);
        deliveryPages.linkNP().click();
        sleep(10);
    }
}

