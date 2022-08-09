package TestsOlgaVerom.pageObjects;

import TestsOlgaVerom.pageObjects.MakeUpHomePageElements;
import org.openqa.selenium.WebDriver;

public class MakeUpHomePageHelper extends MakeUpHomePageElements {
    public MakeUpHomePageHelper(WebDriver driver) {
        super(driver);
    }
    public void navigateMakeUp(){
        driver.get("https://makeup.com.ua/");
    }
}
