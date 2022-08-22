package IlonaTests.StylusPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageStylus extends BasePage {
    public HomePageStylus(WebDriver driver) {
        super(driver);
    }
    public WebElement clickBtnCredit(){
        return waitClickableElement("//a[@title = 'Придбати в кредит']");
    }
    public WebElement clickBtnDeliveryPayment(){
        return waitClickableElement("//a[@title = 'Доставка і оплата']");
    }
    public WebElement changeLanguageBtn(){
        return waitClickableElement("//div[@id = 'header-profile']//div[@data-href = '/uk/']");
    }
    public WebElement getSearchField(){
        return waitClickableElement("//input[@name = 'q']");
    }
    public WebElement clickBtnContacts(){
        return waitClickableElement("//div[@class = 'header-top']//a[@title = 'Контакти']");
    }
    public WebElement clickOnBtnCatalog(){
        return waitClickableElement("//button[@id = 'header_catalog']");
    }
}
