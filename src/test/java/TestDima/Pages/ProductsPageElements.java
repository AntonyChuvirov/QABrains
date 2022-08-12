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
        return $("//img[@src='/img/tx/318/318547231_s265.jpg']");
    }

    public WebElement getSmartTvNokia(){
        return $("//a[contains(text(),'Nokia Smart TV 4300D')]");
    }

    public WebElement getBtnContinueWorking(){
        return $("//button[@class='footer__btn btn btn--transparent']");
    }

    public WebElement getBtnAddToDivision() {
        return $("//div[@title='Додати товар до порівняння']");
    }

    public WebElement checkFindingProducts() {
        return $("//div[@class='search__title']");
    }

    public WebElement getListDivision(){
        return $("//div[contains(text(),'Товар доданий до порівняння')]");
    }

    public WebElement getBtnAddedToDivision(){
        return $("//div[contains(text(),'Порівняння')]");

    }

    public WebElement getTexListDivisionIsClean(){
        return $("//div[@class='compare-empty__title']");
    }

    public WebElement getBtnCleanDivision(){
        return $("//i[@class='icon icon--delete']");
    }

    public WebElement getResultDivision() {
        return $("//div[@class='products-item__title text-sm']");
    }
}
