package TestsOlya.pageObject;

import org.openqa.selenium.WebDriver;

public class PromHomePageHelper extends PromHomePageElements {

    public PromHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void navigateProm() {
        driver.get("https://prom.ua/");
    }

    }

