package TestDima.PromPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageElementsPromUa extends BasePage {
    public HomePageElementsPromUa(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return waitClickableElement("//input[@class='Dm7py']");
    }


    public WebElement getBtnSearch() {
        return waitClickableElement("//button[@class='VS-Ex yNx5B YY-wN vtaL- gPzcS _4msv1 blBdq aUEOj _3-Fnr Ly27e']");
    }

    public WebElement getFieldNameRegion() {
        return waitClickableElement("//span[@class='_3Trjq aXB7S gwkkx']");
    }

    public WebElement getFieldInputNameRegion() {
        return waitClickableElement("//input[@class='BVdm9 TLCTw C0Yyk nxZA7 EwoYv IYGn-']");
    }

    public WebElement getTextWithNameRegionUnderFieldInput() {
        return waitClickableElement("//button[1]/div[1]/div[1]/span[1]");
    }

    public WebElement getBtnLanguageUkrainian() {
        return waitClickableElement("//span[@title='Українська!']");
    }

    public WebElement getBtnLanguageRussian() {
        return waitClickableElement("//span[@title='Русский']");
    }

    public WebElement getBtnSignIn() {
        return waitClickableElement("//button[@data-qaid='sign-in']");
    }

    public List<WebElement> getListElementsByNow() {
        return waitClickableAllElements("//div[@class='M3v0L qzGRQ DUxBc']");
    }
}
