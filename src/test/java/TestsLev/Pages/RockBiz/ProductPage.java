package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getSize(){
        return $("//span[text()='XL']");
    }
    public WebElement buy(){
        return $("//button[@id='button-cart-product']");
    }

    public WebElement filtrWhite(){
        return driver.findElement(By.name("ocf[10386]"));
    }
    public WebElement btnShowResult(){
        return $("//div[@class='popover-content']");
    }

    public WebElement getSizeChart(){
        return $("//a[@class='colorbox_size_chart__popup cboxElement']");
    }
    public WebElement popUpSize(){
        return $("(//p[contains(text(),'В замірах можлива похибка до 2 см')])[2]");
    }
}

