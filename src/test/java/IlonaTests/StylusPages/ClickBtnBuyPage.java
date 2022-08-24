package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickBtnBuyPage extends BasePage {
    public ClickBtnBuyPage(WebDriver driver) {
        super(driver);
    }
    public WebElement clickOnBtnBuy(){
        return waitClickableElement("//div[@class = 'actions-block']//button[contains(text(),'Купити')][1]");
    }
}
