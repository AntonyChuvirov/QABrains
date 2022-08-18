package TestDima.PromPages;

import org.openqa.selenium.WebDriver;

public class HomePagePromUa extends HomePageElementsPromUa {


    public HomePagePromUa(WebDriver driver) {
        super(driver);
    }

    public void goToHomePagePromUa() {
        driver.get("https://prom.ua/ua/");
    }

    public void inputInSearchFieldXiaomiRedmiNote11(){
        getSearchField().sendKeys("Xiaomi Redmi Note 11");
    }

    public void clickSearchBtn(){
        getBtnSearch().click();
    }
}
