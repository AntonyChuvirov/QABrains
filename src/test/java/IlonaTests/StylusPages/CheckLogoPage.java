package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckLogoPage extends BasePage {
    public CheckLogoPage(WebDriver driver) {
        super(driver);
    }
    public WebElement checkLogoBtn(){
        return waitClickableElement("//div[@class = 'home-nav']");
    }
}
