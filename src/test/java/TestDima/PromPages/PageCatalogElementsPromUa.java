package TestDima.PromPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageCatalogElementsPromUa extends BasePage {
    public PageCatalogElementsPromUa(WebDriver driver) {
        super(driver);
    }

    public WebElement getBtnHouseAndGarden(){
        return waitClickableElement("//a[.='Дім і сад']//span[@style='vertical-align:middle']");
    }

    public WebElement getFieldGarden(){
        return waitClickableElement("//a[.='Сад']");
    }

    public WebElement getFieldDishes(){
        return waitClickableElement("//a[.='Посуд']");
    }

    public WebElement getBtnTechnicsAndElectronics(){
        return waitClickableElement("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//span[@class='_3Trjq']/span[.='Техніка та електроніка']");
    }

    public WebElement getFieldHouseholdAppliances(){
        return waitClickableElement("//a[.='Побутова техніка']");
    }

    public WebElement getFieldAutomotiveElectronics(){
        return waitClickableElement("//a[.='Автомобільна електроніка']");
    }

    public WebElement getBtnAccessoriesAndDecorations(){
        return waitClickableElement("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Аксесуари та прикраси']");
    }

    public WebElement getFieldJewelry(){
        return waitClickableElement("//a[.='Ювелірні вироби']");
    }

    public WebElement geFieldHaberdasheryAndAccessories(){
        return waitClickableElement("//a[.='Галантерея та аксесуари']");
    }

    public WebElement getBtnMedicinesAndMedicalProducts(){
        return waitClickableElement("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Медикаменти та медичні товари']");
    }

    public WebElement getFieldNaturalDrugs(){
        return waitClickableElement("//a[.='Натуральні препарати']");
    }

    public WebElement getFieldMedicalProducts(){
        return waitClickableElement("//a[.='Товари медичного призначення']");
    }

    public WebElement getBtnAutoMoto(){
        return waitClickableElement("//div[@class='M3v0L sMgZR BXDW- DUxBc IM66u yVZ7H']//a[.='Авто-, мото']");
    }

    public WebElement getFieldMototechnics(){
        return waitClickableElement("//a[.='Мототехніка']");
    }

    public WebElement getFieldAutoTool(){
        return waitClickableElement("//a[.='Автоінструмент']");
    }
}
