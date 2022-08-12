package TestsOlgaVerom;

import org.testng.Assert;
import org.testng.annotations.Test;
import TestsOlgaVerom.pageObjects.RozetkaHomePageHelper;




public class TestRozetka extends TestInit {
    @Test
    public void checkHeader(){
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        Assert.assertTrue(rozetkaHomePageHelper.getTaskBar().isDisplayed());}
    @Test
    public void checkSearch(){
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getSearchField().sendKeys("Apple watch");
        rozetkaHomePageHelper.getSearchImageBtn().click(); }
    @Test
    public void checkCatalogImage(){
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getCatalogImage().click();}

    @Test
    public void checkBtnSale(){
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getBtnSale().click();}
    @Test
    public void checkLogoImage(){
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        Assert.assertTrue(rozetkaHomePageHelper.getLogoImage().isDisplayed());}
    @Test
    public void checkPictureDonate(){
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getPictureDonate().isDisplayed();}
    @Test
    public void checkAdDelivery(){
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        Assert.assertTrue(rozetkaHomePageHelper.getAdDelivery().isDisplayed());}
    @Test
    public void checkBasketBtn(){
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        Assert.assertTrue(rozetkaHomePageHelper.getBasketBtn().isDisplayed());}
    @Test
    public void checkRetailBtn(){
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        rozetkaHomePageHelper.getRetailBtn().click();}
    @Test
    public void checkVoiceSearchBtn(){
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.navigateRozetka();

        Assert.assertTrue(rozetkaHomePageHelper.getVoiceSearchBtn().isDisplayed());}

}
