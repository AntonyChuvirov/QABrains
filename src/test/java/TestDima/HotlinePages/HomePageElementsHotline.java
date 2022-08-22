package TestDima.HotlinePages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElementsHotline extends BasePage {


    public HomePageElementsHotline(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return waitClickableElement("//input[@id='searchbox']");
    }

    public WebElement getBtnSearch() {
        return waitClickableElement("//input[@id='doSearch']");
    }

    public WebElement getBtnAllCatalogs(){
        return waitClickableElement("//a[@href='/catalog/']");
    }

    public WebElement getBtnInCatalogTourismAndFishing(){
        return waitClickableElement("//a[.='Туризм, Риболовля']");
    }

    public WebElement getBtnElectronicCigarettes() {
        return waitClickableElement("//a[@href='/adult/elektronnye-sigarety/']");
    }

    public WebElement getBtnUkrainianLanguage(){
        return waitClickableElement("//div[1]/header/div[1]/div/div/div[1]/div[3]/div/span[2]");
    }

    public WebElement getBtnRussianLanguage(){
        return waitClickableElement("//div[1]/header/div[1]/div/div/div[1]/div[3]/div/span[1]");
    }

    public WebElement getBtnComparison(){
        return waitClickableElement("//div[@class='item-compare']");
    }
}
