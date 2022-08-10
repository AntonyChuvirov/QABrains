package TestDima.Pages;

import org.openqa.selenium.WebDriver;

public class ProductsPage extends ProductsPageElements {


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void choosePhone() {
        getPhone().click();
    }

    public void addProductToDivision() {
        getBtnAddToDivision().click();
    }
}
