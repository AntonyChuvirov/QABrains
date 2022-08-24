package TestsLev.Pages.RockBiz;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProductPage extends BasePage {
    public SearchProductPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getChooseProduct(){
        return waitClickableElement("//a[text()='Футболка Lil Peep (чорна)']");
    }
    public WebElement getResultWhite(){
        return waitClickableElement("//h1");
    }

    public WebElement resultVzuttya(){
        return waitClickableElement("//h1");
    }
    public WebElement getSorting(){
        return driver.findElement(By.id("input-sort"));
    }
    public WebElement getLowToHighPrice(){
        return waitClickableElement("//option[text()='Ціна (низька > висока)']");
    }
    public WebElement firstTshirt(){
        return waitClickableElement("(//a[@href='https://rockway.biz/ua/futbolka-lil-peep-chernaya'])[2]");
    }
}
