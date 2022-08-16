package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageStylus extends BasePage {
    public HomePageStylus(WebDriver driver) {
        super(driver);
    }
    public WebElement clickBtnCredit(){
        return $("//a[@title = 'Придбати в кредит']");
    }
    public WebElement clickBtnDeliveryPayment(){
        return $("//a[@title = 'Доставка і оплата']");
    }
    public WebElement changeLanguageBtn(){
        return $("//div[@id = 'header-profile']//div[@data-href = '/uk/']");
    }
}
