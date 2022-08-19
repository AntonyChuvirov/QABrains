package TestDima.PromPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageCatalogElementsPromUa extends BasePage {
    public PageCatalogElementsPromUa(WebDriver driver) {
        super(driver);
    }

    public WebElement getBtnHouseAndGarden(){
        return $("//a[.='Дім і сад']//span[@style='vertical-align:middle']");
    }

    public WebElement getFieldGarden(){
        return $("//a[.='Сад']");
    }

    public WebElement getFieldDishes(){
        return $("//a[.='Посуд']");
    }

    public WebElement getBtnTechnicsAndElectronics(){
        return $("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//span[@class='_3Trjq']/span[.='Техніка та електроніка']");
    }

    public WebElement getFieldHouseholdAppliances(){
        return $("//a[.='Побутова техніка']");
    }

    public WebElement getFieldAutomotiveElectronics(){
        return $("//a[.='Автомобільна електроніка']");
    }

    public WebElement getBtnAccessoriesAndDecorations(){
        return $("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Аксесуари та прикраси']");
    }

    public WebElement getFieldJewelry(){
        return $("//a[.='Ювелірні вироби']");
    }

    public WebElement geFieldHaberdasheryAndAccessories(){
        return $("//a[.='Галантерея та аксесуари']");
    }

    public WebElement getBtnMedicinesAndMedicalProducts(){
        return $("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Медикаменти та медичні товари']");
    }

    public WebElement getFieldNaturalDrugs(){
        return $("//a[.='Натуральні препарати']");
    }

    public WebElement getFieldMedicalProducts(){
        return $("//a[.='Товари медичного призначення']");
    }

    public WebElement getBtnAutoMoto(){
        return $("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Авто-, мото']");
    }

    public WebElement getFieldMototechnics(){
        return $("//a[.='Мототехніка']");
    }

    public WebElement getFieldAutoTool(){
        return $("//a[.='Автоінструмент']");
    }
}
