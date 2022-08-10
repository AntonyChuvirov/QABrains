package TestsOlya.pageObject;

import org.openqa.selenium.WebDriver;

public class RozetkaHomePageHelper extends RozetkaHomePageElements {


    public RozetkaHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void navigateRozetka() {
        driver.get("https://rozetka.com.ua/ua/");
    }
}