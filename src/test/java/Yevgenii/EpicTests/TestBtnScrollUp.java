package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestBtnScrollUp extends TestInit {

    @Test
    @Description("Check button, page scroll up")
    public void CheckBtnScrollUp() {
        HomePage homePage = new HomePage(driver);

        homePage.open();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        homePage.clickBtnScrollUp().click();
    }
}
