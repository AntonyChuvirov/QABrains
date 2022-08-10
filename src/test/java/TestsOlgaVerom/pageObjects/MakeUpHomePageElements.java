package TestsOlgaVerom.pageObjects;

import TestsOlgaVerom.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MakeUpHomePageElements extends BasePage {
    public MakeUpHomePageElements(WebDriver driver) {
        super(driver);
    }
    public WebElement getLogoImage(){
        return driver.findElement(By.xpath("//*[@class='logo  brave']"));
    }
    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@id='search-input']"));
    }
    public WebElement getLanguageBtn(){
        return driver.findElement(By.xpath("//a[@href='/ua/']"));
    }
    public WebElement getCooperationBtn(){
        return driver.findElement(By.xpath("//div[@class='cooperation']"));
    }
    public WebElement getBasketImage(){
        return driver.findElement(By.xpath("//div[@class='header-right-row']"));
    }
    public WebElement getImageCallBack(){
        return driver.findElement(By.xpath("//div[text()='Обратный звонок']"));
    }
    public WebElement getBtnSale(){
        return driver.findElement(By.xpath("//a[@href='/actions/']"));
    }
    public WebElement getDeliveryBtn(){
        return driver.findElement(By.xpath("//a[@href='/delivery/']"));
    }
    public WebElement getRegisterBtn(){
        return driver.findElement(By.xpath("//a[@href='/register/']"));
    }
}
