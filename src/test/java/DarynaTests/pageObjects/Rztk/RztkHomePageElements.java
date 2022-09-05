package DarynaTests.pageObjects.Rztk;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RztkHomePageElements extends BasePage {

    public RztkHomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getMenuBtn() { return driver.findElement(By
            .xpath("//button[@class='header__button ng-tns-c94-1']"));}

    public  WebElement getMenuWindow() { return driver.findElement(By
            .xpath("//div[@class='side-menu__body ng-tns-c94-1 ng-star-inserted']"));}
    public WebElement getLogoBtn(){
        return driver.findElement(By.xpath("//img[@alt='Rozetka Logo']"));
    }

    public WebElement getSearchField() {
        return driver.findElement(By
                .xpath("//input[@type='text'][@name='search']"));
    }

    public WebElement getSearchBtn() {
        return driver.findElement(By
                .xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']"));
    }

    public WebElement getCatalogBtn() {
        return driver.findElement(By.xpath("//button[@id='fat-menu']"));
    }

    public WebElement getLanguageChangRU() {
        return driver.findElement(By.xpath("//a[@class='lang__link ng-star-inserted']"));
    }

    public WebElement getLanguageChangUA() {
        return driver.findElement(By.xpath("//a[@class='lang__link ng-star-inserted']"));
    }

    public WebElement getDonatPage() {
        return driver.findElement(By.xpath("//a[@class='help-zsu header-actions__component']"));
    }

    public WebElement getLogInBtn() { return driver.findElement(By
            .xpath("//button[@class='header__button ng-star-inserted']"));}

    public WebElement getLogInWindow() { return driver.findElement(By
            .xpath("//div[@class='modal__holder modal__holder_show_animation modal__holder--medium']"));}

    public WebElement getPromoBtn() { return driver.findElement(By
            .xpath("//div[@class='top-information__inner']"));}

    public WebElement getPetProductCategory() { return driver.findElement(By
            .xpath("//*[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']"));}

    public WebElement getAquariumCategory() { return driver.findElement(By
            .xpath("//a[@class='menu__hidden-title'][contains(text(), 'Акваріуми')]"));}
}

