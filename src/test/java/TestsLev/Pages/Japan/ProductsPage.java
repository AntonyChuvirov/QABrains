package TestsLev.Pages.Japan;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getBuy(){
        return waitClickableElement("(//a[text()='Купити'])[1]");
    }
//    public WebElement getChooseProduct(){
//        return waitClickableElement("")
//    }
}