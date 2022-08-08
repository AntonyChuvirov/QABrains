package YevgenTest;

import BaseClasses.TestInit;
import org.testng.annotations.Test;

public class FlagmanChangLanguagTest extends TestInit {

    @Test
    public void changesLanguages(){
        FlagHomePage flagHomePage = new FlagHomePage(driver);

        openUrl("https://www.flagman.kiev.ua/");
        flagHomePage.checkLanguageRu();
        flagHomePage.checkLanguageUa();
    }
}
