package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckInfoAboutRozetkaPage extends BasePage {
    public CheckInfoAboutRozetkaPage(WebDriver driver) {
        super(driver);
    }
    public WebElement InfoAboutCompanyVisible(){
        return waitClickableElement("//a[contains(text(),' Про нас ')]");
    }
}
