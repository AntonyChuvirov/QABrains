package Yevgenii.EpicElements;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomeElements extends BasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return $("//div/input[@type='text']");
    }

    public List<WebElement> getVisibilityProduct() {
        return waitVisibilityOfAllElements("//div[contains(@class,'columns product-Wrap card-wrapper')]//b[contains(text(),'Лом')]");
    }

    public WebElement getSwitchLanguageBtn() {
        return $("//span[@class='switch__lever']");
    }

    public WebElement getVisibilityTextBtnRu() {
        return $("//div[contains(text(),'Каталог товаров')]");
    }

    public WebElement getVisibilityTextBtnUa() {
        return $("//div[contains(text(),'Каталог товарів')]");
    }

    public WebElement clickBtnScrollUp() {
        return $("//div[@class='_f8Ueuq']");
    }

    public WebElement getBtnAddressStore() {
        return $("//div[@class='header__locations']");
    }

    public WebElement getAddressStore() {
        return $("//div[contains(text(),'Бровари')]/../../../../button");
    }

    public WebElement getVisibilityTextAddress() {
        return $("//div[@class='header__locations-street']//span[@title='Бровари, вул. Київська, 253']");
    }

    public WebElement getMenuProductBtn() {
        return $("//div[@class='header__menu-opener-button-text']");
    }

    public WebElement selectSectionProductContraceptives() {
        return $("//a[contains(text(),'Краса та здоров')]");
    }

    public WebElement getSectionProductContraceptives() {
        return $("//a[@class='catalog-menu__level-2'][@title='Засоби контрацепції']");
    }

    public WebElement closePopupWindow() {
        return $("//div[@class='_lf1rdL']");
    }

    public WebElement getVisibilityTextContraceptives() {
        return $("//h1['Засоби контрацепції']");
    }
}
