package IlonaTests.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogBtnPage extends BasePage {
    public CatalogBtnPage(WebDriver driver) {
        super(driver);
    }
    public void clickTheBtnInCatalog(){
        driver.findElement(By.xpath("//a[@class = 'menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']")).click();
    }
}
