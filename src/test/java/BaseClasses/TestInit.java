package BaseClasses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import java.util.ArrayList;

public class TestInit {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    private String getOSName() {
        return System.getProperty("os.name").toLowerCase();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    public void openUrl(String site) {
        driver.get(site);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void changeTab(Integer index) {
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(index));
    }

    public void scrollToElement(WebElement webElement) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public void goToTheJapan() {
        openUrl("https://japan-ukraine.com/ua/");
    }

    public void goToRockBiz() {
        openUrl("https://rockway.biz/ua/");
    }
}
