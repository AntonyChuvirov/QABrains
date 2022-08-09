package TestsOlya.pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void sleep(int s) {
        try {
            Thread.sleep(s * 1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goToGoogle() {
        driver.get("https://www.google.com.ua/");
    }

    public WebElement getResultFieldRozetka() {
        return driver.findElement((By.xpath("div[//@class='search-header ng-star-inserted']")));
    }
}


