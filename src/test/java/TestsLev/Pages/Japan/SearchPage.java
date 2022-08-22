package TestsLev.Pages.Japan;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getSearchProduct(){
        return waitClickableElement("(//a[@href='https://japan-ukraine.com/product/makita-hp1630/'])[1]");

    }
}
