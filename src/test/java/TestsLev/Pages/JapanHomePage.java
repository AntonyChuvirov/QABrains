package TestsLev.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JapanHomePage extends BasePage {

    public JapanHomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getBtnAkcii(){
        return $("//span[@class='glyphicons glyphicons-ok']");
    }
    public WebElement getSearch(){
        return $("//input[@id='search']");
    }
    public WebElement getParts(){
        return $("(//a[@href='https://japan-ukraine.com/ua/makita-parts.php'])[1]");
    }
}
