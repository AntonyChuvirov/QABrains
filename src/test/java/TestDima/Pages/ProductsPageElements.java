package TestDima.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPageElements extends BasePage {
    public ProductsPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getRealme8pro() {
        return $("//img[@src='/img/tx/318/318547231_s265.jpg']");
    }

    public WebElement getSmartTvNokia(){
        return $("//a[contains(text(),'Nokia Smart TV 4300D')]");
    }

    public WebElement getBtnAddProductToMyLists(){
        return $("//div[@class='search-list__body']/div[3]//div[@class='bookmark-button__title text-sm link link--gray']");
    }

    public WebElement getWindowWithNameAddingProductToMyLists(){
        return $("//div[@class='product__title text-md']");
    }

    public WebElement getBtnSaveInMyList(){
        return $("//button[@class='footer__btn btn btn--graphite']");
    }

    public WebElement getBtnContinueAfterAddingToDivision(){
        return $("//button[@class='footer__btn btn btn--transparent']");
    }


    public WebElement getResultFindingProduct(){
        return $("//div[@class='search__title']");
    }

    public WebElement getTextWithProductSavedToList(){
        return $("//div[@class='modal__title']");
    }

    public WebElement getBtnGoToList(){
        return $("//a[.='Перейти до списку']");

    }

    public WebElement getBtnDellAll(){
        return $("//span[@class='link-action']");
    }



    public WebElement getBtnContinueWorkingAfterRemove(){
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

    public WebElement getWindowResultDivision() {
        return $("//div[@class='products-item__title text-sm']");
    }
}
