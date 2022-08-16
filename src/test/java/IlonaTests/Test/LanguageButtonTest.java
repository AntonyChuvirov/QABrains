package IlonaTests.Test;

import IlonaTests.Pages.CheckChangeLanguagePage;
import IlonaTests.Pages.HomePage;
import IlonaTests.Pages.LanguageBtnPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LanguageButtonTest  extends TestInit {
    @Test

    public void checkLanguageBtn(){
        openUrl("https://rozetka.com.ua/ua/");
        HomePage homePage = new HomePage(driver);
        LanguageBtnPage languageBtnPage = new  LanguageBtnPage(driver);
        CheckChangeLanguagePage checkChangeLanguagePage = new CheckChangeLanguagePage(driver);
        sleep(2);
        homePage.clickTheBtnOpenMenu().click();
        sleep(2);
        languageBtnPage.changeTheLanguage();
        sleep(2);
        Assert.assertTrue(checkChangeLanguagePage.ChangeLang().isDisplayed());
    }
}
