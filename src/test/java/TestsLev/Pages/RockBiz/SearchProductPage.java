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
        return $("(//a[@href='https://rockway.biz/ua/futbolka-eskimo-callboy-king-of-the-rabbits'])[2]");
    }
    public WebElement getResultWhite(){
        return $("//h1");
    }

    public WebElement resultVzuttya(){
        return $("//h1");
    }
    public WebElement getSorting(){
        return driver.findElement(By.id("input-sort"));
    }
    public WebElement getLowHighPrice(){
        return $("//option[text()='Ціна (низька > висока)']");
    }
}
