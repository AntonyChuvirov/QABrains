package TestDima.Pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends HomePageElements {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void writeProductInSearchField() {
        getSearchField().sendKeys("Ноутбук");
    }

    public void clickSearchBtn() {
        getSearchBtn().click();
    }

    public void inputToSearchFieldPhone() {
        getSearchField().sendKeys("Realme 8 pro");

    }

    public void goToHotline() {
        driver.get("https://hotline.ua/");
    }
}
