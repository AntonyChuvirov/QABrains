package TestsOlya.pageObject;

import BaseClasses.BasePage;
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

    public WebElement getCheckSerch(){return waitClickableElement("//a[@href='/ua/search?search_term=%D0%97%D0%B2%D0%BE%D0%BB%D0%BE%D0%B6%D1%83%D0%B2%D0%B0%D1%87%20%D0%BF%D0%BE%D0%B2%D1%96%D1%82%D1%80%D1%8F&category=625']");}
    public WebElement getCheckNowBuying() {
        return waitClickableElement("//h1[@class='_3Trjq gwkkx F7Tdh jF03G']");}
    public WebElement getCheckUAA() {
        return waitClickableElement(" //span[@class='_3Trjq F7Tdh aeJVe aXB7S']");}
    public WebElement getCheckRU() {
        return waitClickableElement("//span[@class='_3Trjq F7Tdh aeJVe aXB7S']");}

    public WebElement getCheckChat() {
        return waitClickableElement("//span[@class='_3Trjq jF03G F7Tdh']");}
    public WebElement getCheckMore() {
        return waitClickableElement("//h1[@class='_3Trjq gwkkx F7Tdh jF03G']");}
    public WebElement getCheckCreateStore() {
        return waitClickableElement("//span[@class='_3Trjq F7Tdh CG58O']");}

    public WebElement getCheckRegion() {
        return waitClickableElement(" //span[@class='_3Trjq R2ynx aXB7S gwkkx']");}
    public WebElement getCheckCreateAccount() {
        return waitClickableElement("//span[@class='_3Trjq ffgjE']");}

}







