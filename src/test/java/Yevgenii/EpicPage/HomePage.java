package Yevgenii.EpicPage;

import Yevgenii.EpicElements.HomeElements;
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
}
