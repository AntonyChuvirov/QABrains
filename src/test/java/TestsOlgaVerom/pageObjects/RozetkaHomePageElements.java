package TestsOlgaVerom.pageObjects;

import TestsOlgaVerom.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RozetkaHomePageElements extends BasePage {

    public RozetkaHomePageElements(WebDriver driver) {
        super(driver);
    }
    public WebElement getTaskBar(){
        return driver.findElement(By.xpath("//div[@class='header-layout']"));
    }
    public WebElement getLogoImage(){
        return driver.findElement(By.xpath("//img[@alt='Rozetka Logo']"));
    }
    public WebElement getCatalogImage(){
        return driver.findElement(By.xpath("//*[@id='fat-menu']"));
    }
    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@name='search']"));
    }
    public WebElement getAdDelivery(){
        return driver.findElement(By.xpath("//*[@class='top-information__inner']"));}
    public WebElement getBtnSale(){
        return driver.findElement(By.xpath("//li[@class='main-slider__pagination-item']"));}
    public WebElement getPictureDonate(){
        return driver.findElement(By.xpath("//span[text()='Повернись живим']"));}
    public WebElement getSearchImageBtn(){
        return driver.findElement(By.xpath("//*[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']"));}
    public WebElement getBasketBtn(){
        return driver.findElement(By.xpath("//*[@class='header__button ng-star-inserted']"));}
    public WebElement getRetailBtn(){
        return driver.findElement(By.xpath("//a[@href='retail/kyiv/']"));}
    public WebElement getVoiceSearchBtn(){
        return driver.findElement(By.xpath("//*[@class='search-form__microphone ng-star-inserted']"));}

}
