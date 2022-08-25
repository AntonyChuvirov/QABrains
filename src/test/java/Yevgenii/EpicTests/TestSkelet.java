package Yevgenii.EpicTests;

import BaseClasses.TestInit;
import Yevgenii.EpicPage.HomePage;
import jdk.jfr.Description;
import org.testng.annotations.Test;

public class TestSkelet extends TestInit {

    @Test
    @Description("Сhecking the photo of the skeleton")
    public void checkPhotoSkelet() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
        homePage.inputSearchFieldSkelet();
        sleep(3);
        homePage.clickPhotoSkelet();
    }
}
