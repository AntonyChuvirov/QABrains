package TestDima.PromPages;

import org.openqa.selenium.WebDriver;

public class HomePagePromUa extends HomePageElementsPromUa {


    public HomePagePromUa(WebDriver driver) {
        super(driver);
    }

    public void goToHomePagePromUa() {
        driver.get("https://prom.ua/ua/");
    }

    public void clickSearchBtn(){
        getBtnSearch().click();
    }
    //------------------------------------TestSelectRegionPromUa-------------------------------------------------------
    public void clickFieldNameRegion(){
        getFieldNameRegion().click();
    }

    public void clickTextWithNameRegionUnderFieldInput(){
        getTextWithNameRegionUnderFieldInput().click();
    }
}
