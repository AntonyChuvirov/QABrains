package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputSpecialSymbolsPage extends BasePage {
    public InputSpecialSymbolsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement notFoundVisible(){
        return waitClickableElement("//div[@class = 'page-not-found-title']");
    }
}
