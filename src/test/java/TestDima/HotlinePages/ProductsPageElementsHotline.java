package TestDima.HotlinePages;

import BaseClasses.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductsPageElementsHotline extends BasePage {


    public ProductsPageElementsHotline(WebDriver driver) {
        super(driver);
    }

    public WebElement getSelectedPhone() {
        return waitClickableElement("//img[@src='/img/tx/318/318547231_s265.jpg']");
    }

    public WebElement getBtnAddProductToMyLists() {
        return waitClickableElement("//div[@class='search-list__body']/div[3]//div[@class='bookmark-button__title text-sm link link--gray']");
    }

    public WebElement getWindowWithNameAddProductInMyLists() {
        return waitClickableElement("//div[@class='product__title text-md']");
    }

    public WebElement getBtnSaveInMyList() {
        return waitClickableElement("//button[@class='footer__btn btn btn--graphite']");
    }

    public WebElement getBtnContinueAfterAddInComparison() {
        return waitClickableElement("//button[@class='footer__btn btn btn--transparent']");
    }

    public WebElement getResultWithFindedProducts() {
        return waitClickableElement("//div[@class='search__title']");
    }

    public WebElement getTextWithProductSavedToList() {
        return waitClickableElement("//div[@class='modal__title']");
    }

    public WebElement getWindowWithConfirmAction() {
        return waitClickableElement("//p[contains(text(),'Видалити всі товари?')]");
    }

    public WebElement getBtnYesInWindowWithConfirmAction() {
        return waitClickableElement("//button[.='Так']");
    }

    public WebElement getBtnCancelInWindowWithConfirmAction() {
        return waitClickableElement("//div[@class='fade active']//button[@class='btn-gray']");
    }

    public WebElement getAddedNameProductInComparison() {
        return waitClickableElement("//div[@class='products-item__title text-sm']");
    }

    public WebElement getBtnGoToList() {
        return waitClickableElement("//a[.='Перейти до списку']");
    }

    public WebElement getBtnAddAirpodsInMyList() {
        return waitClickableElement("//div[@class='search-list__body']/div[1]//div[@class='bookmark-button__title text-sm link link--gray']");
    }

    public WebElement getBtnDeleteAllProductInMyList() {
        return waitClickableElement("//span[@class='link-action']");
    }

    public WebElement getBtnDellAll() {
        return waitClickableElement("//span[@class='link-action']");
    }

    public WebElement getWindowWithNameProductNull() {
        return waitClickableElement("//h1[.='Закладки: 0']");
    }

    public WebElement getSelectedTV() {
        return waitClickableElement("//div[@class='search-list__body']//a[contains(.,'Nokia Smart TV 5000A')]");
    }

    public WebElement getBtnAddProductInComparison() {
        return waitClickableElement("//div[@title='Додати товар до порівняння']");
    }

    public WebElement getListDivision() {
        return waitClickableElement("//div[contains(text(),'Товар доданий до порівняння')]");
    }

    public WebElement getBtnAddedToDivision() {
        return waitClickableElement("//div[contains(text(),'Порівняння')]");
    }

    public WebElement getTexListDivisionIsClean() {
        return waitClickableElement("//div[@class='compare-empty__title']");
    }

    public WebElement getBtnCleanComparison() {
        return waitClickableElement("//i[@class='icon icon--delete']");
    }

    public WebElement getWindowResultComparison() {
        return waitClickableElement("//div[@class='products-item__title text-sm']");
    }

    public WebElement getListCatalog() {
        return waitClickableElement("//div[@class='catalog-list']");
    }

    public WebElement getBtnSportSection() {
        return waitClickableElement("//li[.='Спорт, Активний відпочинок']");
    }

    public List<WebElement> getLisProductsSportsSelection() {
       return waitVisibleOfAllElements("//a[contains(text(),'Велокомп')]");
    }

    public WebElement getNewPageWithNameProducts() {
        return waitClickableElement("//h1[@class='catalog-title__main']");
    }

    public List<WebElement> getListProducts() {
        return waitVisibleOfAllElements("//div[@class='list-item__photo']");
    }

    public WebElement getPageWithNameProduct1() {
        return waitClickableElement("//div[1]/h1[1]");
    }

    public WebElement getPageWithNameProduct2() {
        return waitClickableElement("//h1[@class='title__main']");
    }

    public WebElement getSortingField(){
        return waitClickableElement("//div[@class='sidebar-filter']/../..");
    }

    public WebElement getCheckBoxTravelBag(){
        return waitClickableElement("//span[.='Дорожня сумка']");
    }

    public WebElement getCheckBoxMediumSize(){
        return waitClickableElement("//div[@class='sidebar-filters__container']/div[2]//label[3]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getCheckBoxVolume31_50l(){
        return waitClickableElement("//div[@class='sidebar-filters__container']/div[4]//label[2]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getBtnExpandBrandsFilters (){
        return waitClickableElement("//div[@class='sidebar-filter__bottom-button']");
    }
    public WebElement getCheckBoxBrandAmericanTourister(){
        return waitClickableElement("//div[@class='sidebar-filters__container']/div[5]//div[2]/label[5]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getCheckBoxBrandPiquardo(){
        return waitClickableElement("//label[90]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getBtnExpandOtherFilters(){
        return waitClickableElement("//b[.='Розгорнути інші фільтри']");
    }

    public WebElement getFieldExpandOtherFilters(){
        return waitClickableElement("//b[.='Розгорнути інші фільтри']");
    }

    public WebElement getCheckBox4Wheels(){
        return waitClickableElement("//div[@class='sidebar-filters__container']/div[9]//label[2]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getCheckBox3__3_99Kg(){
        return waitClickableElement("//div[@class='sidebar-filters__container']/div[10]//label[3]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getCheckBlackColor (){
        return waitClickableElement("//div[@class='sidebar-filters__container']/div[11]//label[1]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getListCatalogProducts (){
        return waitClickableElement("//div[@class='blocks-container']");
    }

    public WebElement getFieldTourismAndFishing(){
        return waitClickableElement("//ul[@class='category-navigation content']/li[contains(.,'Риболовля')]");
    }

    public WebElement getPageWithTextTourismAndFishing(){
        return waitClickableElement("//h1[@class='title-page flex middle-xs section-title']");
    }

    public WebElement getBtnBaggage(){
        return waitClickableElement("//a[@href='/tourism/#bagazh']");
    }

    public WebElement getFieldBaggageProducts(){
        return waitClickableElement("//div[@class='navigation-container m_b-10']");
    }

    public WebElement getBtnSuitcase(){
        return waitClickableElement("//div[.='Валізи']");
    }

    public WebElement getCheckBoxPolycarbonateMaterial(){
        return waitClickableElement("//div[12]//label[@class='filter-checklist__item checkbox flex-inline middle-xs']/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getSortedProduct(){
        return waitClickableElement("//img[@alt='Piquadro BV3849B2_N']");
    }

    public WebElement getFieldWithSortedProducts(){
        return waitClickableElement("//div[@class='list-body']");
    }

    public WebElement getBtnSneakers(){
        return waitClickableElement("//div[@class='catalog-list']//div[6]//a[.='Кросівки']");
    }

    public WebElement getCheckBoxForMan(){
        return waitClickableElement("//div[@class='sidebar-filters__container']/div[2]//label[1]/div[@class='checkbox__checkmark checkbox__checkmark-plus']");
    }

    public WebElement getCheckBoxSize42(){
        return waitClickableElement("//div[@class='sidebar-filters__container']//label[8]/div[contains(.,'42')]");
    }

    public WebElement getFieldInputPriceFrom(){
        return waitClickableElement("//div[3]/div[2]/div[1]/div/div[2]/div[1]/div[10]/div/div[2]/div/div[1]/input[1]");
    }

    public WebElement getFieldInputPriceTo(){
        return waitClickableElement("//div[3]/div[2]/div[1]/div/div[2]/div[1]/div[10]/div/div[2]/div/div[1]/input[2]");
    }

    public WebElement getBtnOk(){
        return waitClickableElement("//button[@class='filter-price__range-btn btn btn--graphite']");
    }

    public WebElement getAsicsGel_GelExcite8(){
        return waitClickableElement("//a[contains(text(),'Asics GEL-EXCITE 8 (2021) 42.0 Синій')]/.");
    }

    public WebElement getBtnBuy(){
        return waitClickableElement("//a[@data-tracking-id='goprice-13']");
    }

    public WebElement getButtonDisplayProduct1(){
        return waitClickableElement("//div[@class='list-headers__switch-item icon icon--view-list']");
    }

    public WebElement getButtonDisplayProduct2(){
        return waitClickableElement("//div[@class='list-headers__switch-item icon icon--view-module']");
    }
}
