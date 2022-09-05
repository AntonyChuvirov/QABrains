package DarynaTests.pageObjects.Rztk;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RztkSearchResultsPB extends BasePage {
    public RztkSearchResultsPB(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultsPage() {
        return driver.findElement(By.xpath("//h1[@class='catalog-heading ng-star-inserted']"));
    }
}
