package TestDima.HotlinePages;

import BaseClasses.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPageElementsHotline extends BasePage {


    public ProductsPageElementsHotline(WebDriver driver) {
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

    public WebElement getWindowWithConfirmAction() {
        return $("//p[contains(text(),'Видалити всі товари?')]");
    }

    public WebElement getBtnYesInWindowWithConfirmAction() {
        return $("//button[.='Так']");
    }

    public WebElement getBtnCancelInWindowWithConfirmAction() {
        return $("//div[@class='fade active']//button[@class='btn-gray']");
    }

    public WebElement getAddedNameProductInComparison() {
        return $("//div[@class='products-item__title text-sm']");
    }

    public WebElement getBtnGoToList() {
        return $("//a[.='Перейти до списку']");
    }

    public WebElement getBtnAddAirpodsInMyList() {
        return $("//div[@class='search-list__body']/div[1]//div[@class='bookmark-button__title text-sm link link--gray']");
    }

    public WebElement getBtnDeleteAllProductInMyList() {
        return $("//span[@class='link-action']");
    }

    public WebElement getBtnDellAll() {
        return $("//span[@class='link-action']");
    }

    public WebElement getWindowWithNameProductNull() {
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

    public WebElement getListCatalog() {
        return $("//div[@class='catalog-list']");
    }

    public WebElement getBtnSportSection() {
        return $("//li[.='Спорт, Активний відпочинок']");
    }

    public List<WebElement> getLisProductsSportsSelection() {
       return waitVisibilityOfAllElements("//a[contains(text(),'Велокомп')]");
    }

    public WebElement getNewPageWithNameProducts() {
        return $("//h1[@class='catalog-title__main']");
    }

    public List<WebElement> getListProducts() {
        return waitVisibilityOfAllElements("//div[@class='list-item__photo']");
    }

    public WebElement getPageWithNameProduct1() {
        return $("//div[1]/h1[1]");
    }

    public WebElement getPageWithNameProduct2() {
        return $("//h1[@class='title__main']");
    }

    public WebElement getSortingField(){
        return $("//div[@class='sidebar-filter']/../..");
    }

    public WebElement getCheckBoxTravelBag(){
        return $("//span[.='Дорожня сумка']");
    }

    public WebElement getCheckBoxMediumSize(){
        return $("//div[@class='sidebar-filters__container']/div[2]//label[3]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getCheckBoxVolume31_50l(){
        return $("//div[@class='sidebar-filters__container']/div[4]//label[2]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getBtnExpandBrandsFilters (){
        return $("//div[@class='sidebar-filter__bottom-button']");
    }
    public WebElement getCheckBoxBrandAmericanTourister(){
        return $("//div[@class='sidebar-filters__container']/div[5]//div[2]/label[5]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getCheckBoxBrandPiquardo(){
        return $("//label[90]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getBtnExpandOtherFilters(){
        return $("//b[.='Розгорнути інші фільтри']");
    }

    public WebElement getFieldExpandOtherFilters(){
        return $("//b[.='Розгорнути інші фільтри']");
    }

    public WebElement getCheckBox4Wheels(){
        return $("//div[@class='sidebar-filters__container']/div[9]//label[2]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getCheckBox3__3_99Kg(){
        return $("//div[@class='sidebar-filters__container']/div[10]//label[3]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getCheckBlackColor (){
        return $("//div[@class='sidebar-filters__container']/div[11]//label[1]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getListCatalogProducts (){
        return $("//div[@class='blocks-container']");
    }

    public WebElement getFieldTourismAndFishing(){
        return $("//ul[@class='category-navigation content']/li[contains(.,'Риболовля')]");
    }

    public WebElement getPageWithTextTourismAndFishing(){
        return $("//h1[@class='title-page flex middle-xs section-title']");
    }

    public WebElement getBtnBaggage(){
        return $("//a[@href='/tourism/#bagazh']");
    }

    public WebElement getFieldBaggageProducts(){
        return $("//div[@class='navigation-container m_b-10']");
    }

    public WebElement getBtnSuitcase(){
        return $("//div[.='Валізи']");
    }

    public WebElement getCheckBoxPolycarbonateMaterial(){
        return $("//div[12]//label[@class='filter-checklist__item checkbox flex-inline middle-xs']/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getSortedProduct(){
        return $("//img[@alt='Piquadro BV3849B2_N']");
    }

    public WebElement getFieldWithSortedProducts(){
        return $("//div[@class='list-body']");
    }

    public WebElement getBtnSneakers(){
        return $("//div[@class='catalog-list']//div[6]//a[.='Кросівки']");
    }

    public WebElement getCheckBoxForMan(){
        return $("//div[@class='sidebar-filters__container']/div[2]//label[1]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getCheckBoxSize42(){
        return $("//div[@class='sidebar-filters__container']//label[8]/div[contains(.,'42')]");
    }

    public WebElement getFieldInputPriceFrom(){
        return $("//div[3]/div[2]/div[1]/div/div[2]/div[1]/div[10]/div/div[2]/div/div[1]/input[1]");
    }

    public WebElement getFieldInputPriceTo(){
        return $("//div[3]/div[2]/div[1]/div/div[2]/div[1]/div[10]/div/div[2]/div/div[1]/input[2]");
    }

    public WebElement getBtnOk(){
        return $("//button[@class='filter-price__range-btn btn btn--graphite']");
    }

    public WebElement getAsicsGel_GelExcite8(){
        return $("//a[contains(text(),'Asics GEL-EXCITE 8 (2021) 42.0 Синій')]/.");
    }

    public WebElement getBtnBuy(){
        return $("//a[@data-tracking-id='goprice-13']");
    }

    public WebElement getButtonDisplayProduct1(){
        return $("//div[@class='list-headers__switch-item icon icon--view-list']");
    }

    public WebElement getButtonDisplayProduct2(){
        return $("//div[@class='list-headers__switch-item icon icon--view-module']");
    }
}
