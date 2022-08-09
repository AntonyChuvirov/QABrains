package YevgenTest.Tests;

import BaseClasses.TestInit;
import YevgenTest.PageObjects.FlagHomePage;
import org.testng.annotations.Test;

public class FlagmanSearchString extends TestInit {

    @Test
    public void checkSeach(){
        FlagHomePage flagHomePage = new FlagHomePage(driver);
        flagHomePage.navigateFlagman();

        flagHomePage.getElementSearchString().sendKeys("атрактант\n");
        sleep(2);
        flagHomePage.getElementSearchString().sendKeys("№;%:?*\n");
        sleep(2);
    }
}
