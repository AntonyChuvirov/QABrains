package Yevgenii.FlagmanElements;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlagEholotLackyElements extends BasePage {

    public FlagEholotLackyElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getFeedbackBtn() {
        return $("//a[contains(text(),'Відгуки')]");
    }

    public WebElement selectStar1Btn() {
        return $("//section[@id='rating-section']//div[@name='1']");
    }

    public WebElement getFieldAdvantageLacky() {
        return $("//textarea[@id='dignity-field']");
    }

    public WebElement getFieldFlawsLacky() {
        return $("//textarea[@id='shortcomings-field']");
    }

    public WebElement getFieldCommentLacky() {
        return $("//textarea[@id='text-field']");
    }

    public WebElement getFieldIntroduceyourselfLacky() {
        return $("//input[@id='name-field']");
    }

    public WebElement getLeavefeedbackBtnLacky() {
        return $("//button[@class='rating-send-btn btn red-btn']");
    }

    public WebElement getTextReviewAdded() {
        return $("//div[@name='comments_msg']");
    }
}
