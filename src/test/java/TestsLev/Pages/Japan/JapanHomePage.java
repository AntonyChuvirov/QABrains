package TestsLev.Pages.Japan;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JapanHomePage extends BasePage {

    public JapanHomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement getBtnAkcii(){
        return waitClickableElement("//span[@class='glyphicons glyphicons-ok']");
    }
    public WebElement getSearch(){
        return waitClickableElement("//input[@id='search']");
    }
    public WebElement getParts(){
        return waitClickableElement("(//a[@href='https://japan-ukraine.com/ua/makita-parts.php'])[1]");
    }
}
