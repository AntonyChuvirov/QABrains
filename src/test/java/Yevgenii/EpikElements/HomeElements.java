package Yevgenii.EpikElements;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomeElements extends BasePage {

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return $("//div/input[@type='text']");
    }

    public List<WebElement> getVisibilityProduct() {
        return waitVisibilityOfAllElements("//div[contains(@class,'columns product-Wrap card-wrapper')]//b[contains(text(),'Лом')]");
    }
}
