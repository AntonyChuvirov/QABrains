package TestsOlya.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWebDriver {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void runGoogle() {
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("dog\n");
        driver.findElement(By.xpath("//input[@name='q']")).click();
        driver.quit();
    }

    @Test
    public void clickEnterBtn() {
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//a[text()='Войти']")).click();
    }
}





