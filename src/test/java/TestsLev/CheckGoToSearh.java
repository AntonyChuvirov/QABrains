package TestsLev;

import TestsOlgaVerom.pageObjects.TestInit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckGoToSearh extends TestInit {
    @Test
    public void goToSearch(){
      openUrl("https://japan-ukraine.com/ua/");
      driver.findElement(By.xpath("//input[@id = 'search']")).sendKeys("Instruments\n");
    
    }

}
