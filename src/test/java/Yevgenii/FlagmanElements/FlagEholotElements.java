package Yevgenii.FlagmanElements;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlagEholotElements extends BasePage {

    public FlagEholotElements(WebDriver driver){
        super(driver);
    }

    public WebElement clickEholotBtn(){
        return driver.findElement(By.xpath("//a[text()='Ехолоти']"));
    }

    public WebElement clickSortingEholotBtn(){
        return driver.findElement(By.xpath("//div[contains(@class,'hidden-xs')]//child::select"));
    }
}
