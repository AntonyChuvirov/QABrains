package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfoAboutStylusPage extends BasePage {
    public InfoAboutStylusPage(WebDriver driver) {
        super(driver);
    }
    public WebElement infoAboutCompanyVisible(){
        return waitClickableElement("//h1[contains(text(),'Про нас – STYLUS.UA')]");
    }
}
