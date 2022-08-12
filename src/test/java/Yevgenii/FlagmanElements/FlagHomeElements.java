package Yevgenii.FlagmanElements;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlagHomeElements extends BasePage {

    public FlagHomeElements(WebDriver driver){
        super(driver);
    }

    public WebElement clickLanguageBtnRu(){
        return driver.findElement(By.xpath("//a[contains(text(),'Рус')]"));
    }

    public WebElement clickLanguageBtnUa(){
        return driver.findElement(By.xpath("//a[contains(text(),'Укр')]"));
    }

    public WebElement getResaultLenguagRu(){
        return driver.findElement(By.xpath("//a[contains(text(),'Войти с паролем')][1]"));
    }

    public WebElement getResaultLenguagUa(){
        return driver.findElement(By.xpath("//a[contains(text(),'Увійти з паролем')][1]"));
    }

    public WebElement getFieldInput(){
        return driver.findElement(By.xpath("//input[@id='search-text']"));
    }

    public WebElement clickSearchBtn(){
        return driver.findElement(By.xpath("//button[@class='search'][1]"));
    }

    public WebElement getVisibilityText(){
        return driver.findElement(By.xpath("//span[text()='«атрактант»']"));
    }

    public WebElement getVisibilityNotText(){
        return driver.findElement(By.xpath("//p[text()='Нічого не знайдено']"));
    }

    public WebElement getCatalogBtn(){
        return driver.findElement(By.xpath("//i[@class='icon icon-menu_item_1']"));
    }

    public WebElement getCatalogEholotBtn(){
        return driver.findElement(By.xpath("//div[contains(text(),'Ехолоти, навігатори і аксесуари')]"));
    }
}
