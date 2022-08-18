package TestDima.HotlinePages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElementsHotline extends BasePage {


    public HomePageElementsHotline(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return $("//input[@id='searchbox']");
    }

    public WebElement getBtnSearch() {
        return $("//input[@id='doSearch']");
    }

    public WebElement getBtnAllCatalogs(){
        return $("//a[@href='/catalog/']");
    }

    public WebElement getBtnInCatalogTourismAndFishing(){
        return $("//a[.='Туризм, Риболовля']");
    }

    public WebElement getBtnElectronicCigarettes() {
        return $("//a[@href='/adult/elektronnye-sigarety/']");
    }

    public WebElement getBtnUkrainianLanguage(){
        return $("//div[1]/header/div[1]/div/div/div[1]/div[3]/div/span[2]");
    }

    public WebElement getBtnRussianLanguage(){
        return $("//div[1]/header/div[1]/div/div/div[1]/div[3]/div/span[1]");
    }

    public WebElement getBtnComparison(){
        return $("//div[@class='item-compare']");
    }
}
