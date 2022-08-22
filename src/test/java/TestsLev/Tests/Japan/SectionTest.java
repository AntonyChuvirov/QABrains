package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.JapanHomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SectionTest extends TestInit {
    @Test
    public void clickingElementsFromSection() {
        JapanHomePage japanHomePage = new JapanHomePage(driver);

        goToTheJapan();

        japanHomePage.getBolgarki().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://japan-ukraine.com/ua/makita/bolgarki-makita/");

        japanHomePage.getLobziki().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://japan-ukraine.com/ua/makita/lobziki-makita/");

        japanHomePage.getPili().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://japan-ukraine.com/ua/makita/pily-makita/");
    }
}