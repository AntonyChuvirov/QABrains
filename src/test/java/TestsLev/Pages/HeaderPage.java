package TestsLev.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage {

    public HeaderPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getCallBack(){
        return driver.findElement(By.xpath("//a[text()='Зворотній дзвінок']"));
    }
    public WebElement getIntroduce(){
        return driver.findElement(By.xpath("(//input[@name='name'])[2]"));
    }
    public WebElement getNumPhone(){
        return driver.findElement(By.xpath("(//input[@name='phone'])[1]"));
    }
    public WebElement getComment(){
        return driver.findElement(By.xpath("(//textarea[@style='width:290px; height:100px; border:1px solid #cccccc; padding:5px 5px 5px 5px; margin-top:5px;'])[2]"));
    }
    public WebElement getCliclBtnCall(){
        return driver.findElement(By.xpath("(//input[@class = 'general-vote'])[4]"));
    }
}
