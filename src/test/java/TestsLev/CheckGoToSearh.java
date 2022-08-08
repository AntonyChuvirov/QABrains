package TestsLev;

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
        HomePagejapan();
        myElement().sendKeys("Instruments\n");
    }

}
