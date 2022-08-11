package TestsLev.Tests;

import BaseClasses.TestInit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckGoToSearh extends TestInit {
    @Test
    public void goToSearch(){
      openUrl("https://japan-ukraine.com/ua/");
      driver.findElement(By.xpath("//input[@id = 'search']")).sendKeys("Instruments\n");
    
    }

}
