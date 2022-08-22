package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckChosenProductPage extends BasePage {
    public CheckChosenProductPage(WebDriver driver) {
        super(driver);
    }
    public WebElement checkChoseProductVisible(){
        return waitClickableElement("//h1[contains(text(),'APPLE')]");
    }
}
