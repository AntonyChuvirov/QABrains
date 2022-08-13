package Yevgenii.FlagmanPage;

import Yevgenii.FlagmanElements.FlagEholotLackyElements;
import org.openqa.selenium.WebDriver;

public class FlagEholotLackyPage extends FlagEholotLackyElements {

    public FlagEholotLackyPage(WebDriver driver) {
        super(driver);
    }

    public FlagEholotLackyPage clickFeedbackBtnLacky() {
        getFeedbackBtn().click();
        return this;
    }

    public FlagEholotLackyPage clickStar1BtnLacky() {
        selectStar1Btn().click();
        return this;
    }

    public FlagEholotLackyPage inputFieldAdvantageLacky() {
        getFieldAdvantageLacky().sendKeys("Є");
        return this;
    }

    public FlagEholotLackyPage inputFieldFlawsLacky() {
        getFieldFlawsLacky().sendKeys("Є");
        return this;
    }

    public FlagEholotLackyPage inputFieldCommentLacky() {
        getFieldCommentLacky().sendKeys("шляпа");
        return this;
    }

    public FlagEholotLackyPage inputFieldIntroduceyourselfLacky() {
        getFieldIntroduceyourselfLacky().sendKeys("Я");
        return this;
    }

    public FlagEholotLackyPage clickLeavefeedbackBtnLacky() {
        getLeavefeedbackBtnLacky().click();
        return this;
    }
}
