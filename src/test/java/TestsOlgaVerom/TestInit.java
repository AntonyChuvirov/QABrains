package TestsOlgaVerom;

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
    public void tearDown(){ driver.quit();}

    public void sleep(int s){
        try {
            Thread.sleep(s * 1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void goToGoogle() {driver.get("https://www.google.ru/");}

    public WebElement getResultFieldRozetka(){
        return driver.findElement(By.xpath("//div[@class='header-layout']"));
    }
}
