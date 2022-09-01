package TestsOlya.Tests;

import BaseClasses.TestInit;
import TestsOlya.pageObject.MarmadeHomePageHelper;
import TestsOlya.pageObject.OLXHomePageHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.text.MaskFormatter;
public class TestMarmade extends TestInit {
@Test
public void checkRegistration(){
    MarmadeHomePageHelper marmadeHomePageHelper = new MarmadeHomePageHelper(driver);
marmadeHomePageHelper.navigateMarmade();
marmadeHomePageHelper.getCreateAccount().click();
marmadeHomePageHelper.getClickRegistration().click();
marmadeHomePageHelper.getClickName().sendKeys("Оля");
marmadeHomePageHelper.getClickEmail().sendKeys("semkovaolya5@gmail.com");
marmadeHomePageHelper.getClickPass().sendKeys("1111111");

    }
}