package TestDima.PromPages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElementsPromUa extends BasePage {
    public HomePageElementsPromUa(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField(){
        return $("//input[@class='Dm7py']");
    }


    public WebElement getBtnSearch(){
        return $("//button[@class='VS-Ex yNx5B YY-wN vtaL- gPzcS _4msv1 blBdq aUEOj _3-Fnr Ly27e']");
    }
//------------------------------------TestSelectRegionPromUa-------------------------------------------------------
    public WebElement getFieldNameRegion(){
        return $("//span[@class='_3Trjq aXB7S gwkkx']");
    }

    public WebElement getFieldInputNameRegion(){
        return $("//input[@class='BVdm9 TLCTw C0Yyk nxZA7 EwoYv IYGn-']");
    }

    public WebElement getTextWithNameRegionUnderFieldInput(){
        return $("//button[1]/div[1]/div[1]/span[1]");
    }
}
