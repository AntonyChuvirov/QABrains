package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckPointCheckOutPage extends BasePage {
    public CheckPointCheckOutPage(WebDriver driver) {
        super(driver);
    }
    public WebElement pointCheckOutVisible(){
        return waitClickableElement("//h1[contains(text(),' Точки видачі Rozetka в місті Київ ')]");
    }
}
