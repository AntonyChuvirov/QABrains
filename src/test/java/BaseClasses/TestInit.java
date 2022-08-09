package BaseClasses;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();

    //put false here if you want to see browser
    boolean headless = false;

    @BeforeMethod
    public void setUp() {
//        if webdriver manager work fine, there is a bug at the moment
//        WebDriverManager.chromedriver_88_mac().setup();

        if (isOSMac()){
            setProperty("src/test/drivers/chromedriver_103_mac.exe");
        }else if (isOSWindows()){
            setProperty("src/test/drivers/chromedriver_104_win.exe");
        }else {
            setProperty("src/test/drivers/chromedriver_90_linux");
        }

        driver = new ChromeDriver(options);
        if(headless) {
            driver.manage().window().setSize(new Dimension(1920, 1200));
        } else {
            driver.manage().window().maximize();
        }
    }

    private void setProperty(String path) {
        System.setProperty("webdriver.chrome.driver", path);
        if (headless){
            options.addArguments("--headless");
        }
    }

    private boolean isOSWindows() {
        return getOSName().contains("win");
    }

    private boolean isOSMac() {
        return getOSName().contains("mac");
    }

    private String getOSName() {
        return System.getProperty("os.name").toLowerCase();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

    public void openUrl(String site) {
        driver.get(site);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
