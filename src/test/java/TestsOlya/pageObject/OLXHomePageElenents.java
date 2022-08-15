package TestsOlya.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OLXHomePageElenents extends BasePage{
    public WebElement getCheckCloseIcon(){
        return driver.findElement(By.xpath("//button[@class='closeIcon']"));
    }
    public OLXHomePageElenents(WebDriver driver) {
        super(driver);
    }

public WebElement getCheckLogo(){
    return driver.findElement(By.xpath("//a[@class='olx-website-rebranded']"));}
    public WebElement getCloseCookie(){
        return driver.findElement(By.xpath("//button[@class='cookie-close abs cookiesBarClose']"));}


}
