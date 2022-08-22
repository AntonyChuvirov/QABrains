package TestsLev.Pages.Japan;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchProduct(){
        return waitClickableElement("//div[contains(text(),'Ударний дриль')]");
    }
    public WebElement searchByProductsNegativ(){
        return waitClickableElement("//div[@class='text_cat']");
    }
    public WebElement searchByProductsPozitiv(){
        return waitClickableElement("(//a[text()='Купити'])[1]");
    }

}