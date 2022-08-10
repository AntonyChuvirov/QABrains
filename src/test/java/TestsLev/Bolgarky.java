package TestsLev;

import BaseClasses.TestInit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Bolgarky extends TestInit {
    @Test
    public void ckicking(){
        openUrl("https://japan-ukraine.com/ua/");
        driver.findElement(By.xpath("//a[text() = 'Болгарки']")).click();
    }
}
