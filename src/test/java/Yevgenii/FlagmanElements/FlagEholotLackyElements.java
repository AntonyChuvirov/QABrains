package Yevgenii.FlagmanElements;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlagEholotLackyElements extends BasePage {

    public FlagEholotLackyElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getFeedbackBtn() {
        return waitClickableElement("//a[contains(text(),'Відгуки')]");
    }

    public WebElement selectStar1Btn() {
        return waitClickableElement("//section[@id='rating-section']//div[@name='1']");
    }

    public WebElement getFieldAdvantageLacky() {
        return waitClickableElement("//textarea[@id='dignity-field']");
    }

    public WebElement getFieldFlawsLacky() {
        return waitClickableElement("//textarea[@id='shortcomings-field']");
    }

    public WebElement getFieldCommentLacky() {
        return waitClickableElement("//textarea[@id='text-field']");
    }

    public WebElement getFieldIntroduceyourselfLacky() {
        return waitClickableElement("//input[@id='name-field']");
    }

    public WebElement getLeavefeedbackBtnLacky() {
        return waitClickableElement("//button[@class='rating-send-btn btn red-btn']");
    }

    public WebElement getTextReviewAdded() {
        return waitClickableElement("//div[@name='comments_msg']");
    }
}
