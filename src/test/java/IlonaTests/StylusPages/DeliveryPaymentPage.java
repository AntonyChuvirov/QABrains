package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeliveryPaymentPage extends BasePage {
    public DeliveryPaymentPage(WebDriver driver) {
        super(driver);
    }
    public WebElement checkDeliveryPayment(){
        return waitClickableElement("//h1[contains(text(),'Доставка і оплата')]");
    }
}
