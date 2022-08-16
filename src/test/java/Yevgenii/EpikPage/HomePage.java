package Yevgenii.EpikPage;

import Yevgenii.EpikElements.HomeElements;
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
}
