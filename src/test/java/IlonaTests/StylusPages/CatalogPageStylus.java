package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPageStylus extends BasePage {
    public CatalogPageStylus(WebDriver driver) {
        super(driver);
    }
    public WebElement clickOnBtnInCatalog(){
        return waitClickableElement("//div[@class = 'catalog-item']//span[contains(text(),'Apple')]");
    }
    public WebElement clickOnLogo(){
        return waitClickableElement("//div[@class = 'header-middle']//a[@title = 'Інтернет-магазин Stylus']");
    }
}
