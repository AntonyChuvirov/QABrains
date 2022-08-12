package TestsOlya.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OLXHomePageHelper  extends OLXHomePageElenents {
    public OLXHomePageHelper(WebDriver driver) {super(driver); }
        public void navigateOLX(){driver.get("https://www.olx.ua/uk/");}



    }
