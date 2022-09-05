package DarynaTests.pageObjects.Mojo;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MojoSearchResults extends BasePage {
    public MojoSearchResults(WebDriver driver) {
        super(driver);
    }

    public WebElement getResultsPage() { return driver.findElement(By.xpath("//div[@class='search_title-wrap']"));}
}
