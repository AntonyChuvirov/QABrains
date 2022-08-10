package TestDima.Pages;

import org.openqa.selenium.WebDriver;
public class HomePage extends HomePageElements {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void selectSearchField() {
        getSearchField().sendKeys("Ноутбук");
        clickSarchBtn().click();
    }
    public void openHotline() {
        driver.get("https://hotline.ua/");
    }
}
