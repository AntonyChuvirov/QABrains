package IlonaTests.Test;

import BaseClasses.TestInit;
import IlonaTests.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MicrophoneTest extends TestInit{
    @Test
    public void MicrophoneBtnTest(){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        openUrl("https://rozetka.com.ua/ua/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.clickBtnMicrophone().isDisplayed());
    }
}
