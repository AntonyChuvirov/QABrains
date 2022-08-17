package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CardCheckPage extends BasePage {
    public CardCheckPage(WebDriver driver) {
        super(driver);
    }
    public WebElement cardVisible(){
        return $("//div[contains(text(),'Ви додали в кошик')]");
    }
}
