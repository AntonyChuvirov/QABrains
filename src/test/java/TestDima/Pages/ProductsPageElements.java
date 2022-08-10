package TestDima.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPageElements extends BasePage {
    public ProductsPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getPhone() {
        return driver.findElement(By.xpath("//img[@src='/img/tx/318/318547231_s265.jpg']"));
    }

    public WebElement getBtnAddToDivision() {
        return driver.findElement(By.xpath("//div[@title='Додати товар до порівняння']"));
    }

    public WebElement showFindingProducts() {
        return driver.findElement(By.xpath("//div[@class='search__title']"));
    }

    public WebElement getResultDivision() {
        return driver.findElement(By.xpath("//div[@class='products-item__title text-sm']"));
    }
}
