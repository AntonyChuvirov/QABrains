package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownPage extends BasePage {
    public DropDownPage(WebDriver driver) {
        super(driver);
    }
    public WebElement clickBtnAboutCompany(){
        return waitClickableElement("//div[@class = 'header-top']//a[@title = 'Про нас']");
    }
}
