package Yevgenii.FlagmanTest;

import BaseClasses.TestInit;
import Yevgenii.FlagmanPage.FlagEholotLackyPage;
import Yevgenii.FlagmanPage.FlagEholotPage;
import Yevgenii.FlagmanPage.FlagHomePage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFeedbackLacky extends TestInit {

    @Test
    @Description("Check if a review is being sent for any product")
    public void checkSendFeedback() {
        FlagHomePage flagHomePage = new FlagHomePage(driver);
        FlagEholotPage flagEholotPage = new FlagEholotPage(driver);
        FlagEholotLackyPage flagEholotLackyPage = new FlagEholotLackyPage(driver);

        flagHomePage.open();
        flagHomePage.selectCatalogBtn();
        flagHomePage.selectCatalogEholotBtn();
        flagEholotPage.selectEholotBtn();
        flagEholotPage.clickEholotLackyBtn();
        flagEholotLackyPage.clickFeedbackBtnLacky();
        flagEholotLackyPage.clickStar1BtnLacky();
        flagEholotLackyPage.inputFieldAdvantageLacky();
        flagEholotLackyPage.inputFieldFlawsLacky();
        flagEholotLackyPage.inputFieldCommentLacky();
        flagEholotLackyPage.inputFieldIntroduceyourselfLacky();
        flagEholotLackyPage.clickLeavefeedbackBtnLacky();

        Assert.assertTrue(flagEholotLackyPage.getTextReviewAdded().isDisplayed());
    }
}