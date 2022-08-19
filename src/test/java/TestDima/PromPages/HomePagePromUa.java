package TestDima.PromPages;

import org.openqa.selenium.WebDriver;

public class HomePagePromUa extends HomePageElementsPromUa {


    public HomePagePromUa(WebDriver driver) {
        super(driver);
    }

    public void goToHomePagePromUa() {
        driver.get("https://prom.ua/ua/");
    }

    public void clickBtnSearch(){
        getBtnSearch().click();
    }

    public void clickFieldNameRegion(){
        getFieldNameRegion().click();
    }

    public void clickTextWithNameRegionUnderFieldInput(){
        getTextWithNameRegionUnderFieldInput().click();
    }

    public void clickBtnLanguageUkrainian(){
        getBtnLanguageUkrainian().click();
    }

    public void clickBtnLanguageRussian(){
        getBtnLanguageRussian().click();
    }
}
