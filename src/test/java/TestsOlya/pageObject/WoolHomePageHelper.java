package TestsOlya.pageObject;

import org.openqa.selenium.WebDriver;

public class MarmadeHomePageHelper extends MarmadeHomePageElenents {
    public MarmadeHomePageHelper(WebDriver driver) {super(driver); }
        public void navigateMarmade(){driver.get("https://mermade.com.ua/ru/");}
    }
