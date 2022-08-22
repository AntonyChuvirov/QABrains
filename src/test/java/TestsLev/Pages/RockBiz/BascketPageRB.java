package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BascketPageRB extends BasePage {
    public BascketPageRB(WebDriver driver) {
        super(driver);
    }
    public WebElement popUpBascket(){
        return waitClickableElement("//button [text()='Оформити замовлення']");
    }
    public WebElement text(){
        return waitClickableElement("(//*[text()='Оформлення замовлення'])[3]");
    }
}
