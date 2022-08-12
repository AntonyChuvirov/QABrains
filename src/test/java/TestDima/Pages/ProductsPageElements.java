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

    public WebElement getSmartTvNokia(){
        return driver.findElement(By.xpath("//a[contains(text(),'Nokia Smart TV 4300D')]"));
    }

    public WebElement getBtnContinueWorking(){
        return driver.findElement(By.xpath("//button[@class='footer__btn btn btn--transparent']"));
    }

    public WebElement getBtnAddToDivision() {
        return driver.findElement(By.xpath("//div[@title='Додати товар до порівняння']"));
    }

    public WebElement checkFindingProducts() {
        return driver.findElement(By.xpath("//div[@class='search__title']"));
    }

    public WebElement getListDivision(){
        return driver.findElement(By.xpath("//div[contains(text(),'Товар доданий до порівняння')]"));
    }

    public WebElement getBtnAddedToDivision(){
        return driver.findElement(By.xpath("//div[contains(text(),'Порівняння')]"));

    }

    public WebElement getTexListDivisionIsClean(){
        return driver.findElement(By.xpath("//div[@class='compare-empty__title']"));
    }

    public WebElement getBtnCleanDivision(){
        return driver.findElement(By.xpath("//i[@class='icon icon--delete']"));
    }

    public WebElement getResultDivision() {
        return driver.findElement(By.xpath("//div[@class='products-item__title text-sm']"));
    }
}
