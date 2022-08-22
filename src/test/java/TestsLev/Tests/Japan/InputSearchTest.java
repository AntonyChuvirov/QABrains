package TestsLev.Tests.Japan;

import BaseClasses.TestInit;
import TestsLev.Pages.Japan.JapanHomePage;
import TestsLev.Pages.Japan.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputSearchTest extends TestInit {
    @Test
    public void inputSearchTest() {
        JapanHomePage japanHomePage = new JapanHomePage(driver);
        SearchPage searchPage = new SearchPage(driver);

        goToTheJapan();
        japanHomePage.getSearch().sendKeys("Instruments\n");

        Assert.assertEquals(searchPage.searchByProductsNegativ().getText(), "");

        japanHomePage.getSearch().sendKeys("Інструменти\n");

        Assert.assertEquals(searchPage.searchByProductsPozitiv().getText(), "Купити");
    }
}