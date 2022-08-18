package TestDima.PromPages;

import org.openqa.selenium.WebDriver;

public class ProductsPagePromUa extends ProductsPageElementsPromUa {
    public ProductsPagePromUa(WebDriver driver) {
        super(driver);
    }

    public void clickJACOBSMONARCH(){
       getJACOBSMONARCH().click();
    }

    public void clickBtnBuyProduct(){
        getBtnBuyProduct().click();
    }

    public void clickBtnBuyProductInBasket (){
        getBtnBuyProductInBasket().click();
    }
}
