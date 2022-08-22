package TestsLev.Pages.Japan;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpBacket extends BasePage {
    public PopUpBacket(WebDriver driver) {
        super(driver);
    }
    public WebElement getPopUpBacket(){
        return waitClickableElement("//a[text()='Перейти в корзину']");
    }
}
