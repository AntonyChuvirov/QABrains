package TestsOlya.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PromHomePageElements extends BasePage {




    public PromHomePageElements(WebDriver driver) {super(driver);}
    public WebElement getSearchImageProm() {
        return driver.findElement(By.xpath ("//button[@class='VS-Ex yNx5B YY-wN vtaL- gPzcS _4msv1 blBdq aUEOj _3-Fnr Ly27e']")) ;}
    public WebElement getSearchFieldProm() {
        return driver.findElement(By.xpath("//input[@class='Dm7py']"));}
    public WebElement getlogoProm(){
        return driver.findElement(By.xpath("//div[@class='M3v0L GL8ck']"));}
    public WebElement getCheckCatalog(){
        return driver.findElement(By.xpath("//a[@class='_0cNvO eBhBq _3qitx jwtUM']"));
    }
    public WebElement getlanguageChangeUA(){
        return driver.findElement(By.xpath("//span[@class='_3Trjq ye2-Z']"));}

    public WebElement getlanguageChangeRU() {
        return driver.findElement(By.xpath("//span[@class='_3Trjq ye2-Z']"));
    }
    public WebElement getChat(){
        return driver.findElement(By.xpath("//div[@class='hXxo4']"));
    }

    public WebElement getShowMore(){
        return driver.findElement(By.xpath("//a[@data-qaid='categories_more']"));
    }
    public WebElement getCreateStore(){
        return driver.findElement(By.xpath("//a[@class='VS-Ex HajJs YY-wN']"));}

    public WebElement getRegion() {
        return driver.findElement(By.xpath("//span[@class='_3Trjq aXB7S gwkkx']"));}

    public WebElement getPersonalAccount() {
        return driver.findElement(By.xpath("//a[@data-qaid='employee_cabinet']"));}

}







