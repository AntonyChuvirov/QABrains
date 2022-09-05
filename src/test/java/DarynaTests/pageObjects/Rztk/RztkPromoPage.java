package DarynaTests.pageObjects.Rztk;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RztkPromoPage extends BasePage {
    public RztkPromoPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchResults() { return driver.findElement(By
            .xpath("//*[@class='promo-catalog__heading ng-star-inserted'][contains(text(), 'ТОП-товари')]"));}
}
