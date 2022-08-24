package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public WebElement popUpBascket(){
        return waitClickableElement("//button [text()='Оформити замовлення']");
    }
    public WebElement basketWithProduct(){
        return waitClickableElement("//span[contains(text(),'Товарів: 1')]");
    }

    public WebElement delbtn(){
        return waitClickableElement("//button[@data-onclick='removeProduct']");
    }
    public WebElement baskeEmpty(){
        return waitClickableElement("//span[contains(text(),'Товарів: 0')]");
    }
}