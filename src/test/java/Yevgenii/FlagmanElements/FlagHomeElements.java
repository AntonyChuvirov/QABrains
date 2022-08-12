package Yevgenii.FlagmanElements;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlagHomeElements extends BasePage {

    public FlagHomeElements(WebDriver driver){
        super(driver);
    }

    public WebElement clickLanguageBtnRu(){
        return $("//a[contains(text(),'Рус')]");
    }

    public WebElement clickLanguageBtnUa(){
        return $("//a[contains(text(),'Укр')]");
    }

    public WebElement getResaultLenguagRu(){
        return $("//a[contains(text(),'Войти с паролем')][1]");
    }

    public WebElement getResaultLenguagUa(){
        return $("//a[contains(text(),'Увійти з паролем')][1]");
    }

    public WebElement getFieldInput(){
        return $("//input[@id='search-text']");
    }

    public WebElement clickSearchBtn(){
        return $("//button[@class='search'][1]");
    }

    public WebElement getVisibilityText(){
        return $("//span[text()='«атрактант»']");
    }

    public WebElement getVisibilityNotText(){
        return $("//p[text()='Нічого не знайдено']");
    }

    public WebElement getCatalogBtn(){
        return $("//i[@class='icon icon-menu_item_1']");
    }

    public WebElement getCatalogEholotBtn(){
        return $("//div[contains(text(),'Ехолоти, навігатори і аксесуари')]");
    }
}
