package Yevgenii.FlagmanElements;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlagHomeElements extends BasePage {

    public FlagHomeElements(WebDriver driver) {
        super(driver);
    }

    public WebElement clickLanguageBtnRu() {
        return waitClickableElement("//a[contains(text(),'Рус')]");
    }

    public WebElement clickLanguageBtnUa() {
        return waitClickableElement("//a[contains(text(),'Укр')]");
    }

    public WebElement getResaultLenguagRu() {
        return waitClickableElement("//a[contains(text(),'Войти с паролем')][1]");
    }

    public WebElement getResaultLenguagUa() {
        return waitClickableElement("//a[contains(text(),'Увійти з паролем')][1]");
    }

    public WebElement getFieldInput() {
        return waitClickableElement("//input[@id='search-text']");
    }

    public WebElement clickSearchBtn() {
        return waitClickableElement("//button[@class='search'][1]");
    }

    public WebElement getVisibilityText() {
        return waitClickableElement("//span[text()='«атрактант»']");
    }

    public WebElement getVisibilityNotText() {
        return waitClickableElement("//p[text()='Нічого не знайдено']");
    }

    public WebElement getCatalogBtn() {
        return waitClickableElement("//i[@class='icon icon-menu_item_1']");
    }

    public WebElement getCatalogEholotBtn() {
        return waitClickableElement("//div[contains(text(),'Ехолоти, навігатори і аксесуари')]");
    }

    public WebElement getCallBackHeader() {
        return waitClickableElement("//a[@id='callback-header']");
    }

    public WebElement getInputNamber() {
        return waitClickableElement("//input[@name='contact']");
    }

    public WebElement getInputName() {
        return waitClickableElement("//input[@name='name']");
    }

    public WebElement getinputComment() {
        return waitClickableElement("//textarea[@name='message']");
    }

    public WebElement getCallBtn() {
        return waitClickableElement("//button[@class='btn']");
    }

    public WebElement getVisibilityApplicationCall() {
        return waitClickableElement("//div[@name='msg']");
    }

    public WebElement getFieldNewsSubscription() {
        return waitClickableElement("//input[@id='subscribeEmailInput']");
    }

    public WebElement getFieldNewsSubscriptionBtn() {
        return waitClickableElement("//button[@name='subscribe']");
    }

    public WebElement getLoginBtn() {
        return waitClickableElement("//li/a[@name='signin']");
    }

    public WebElement getFieldInputNamber() {
        return waitClickableElement("//input[@id='login-field']");
    }

    public WebElement getFieldInputPassword() {
        return waitClickableElement("//input[@id='password-field']");
    }

    public WebElement getEnterBtn() {
        return waitClickableElement("//button[@class='btn btn-big']");
    }

    public WebElement getVisibilityTextLogin() {
        return waitClickableElement("//a[contains(text(),'Привіт')]");
    }
}
