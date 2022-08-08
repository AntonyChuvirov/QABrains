package TestsLev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void cls(){
    driver.quit();
    }
    public void HomePagejapan() {
        driver.get("https://japan-ukraine.com/ua/");
    }
    public WebElement myElement() {
        return driver.findElement(By.xpath("//input[@id = 'search']"));
    }
}
