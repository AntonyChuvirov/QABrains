package TestsOlya.pageObject;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
}
