package Yevgenii.FlagmanPage;

import Yevgenii.FlagmanElements.FlagHomeElements;
import org.openqa.selenium.WebDriver;

public class FlagHomePage extends FlagHomeElements {

    public FlagHomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.flagman.kiev.ua/");
    }

    public FlagHomePage selectFieldInput() {
        getFieldInput().sendKeys("атрактант");
        return this;
    }

    public FlagHomePage selectFieldInput1() {
        getFieldInput().sendKeys("@#$%^");
        return this;
    }

    public FlagHomePage selectSearchBtn() {
        clickSearchBtn().click();
        return this;
    }

   public FlagHomePage selectLanguageBtnRu() {
   clickLanguageBtnRu().click();
   return this;
   }

    public FlagHomePage selectLanguageBtnUa() {
        clickLanguageBtnUa().click();
        return this;
    }

    public FlagHomePage selectCatalogBtn() {
        getCatalogBtn().click();
        return this;
    }

    public FlagHomePage selectCatalogEholotBtn() {
        getCatalogEholotBtn().click();
        return this;
    }
}
