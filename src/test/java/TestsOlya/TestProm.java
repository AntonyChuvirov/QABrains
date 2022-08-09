package TestsOlya;

import org.testng.annotations.Test;
import TestsOlya.pageObject.PromHomePageHelper;
import TestsOlya.pageObject.TestInit;

public class TestProm extends TestInit {
    @Test
    public void checkSearchProm() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();

        promHomePageHelper.getSearchFieldProm().sendKeys("Зволожуач повітря");
        promHomePageHelper.getSearchImageProm().click();
    }

    @Test
    public void checkLogoProm() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getSearchFieldProm().sendKeys("Зволожуач повітря");
        promHomePageHelper.getSearchImageProm().click();
        promHomePageHelper.getlogoProm().click();
    }

    @Test
    public void checkCatalog() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getCheckCatalog().click();
    }

    @Test
    public void checklanguageChangeUA() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getlanguageChangeUA().click();
    }

    @Test
    public void checklanguageChangeRU() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getlanguageChangeRU().click();
    }

    @Test
    public void checkChat() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getChat().click();
    }

    @Test
    public void checkSearchImage() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getSearchImageProm().isDisplayed();
    }

    @Test
    public void checkShowMore() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getShowMore().click();
    }

    @Test
    public void checkCreateStore() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getCreateStore().click();
    }

    @Test
    public void checkRegion() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getRegion().click();
    }
@Test
    public void checkPersonalAccount() {
        PromHomePageHelper promHomePageHelper = new PromHomePageHelper(driver);
        promHomePageHelper.navigateProm();
        promHomePageHelper.getPersonalAccount().click();
    }
}

