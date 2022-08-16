Repackage TestsLev.Tests;

import BaseClasses.TestInit;
import TestsLev.Pages.JapanHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedirectionCheck extends TestInit {
    @Test
    public void redirection(){
        JapanHomePage japanHomePage = new JapanHomePage(driver);

        openUrl("https://japan-ukraine.com/ua/");
        japanHomePage.getParts().click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://japan-ukraine.com/ua/makita-parts.php");
    }
}
