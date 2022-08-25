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
        return waitClickableElement("//div/input[@type='text']");
    }

    public List<WebElement> getVisibilityProduct() {
        return waitVisibleOfAllElements("//div[contains(@class,'columns product-Wrap card-wrapper')]//b[contains(text(),'Лом')]");
    }

    public WebElement getSwitchLanguageBtn() {
        return waitClickableElement("//span[@class='switch__lever']");
    }

    public WebElement getVisibilityTextBtnRu() {
        return waitClickableElement("//div[contains(text(),'Каталог товаров')]");
    }

    public WebElement getVisibilityTextBtnUa() {
        return waitClickableElement("//div[contains(text(),'Каталог товарів')]");
    }

    public WebElement clickBtnScrollUp() {
        return waitClickableElement("//div[@class='_f8Ueuq']");
    }

    public WebElement getBtnAddressStore() {
        return waitClickableElement("//div[@class='header__locations']");
    }

    public WebElement getAddressStore() {
        return waitClickableElement("//div[contains(text(),'Бровари')]/../../../../button");
    }

    public WebElement getVisibilityTextAddress() {
        return waitClickableElement("//div[@class='header__locations-street']//span[@title='Бровари, вул. Київська, 253']");
    }

    public WebElement getMenuProductBtn() {
        return waitClickableElement("//div[@class='header__menu-opener-button-text']");
    }

    public WebElement selectSectionProductContraceptives() {
        return waitClickableElement("//a[contains(text(),'Краса та здоров')]");
    }

    public WebElement getSectionProductContraceptives() {
        return waitClickableElement("//a[@class='catalog-menu__level-2'][@title='Засоби контрацепції']");
    }

    public WebElement getVisibilityTextContraceptives() {
        return waitClickableElement("//h1['Засоби контрацепції']");
    }

    public List<WebElement> getPhotoSkelet() {
        return waitVisibleOfAllElements("//div[@style='margin-right: 10px;']");
    }

    public WebElement getSlideNextBtn() {
        return waitClickableElement("//div[@aria-label='Next slide']");
    }

    public List<WebElement> getActivePhotoSkelet() {
        return waitVisibleOfAllElements("//img[contains(@alt,'анатомічний скелет людини 181 см - фото')]");
    }

    public List<WebElement> getAllBoxBrands() {
        return waitVisibleOfAllElements("//input[@data-parent-name='brand']/..");
    }

    public WebElement getNextBoxBrands() {
        return waitClickableElement("(//button[@class='btn btn--small btn--dark filter-block__more'])[1]");
    }

    public List<WebElement> getVisibleListSelectedProducts() {
        return waitVisibleOfAllElements("//div[@class='checked-items__element']");
    }
}
