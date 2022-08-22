package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseTVPage extends BasePage {
    public ChooseTVPage(WebDriver driver) {
        super(driver);
    }
    public WebElement chooseTv(){
        return waitClickableElement("//div[@class = 'content-block have-action']//a[@title = 'Телевізор Samsung QE75Q67B']");
    }
}
