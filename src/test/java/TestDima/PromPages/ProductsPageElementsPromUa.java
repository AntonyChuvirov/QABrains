package TestDima.PromPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPageElementsPromUa extends BasePage {
    public ProductsPageElementsPromUa(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageWithNameProduct(){
        return $("//div[3]/div/h1/span");
    }

    public WebElement getFieldWithProduct (){
        return $("//div[@data-qaid='product_gallery']");
    }

    public WebElement getJACOBSMONARCH(){
        return $("//div[@class='MafxA Nt5uf tPYLO QdzA1 BmN-- UQxaL']/div[8]/div[@class='M3v0L DUxBc sMgZR _5R9j6 qzGRQ IM66u J5vFR hxTp1']/a[1]");
    }

    public WebElement getBtnBuyProduct(){
        return $("//button[@class='VS-Ex uTnwV YY-wN vtaL- fbnb0 Lj85N']/div[@class='M3v0L']");
    }

    public WebElement getWindowWithNameBasket(){
        return $("//span[@class='SE-UE _5dC+o W7WWR P+NTM y4dfw _4wKRS']");
    }

    public WebElement getNameProductInWindowBasket(){
        return $("//span[@class='SE-UE X9QvP eVJ8D']");
    }

    public WebElement getBtnBuyProductInBasket(){
        return $("//div/ul/li/div[4]/div/div/div[2]/button");
    }

    public WebElement getPagePlacingAnOrder(){
        return $("//span[@class='SE-UE _5dC+o W7WWR P+NTM y4dfw _4wKRS']");
    }
}
