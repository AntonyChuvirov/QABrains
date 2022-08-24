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
        return $("//div[3]/div/h1/span");
    }

    public WebElement getPageWithNameProductAfterCatalog(){
        return $("//h1[@class='_3Trjq gwkkx F7Tdh jF03G']");
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

//    ------TestChangeCatalogWithoutClickPromUa-----------Elements-----------------

    public List<WebElement> getProductFromListSportAndRehabilitatio(){
        return waitVisibilityOfAllElements("//div[@class='M3v0L -pUjB']");
    }

    public WebElement getListCatalogWithCategoriesProduct(){
        return $("//div[@class='M3v0L qzGRQ jjbWt BS5gN DUxBc']//ul[@class='nujFR']");
    }

    public List<WebElement> getCategoriesProduct(){
        return waitClickableAllElements("(//div[@class='M3v0L pRWt9 pz1E1 DUxBc'])[1]//li[@class='YSmsd']");
    }

    public WebElement getListWithCategoriesProducts(){
        return $("//ul[@class='nujFR']//li[@class='YSmsd']");
    }

    public WebElement getBtnHouseAndGarden(){
        return $("//a[.='Дім і сад']//span[@style='vertical-align:middle']");
    }

    public WebElement getCategoryGardenInTheListHouseAndGarden(){
        return $("//a[.='Сад']");
    }

    public WebElement getCategoryDishesInTheListHouseAndGarden(){
        return $("//a[.='Посуд']");
    }

    public WebElement getBtnTechnicsAndElectronics(){
        return $("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//span[@class='_3Trjq']/span[.='Техніка та електроніка']");
    }

    public WebElement getCategoryHouseholdAppliancesInTheListTechnicsAndElectronics(){
        return $("//a[.='Побутова техніка']");
    }

    public WebElement getCategoryAutomotiveElectronicsInTheListTechnicsAndElectronics(){
        return $("//a[.='Автомобільна електроніка']");
    }

    public WebElement getBtnAccessoriesAndDecorations(){
        return $("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Аксесуари та прикраси']");
    }

    public WebElement getCategoryJewelryInTheListAccessoriesAndDecorations(){
        return $("//a[.='Ювелірні вироби']");
    }

    public WebElement getCategoryHaberdasheryAndAccessoriesInTheListAccessoriesAndDecorations(){
        return $("//a[.='Галантерея та аксесуари']");
    }

    public WebElement getBtnMedicinesAndMedicalProducts(){
        return $("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Медикаменти та медичні товари']");
    }

    public WebElement getCategoryNaturalDrugsInTheListMedicinesAndMedicalProducts(){
        return $("//a[.='Натуральні препарати']");
    }

    public WebElement getCategoryMedicalProductsInTheListMedicinesAndMedicalProducts(){
        return $("//a[.='Товари медичного призначення']");
    }

    public WebElement getBtnAutoMoto(){
        return $("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Авто-, мото']");
    }

    public WebElement getCategoryMototechnicsInTheListAutoMoto(){
        return $("//a[.='Мототехніка']");
    }

    public WebElement getCategorytAutoToolInTheListAutoMoto(){
        return $("//a[.='Автоінструмент']");
    }

    public WebElement getBtnSportAndRehabilitation(){
        return $("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Спорт і відпочинок']");
    }

    public List<WebElement> getListProductsFromListHouseAndGarden(){
        return waitClickableAllElements("//div[@class='M3v0L -pUjB']/a");
    }

    public List<WebElement> getListTypeProducts(){
        return waitClickableAllElements("//div[@class='mOlOq StbVV']//li[@role='button']");
    }

    public WebElement getBtnShowAll(){
        return $("//div[@data-qatitle='Виробник']//button[@data-qaid='more_button']");
    }

    public List<WebElement> getCheckBoxBrand(){
        return waitVisibilityOfAllElements("//div[@data-qatitle='Виробник']//input[@class='-KDH8']");
    }

    public WebElement getProductsAfterSorting(){
        return $ ("//div[@data-qaid='product_gallery']//a[@target='_self']");
    }
}
