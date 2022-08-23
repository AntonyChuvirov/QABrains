package Yevgenii.EpicPage;

import Yevgenii.EpicElements.HomeElements;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://epicentrk.ua/");
    }

    public HomePage inputSearchField() {
        getSearchField().sendKeys("лом\n");
        return this;
    }

    public HomePage clickSwitchLanguageBtn() {
        getSwitchLanguageBtn().click();
        return this;
    }

    public HomePage clickBtnAddressStore() {
        getBtnAddressStore().click();
        return this;
    }

    public HomePage clickAddressStore() {
        getAddressStore().click();
        return this;
    }

    public HomePage clickMenuProductBtn() {
        getMenuProductBtn().click();
        return this;
    }

    public HomePage clickSectionProductContraceptives() {
        getSectionProductContraceptives().click();
        return this;
    }

    public HomePage inputSearchFieldSkelet() {
        getSearchField().sendKeys("Об'ємний анатомічний скелет людини 181 см\n");
        return this;
    }

    public void clickPhotoSkelet() {
        for (int i = 1; i < getPhotoSkelet().size(); i++) {
            try {
                getPhotoSkelet().get(i).click();
            } catch (ElementNotInteractableException e) {
                actionsMoveTo(getPhotoSkelet().get(i--));
                getSlideNextBtn().click();
            }
            assert (getActivePhotoSkelet().get(i).isDisplayed());
        }
    }
}
