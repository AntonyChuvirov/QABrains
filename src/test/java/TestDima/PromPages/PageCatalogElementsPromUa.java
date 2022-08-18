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
        return $("//a[@href='/ua/Sad'][text()='Сад']");
    }

    public WebElement getFieldModernHouse(){
        return $("//a[@href='/ua/Sovremennyj-dom'][text()='Сучасний будинок']");
    }

    public WebElement getBtnTechnicsAndElectronics(){
        return $("//a[.='Техніка та електроніка']//span[@style='vertical-align: middle;']");
    }

    public WebElement getFieldHouseholdAppliances(){
        return $("//a[@href='/ua/Bytovaya-tehnika'][text()='Побутова техніка']");
    }

    public WebElement getFieldTV_AndVideoEquipment(){
        return $("//a[@href='/ua/Audio-video-foto-tehnika'][text()='TV та відеотехніка']");
    }

    public WebElement getBtnAccessoriesAndDecorations(){
        return $("//a[.='Аксесуари та прикраси']//span[@style='vertical-align: middle;']");
    }

    public WebElement getFieldJewelry(){
        return $("//a[@href='/ua/Yuvelirnye-izdeliya'][text()='Ювелірні вироби']");
    }

    public WebElement geFieldHaberdasheryAndAccessories(){
        return $("//a[@href='/ua/Galantereya-ukrasheniya-yuvelirnye-izdeliya'][text()='Галантерея та аксесуари']");
    }

    public WebElement getBtnMedicinesAndMedicalProducts(){
        return $("//a[.='Медикаменти та медичні товари']//span[@style='vertical-align: middle;']");
    }

    public WebElement getFieldNaturalDrugs(){
        return $("//a[@href='/ua/Naturalnye-preparaty'][text()='Натуральні препарати']");
    }

    public WebElement getFieldMedicalProducts(){
        return $("//a[@href='/ua/Tovary-medicinskogo-naznacheniya'][text()='Товари медичного призначення']");
    }

    public WebElement getBtnAutoMoto(){
        return $("//a[.='Авто-, мото']//span[@style='vertical-align: middle;']");
    }

    public WebElement getFieldMototechnics(){
        return $("//a[@class='_0cNvO jTHPH'][text()='Мототехніка']");
    }

    public WebElement getFieldAutoTool(){
        return $("//a[@href='/ua/Avtoinstrument'][text()='Автоінструмент']");
    }
}
