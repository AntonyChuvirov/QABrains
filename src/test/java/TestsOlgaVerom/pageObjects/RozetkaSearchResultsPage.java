package TestsOlgaVerom.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaSearchResultsPage extends BasePage {
    public RozetkaSearchResultsPage(WebDriver driver) {

        super(driver);
    }
    public WebElement getResultsField(){

        return driver.findElement(By.xpath("//h1[@class='catalog-heading ng-star-inserted']"));
    }
}
