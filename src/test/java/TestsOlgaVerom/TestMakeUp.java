package TestsOlgaVerom;

import BaseClasses.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestsOlgaVerom.pageObjects.MakeUpHomePageHelper;

public class TestMakeUp extends TestInit {
    @Test
    public void checkLogoImage(){
        MakeUpHomePageHelper makeUpHomePageHelper = new MakeUpHomePageHelper(driver);
        makeUpHomePageHelper.navigateMakeUp();

        Assert.assertTrue(makeUpHomePageHelper.getLogoImage().isDisplayed());}
    @Test
    public void checkSearchField(){
        MakeUpHomePageHelper makeUpHomePageHelper = new MakeUpHomePageHelper(driver);
        makeUpHomePageHelper.navigateMakeUp();

        Assert.assertTrue(makeUpHomePageHelper.getSearchField().isDisplayed());}
    @Test
    public void checkSearchFieldDior(){
        MakeUpHomePageHelper makeUpHomePageHelper = new MakeUpHomePageHelper(driver);
        makeUpHomePageHelper.navigateMakeUp();

        makeUpHomePageHelper.getSearchField().sendKeys("Dior");
        makeUpHomePageHelper.getSearchField().click();}
    @Test
    public void checkLanguageBtn(){
        MakeUpHomePageHelper makeUpHomePageHelper = new MakeUpHomePageHelper(driver);
        makeUpHomePageHelper.navigateMakeUp();

        makeUpHomePageHelper.getLanguageBtn().click();}
    @Test
    public void checkCooperationBtn(){
        MakeUpHomePageHelper makeUpHomePageHelper = new MakeUpHomePageHelper(driver);
        makeUpHomePageHelper.navigateMakeUp();

        makeUpHomePageHelper.getCooperationBtn().click();}
    @Test
    public void checkBasketImage(){
        MakeUpHomePageHelper makeUpHomePageHelper = new MakeUpHomePageHelper(driver);
        makeUpHomePageHelper.navigateMakeUp();

        makeUpHomePageHelper.getBasketImage().isDisplayed();}
    @Test
    public void checkImageCallBack(){
        MakeUpHomePageHelper makeUpHomePageHelper = new MakeUpHomePageHelper(driver);
        makeUpHomePageHelper.navigateMakeUp();

        makeUpHomePageHelper.getImageCallBack().isDisplayed();}
    @Test
    public void checkBtnSale(){
        MakeUpHomePageHelper makeUpHomePageHelper = new MakeUpHomePageHelper(driver);
        makeUpHomePageHelper.navigateMakeUp();

        makeUpHomePageHelper.getBtnSale().click();}
    @Test
    public void checkDeliveryBtn(){
        MakeUpHomePageHelper makeUpHomePageHelper = new MakeUpHomePageHelper(driver);
        makeUpHomePageHelper.navigateMakeUp();

        makeUpHomePageHelper.getDeliveryBtn().click();}
    @Test
    public void checkRegisterBtn(){
        MakeUpHomePageHelper makeUpHomePageHelper = new MakeUpHomePageHelper(driver);
        makeUpHomePageHelper.navigateMakeUp();

        makeUpHomePageHelper.getRegisterBtn().isDisplayed();}

}
