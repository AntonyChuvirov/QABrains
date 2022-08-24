package TestDima.PromPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPageElementsPromUa extends BasePage {
    public ProductsPageElementsPromUa(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageWithNameProduct(){
        return waitClickableElement("//div[3]/div/h1/span");
    }

    public WebElement getPageWithNameProductAfterCatalog(){
        return waitClickableElement("//h1[@class='_3Trjq gwkkx F7Tdh jF03G']");
    }

    public WebElement getFieldWithProduct (){
        return waitClickableElement("//div[@data-qaid='product_gallery']");
    }

    public WebElement getJACOBSMONARCH(){
        return waitClickableElement("//div[@class='MafxA Nt5uf tPYLO QdzA1 BmN-- UQxaL']/div[8]/div[@class='M3v0L DUxBc sMgZR _5R9j6 qzGRQ IM66u J5vFR hxTp1']/a[1]");
    }

    public WebElement getBtnBuyProduct(){
        return waitClickableElement("//button[@class='VS-Ex uTnwV YY-wN vtaL- fbnb0 Lj85N']/div[@class='M3v0L']");
    }

    public WebElement getWindowWithNameBasket(){
        return waitClickableElement("//span[@class='SE-UE _5dC+o W7WWR P+NTM y4dfw _4wKRS']");
    }

    public WebElement getNameProductInWindowBasket(){
        return waitClickableElement("//span[@class='SE-UE X9QvP eVJ8D']");
    }

    public WebElement getBtnBuyProductInBasket(){
        return waitClickableElement("//div/ul/li/div[4]/div/div/div[2]/button");
    }

    public WebElement getPagePlacingAnOrder(){
        return waitClickableElement("//span[@class='SE-UE _5dC+o W7WWR P+NTM y4dfw _4wKRS']");
    }

//    ------TestChangeCatalogWithoutClickPromUa-----------

    public List<WebElement> getProductFromListSportAndRehabilitatio(){
        return waitVisibleOfAllElements("//div[@class='M3v0L -pUjB']");
    }

    public WebElement getListCatalogWithCategoriesProduct(){
        return waitClickableElement("//div[@class='M3v0L qzGRQ jjbWt BS5gN DUxBc']//ul[@class='nujFR']");
    }

    public List<WebElement> getCategoriesProduct(){
        return waitClickableAllElements("(//div[@class='M3v0L pRWt9 pz1E1 DUxBc'])[1]//li[@class='YSmsd']");
    }

    public WebElement getListWithCategoriesProducts(){
        return waitClickableElement("//ul[@class='nujFR']//li[@class='YSmsd']");
    }

    public WebElement getBtnHouseAndGarden(){
        return waitClickableElement("//a[.='Дім і сад']//span[@style='vertical-align:middle']");
    }

    public WebElement getCategoryGardenInTheListHouseAndGarden(){
        return waitClickableElement("//a[.='Сад']");
    }

    public WebElement getCategoryDishesInTheListHouseAndGarden(){
        return waitClickableElement("//a[.='Посуд']");
    }

    public WebElement getBtnTechnicsAndElectronics(){
        return waitClickableElement("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//span[@class='_3Trjq']/span[.='Техніка та електроніка']");
    }

    public WebElement getCategoryHouseholdAppliancesInTheListTechnicsAndElectronics(){
        return waitClickableElement("//a[.='Побутова техніка']");
    }

    public WebElement getCategoryAutomotiveElectronicsInTheListTechnicsAndElectronics(){
        return waitClickableElement("//a[.='Автомобільна електроніка']");
    }

    public WebElement getBtnAccessoriesAndDecorations(){
        return waitClickableElement("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Аксесуари та прикраси']");
    }

    public WebElement getCategoryJewelryInTheListAccessoriesAndDecorations(){
        return waitClickableElement("//a[.='Ювелірні вироби']");
    }

    public WebElement getCategoryHaberdasheryAndAccessoriesInTheListAccessoriesAndDecorations(){
        return waitClickableElement("//a[.='Галантерея та аксесуари']");
    }

    public WebElement getBtnMedicinesAndMedicalProducts(){
        return waitClickableElement("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Медикаменти та медичні товари']");
    }

    public WebElement getCategoryNaturalDrugsInTheListMedicinesAndMedicalProducts(){
        return waitClickableElement("//a[.='Натуральні препарати']");
    }

    public WebElement getCategoryMedicalProductsInTheListMedicinesAndMedicalProducts(){
        return waitClickableElement("//a[.='Товари медичного призначення']");
    }

    public WebElement getBtnAutoMoto(){
        return waitClickableElement("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Авто-, мото']");
    }

    public WebElement getCategoryMototechnicsInTheListAutoMoto(){
        return waitClickableElement("//a[.='Мототехніка']");
    }

    public WebElement getCategorytAutoToolInTheListAutoMoto(){
        return waitClickableElement("//a[.='Автоінструмент']");
    }

    public WebElement getBtnSportAndRehabilitation(){
        return waitClickableElement("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Спорт і відпочинок']");
    }

    public List<WebElement> getListProductsFromListHouseAndGarden(){
        return waitClickableAllElements("//div[@class='M3v0L -pUjB']/a");
    }
//-------------------ProductsPageElementsPromUa----------------
    public List<WebElement> getListTypeProducts(){
        return waitClickableAllElements("//div[@class='mOlOq StbVV']//li[@role='button']");
    }

    public WebElement getBtnShowAll(){
        return waitClickableElement("//div[@data-qatitle='Виробник']//button[@data-qaid='more_button']");
    }

    public List<WebElement> getCheckBoxBrand(){
        return waitVisibleOfAllElements("//div[@data-qatitle='Виробник']//input[@class='-KDH8']");
    }

    public WebElement getProductsAfterSorting(){
        return waitClickableElement ("//div[@data-qaid='product_gallery']//a[@target='_self']");
    }
}
