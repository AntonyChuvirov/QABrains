package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreditInfoPage extends BasePage {
    public CreditInfoPage(WebDriver driver) {
        super(driver);
    }
    public WebElement checkInfoCredit(){
        return waitClickableElement("//h1[contains(text(),'Купівля в кредит')]");
    }
}
