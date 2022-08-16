package TestsLev.Tests;

import BaseClasses.TestInit;
import TestsLev.Pages.DeliveryPages;
import TestsLev.Pages.HeaderPage;
import TestsLev.Pages.LinksBlock;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LinkPartners extends TestInit {
    @Test
    public void getLinkPartners(){
        LinksBlock linksBlock = new LinksBlock(driver);

        openUrl("https://japan-ukraine.com/ua/");

        linksBlock.getLinkMetabo().click();
        for(String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);}
        Assert.assertEquals(driver.getCurrentUrl(), "https://metabo-ukraine.com/");

    }
}
