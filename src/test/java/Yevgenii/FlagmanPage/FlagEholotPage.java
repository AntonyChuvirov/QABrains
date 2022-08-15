package Yevgenii.FlagmanPage;

import Yevgenii.FlagmanElements.FlagEholotElements;
import org.openqa.selenium.WebDriver;

public class FlagEholotPage extends FlagEholotElements {

    public FlagEholotPage(WebDriver driver) {
        super(driver);
    }

    public FlagEholotPage selectEholotBtn() {
        clickEholotBtn().click();
        return this;
    }

    public FlagEholotPage selectSortingEholotBtn() {
        clickSortingEholotBtn().sendKeys("по цене (от дешевых)");
        return this;
    }

    public FlagEholotPage selectSortingEholotBtn1() {
        clickSortingEholotBtn().sendKeys("по цене (от дорогих)");
        return this;
    }

    public FlagEholotPage selectCompareBtn() {
        clickCompareBtn().click();
        return this;
    }

    public FlagEholotPage selectBasketBtn() {
        getBasketBtn().click();
        return this;
    }

    public FlagEholotPage clickEholotLackyBtn() {
        getEholotLackyBtn().click();
        return this;
    }

    public FlagEholotPage clickManufacturerProductFilter() {
        getManufacturerProductFilter().get(4).click();
        return this;
    }
}
