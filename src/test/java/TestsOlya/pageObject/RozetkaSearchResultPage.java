package TestsOlya.pageObject;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaSearchResultPage extends BasePage {
    public RozetkaSearchResultPage(WebDriver driver) {super(driver);}

    public WebElement getSearchImage() { return driver.findElement((By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']"))); }


    public WebElement getSearchField() {return driver.findElement(By.xpath("//input[@class='search-form__input ng-untouched ng-pristine ng-valid']"));

    }

    }


