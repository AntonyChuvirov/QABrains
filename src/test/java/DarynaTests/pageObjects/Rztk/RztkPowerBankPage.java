package DarynaTests.pageObjects.Rztk;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RztkPowerBankPage extends BasePage {
    public RztkPowerBankPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBuyBtn() {
        return driver.findElement(By.xpath("//*[@class='buy-button button button--with-icon button--green button--medium ng-star-inserted']"));
    }
    public WebElement getBasketBtn() { return driver.findElement(By.xpath("//*[@class='header__button ng-star-inserted header__button--active']"));
    }
}
