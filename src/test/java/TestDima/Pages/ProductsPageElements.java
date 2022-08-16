package TestDima.Pages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPageElements extends BasePage {


    public ProductsPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getSelectedPhone() {
        return $("//img[@src='/img/tx/318/318547231_s265.jpg']");
    }

       public WebElement getBtnAddProductToMyLists() {
        return $("//div[@class='search-list__body']/div[3]//div[@class='bookmark-button__title text-sm link link--gray']");
    }

    public WebElement getWindowWithNameAddProductInMyLists() {
        return $("//div[@class='product__title text-md']");
    }

    public WebElement getBtnSaveInMyList() {
        return $("//button[@class='footer__btn btn btn--graphite']");
    }

    public WebElement getBtnContinueAfterAddInComparison() {
        return $("//button[@class='footer__btn btn btn--transparent']");
    }

    public WebElement getResultWithFindedProducts() {
        return $("//div[@class='search__title']");
    }

    public WebElement getTextWithProductSavedToList() {
        return $("//div[@class='modal__title']");
    }

    public WebElement getWindowWithConfirmAction(){
        return $("//p[contains(text(),'Видалити всі товари?')]");
    }

    public WebElement getBtnYesInWindowWithConfirmAction(){
        return $("//button[.='Так']");
    }

    public WebElement getBtnCancelInWindowWithConfirmAction(){
        return $("//div[@class='fade active']//button[@class='btn-gray']");
    }

    public WebElement getAddedNameProductInComparison(){
        return $("//div[@class='products-item__title text-sm']");
    }

    public WebElement getBtnGoToList() {
        return $("//a[.='Перейти до списку']");
    }

    public WebElement getBtnAddAirpodsInMyList() {
        return $("//div[@class='search-list__body']/div[1]//div[@class='bookmark-button__title text-sm link link--gray']");
    }

    public WebElement getBtnDeleteAllProductInMyList(){
        return $("//span[@class='link-action']");
    }

    public WebElement getBtnDellAll() {
        return $("//span[@class='link-action']");
    }

    public WebElement getWindowWithNameProductNull(){
        return $("//h1[.='Закладки: 0']");
    }

    public WebElement getSelectedTV() {
        return $("//div[@class='search-list__body']//a[contains(.,'Nokia Smart TV 5000A')]");
    }

    public WebElement getBtnAddProductInComparison() {
        return $("//div[@title='Додати товар до порівняння']");
    }

    public WebElement getListDivision() {
        return $("//div[contains(text(),'Товар доданий до порівняння')]");
    }

    public WebElement getBtnAddedToDivision() {
        return $("//div[contains(text(),'Порівняння')]");
    }

    public WebElement getTexListDivisionIsClean() {
        return $("//div[@class='compare-empty__title']");
    }

    public WebElement getBtnCleanComparison() {
        return $("//i[@class='icon icon--delete']");
    }

    public WebElement getWindowResultComparison() {
        return $("//div[@class='products-item__title text-sm']");
    }

    public WebElement getListCatalog(){
        return $("//div[@class='catalog-list']");
    }

    public WebElement getBtnSportSection(){
        return $("//li[.='Спорт, Активний відпочинок']");
    }

    public WebElement getBtnSportCatalogList(){
        return $("//div[@class='catalog-list']");
    }

    public WebElement getBtnBicyclComputers() {
        return $("//div[@class='viewbox scroll-smooth-to-active']//div[4]//a[.=\"Велокомп'ютери\"]");
    }

    public WebElement getNewPageWithNameProducts(){
        return $("//h1[@class='catalog-title__main']");
    }

    public WebElement getFieldWithPagesNumbers(){
        return $("//div[@class='pagination feed-paginate m_b-15']");
    }

    public WebElement getBtnPageNumber5(){
        return $("//div[@class='pagination__pages flex']/a[contains(.,'5')]");
    }

    public WebElement getListProducts(){
        return $("//div[@class='list-body__content content flex-wrap']");
    }

    public WebElement getPolarV650(){
        return $("//a[contains(.,'Polar V650')]");
    }

    public WebElement getPageWithNameProduct(){
        return $("//h1[@class='title__main']");
    }
}
