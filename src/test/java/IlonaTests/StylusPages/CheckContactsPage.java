package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckContactsPage extends BasePage {
    public CheckContactsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement checkContactsVisible(){
        return waitClickableElement("//div[@class = 'header-top']//a[@title = 'Контакти']");
    }
}
