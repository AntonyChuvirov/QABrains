package TestsOlya.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePageElements extends BasePage {
    public RozetkaHomePageElements(WebDriver driver) {
        super(driver);
    }
    public WebElement getSearchFieldRozetka() {
        return driver.findElement(By.xpath("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']"));
    }

    public WebElement getSearchImage() {
        return driver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']"));
    }
public  WebElement getlanguageChangeRU(){
    return driver.findElement(By.xpath("//span[@class='lang__link lang__link--active ng-star-inserted']"));
}

    public WebElement getlanguageChangeUA() {
        return driver.findElement(By.xpath("//a[@class='lang__link ng-star-inserted']"));
    }
    public WebElement getCheckCatalog() {
        return driver.findElement(By.xpath("//button[@class='button button--medium button--with-icon menu__toggle ng-star-inserted']"));}
    public WebElement getCheckCatalogZoo() {
        return driver.findElement(By.xpath("//a[@class='menu-categories__link js-menu-categories__link']"));}

    public WebElement getCheckLogo(){
        return driver.findElement(By.xpath("//img[@alt='Rozetka Logo']"));}
    public WebElement getCheckFreeDelivery(){
        return driver.findElement(By.xpath("//img[@class='top-information__picture ng-star-inserted']"));}
    public WebElement getSales() {return driver.findElement(By.xpath("//a[@class='menu-categories__link menu-categories__item_type_bordered']"));}

    public WebElement getBuy() {return driver.findElement(By.xpath("//span[@class='buy-button__label ng-star-inserted']"));}

    public WebElement getMore() {return driver.findElement(By.xpath("//button[@class='main-goods__show-more button_type_link ng-star-inserted']"));
    }

}


