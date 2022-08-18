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
}
