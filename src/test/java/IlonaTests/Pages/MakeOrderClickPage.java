package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeOrderClickPage extends BasePage {
    public MakeOrderClickPage(WebDriver driver) {
        super(driver);
    }
    public WebElement clickBtnMakeOrder(){
        return waitClickableElement("//div[@class = 'cart-footer ng-star-inserted']//a[contains(text(),'Оформити замовлення')]");
    }
}
