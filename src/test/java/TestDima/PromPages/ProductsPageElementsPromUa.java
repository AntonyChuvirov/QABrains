package TestDima.PromPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPageElementsPromUa extends BasePage {
    public ProductsPageElementsPromUa(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageNameProduct() {
        return waitClickableElement("//div[3]/div/h1/span");
    }

    public WebElement getPageNameTypesProduct() {
        return waitClickableElement("(//span[@class='_3Trjq'])[2]");
    }

    public WebElement getFieldWithProduct() {
        return waitClickableElement("//div[@data-qaid='product_gallery']");
    }

    public WebElement getJACOBSMONARCH() {
        return waitClickableElement("//div[@class='MafxA Nt5uf tPYLO QdzA1 BmN-- UQxaL']/div[8]/div[@class='M3v0L DUxBc sMgZR _5R9j6 qzGRQ IM66u J5vFR hxTp1']/a[1]");
    }

    public WebElement getBtnBuyProduct() {
        return waitClickableElement("//button[@class='VS-Ex uTnwV YY-wN vtaL- fbnb0 Lj85N']/div[@class='M3v0L']");
    }

    public WebElement getWindowWithNameBasket() {
        return waitClickableElement("//span[@class='SE-UE _5dC+o W7WWR P+NTM y4dfw _4wKRS']");
    }

    public WebElement getNameProductInWindowBasket() {
        return waitClickableElement("//span[@class='SE-UE X9QvP eVJ8D']");
    }

    public WebElement getBtnBuyProductInBasket() {
        return waitClickableElement("//div/ul/li/div[4]/div/div/div[2]/button");
    }

    public WebElement getPagePlacingAnOrder() {
        return waitClickableElement("//span[@class='SE-UE _5dC+o W7WWR P+NTM y4dfw _4wKRS']");
    }

    //------------------------TestDisplayCatalogProductsWithoutClickPromUa-----------------------------------------
    public List<WebElement> getList1CatalogCategoryProducts() {
        return waitVisibleOfAllElements("(//div[@class='M3v0L pRWt9 pz1E1 DUxBc'])[1]//li[@class='YSmsd']");
    }

    public List<WebElement> getList2CatalogCategoryProducts() {
        return waitVisibleOfAllElements("(//div[@class='M3v0L pRWt9 pz1E1 DUxBc'])[2]//li[@class='YSmsd']");
    }

    public WebElement getListCategoryProducts() {
        return waitClickableElement("//div[@class='nSa3G']");
    }

    //-----------------------------------TestSortingProductByBrandPromUa-------------------------------------------
    public List<WebElement> getListProductsFromListHouseAndGarden() {
        return waitClickableAllElements("//div[@class='M3v0L -pUjB']/a");
    }

    public List<WebElement> getListElementsCategoryProducts() {
        return waitClickableAllElements("//div[@class='nSa3G']//div[@class='M3v0L -pUjB']");
    }

    public List<WebElement> getListElementsTypeProducts() {
        return waitClickableAllElements("//li[@role='button']");
    }

    public WebElement getBtnShowAllBrands() {
        return waitClickableElement("//div[@data-qatitle='Виробник']//button[@data-qaid='more_button']");
    }

    public List<WebElement> getCheckBoxBrand() {
        return waitVisibleOfAllElements("//div[@data-qatitle='Виробник']//input[@class='-KDH8']");
    }

    public WebElement getProductsAfterSorting() {
        return waitClickableElement("//div[@data-qaid='product_gallery']//a[@target='_self']");
    }

    //    -----------------------------TestFilterPromUa-----------------------------------------------------------
    public List<WebElement> getListElementsMethodBuy() {
        return waitClickableAllElements("//div[@class='MafxA Nt5uf']//button[@type='button']");
    }

    public List<WebElement> getListDelivery() {
        return waitVisibleOfAllElements("//div[@data-qatitle='Доставка']//input");
    }

    public List<WebElement> getListElementsPriceRange() {
        return waitClickableAllElements("(//div[@class='MafxA IIzXA'])[1]//input");
    }

    public WebElement getBtnOkPriceRange() {
        return waitClickableElement("(//div[@class='MafxA IIzXA'])[1]//span");
    }

    public List<WebElement> getListProducts() {
        return waitClickableAllElements("//div[@class='l-GwW js-productad']");
    }

    public WebElement getBtnCleanAllInFilter() {
        return waitClickableElement("//span[text()='Cкинути все']");
    }
}
