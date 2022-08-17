package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.DeliveryPages;
import TestsLev.Pages.Japan.HeaderPage;
import org.testng.annotations.Test;

public class CheckLinkNovaPoshta extends TestInit {
    @Test
    public void getLink() {
        HeaderPage headerPage = new HeaderPage(driver);
        DeliveryPages deliveryPages = new DeliveryPages(driver);

        openUrl("https://japan-ukraine.com/ua");
        headerPage.getDelivery().click();
        deliveryPages.linkNP().click();
    }
}

