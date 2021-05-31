package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class BaseClass {
     public static WebDriver driver;
    @BeforeTest
    public void setUp(){
        if(driver == null){
            switch (ConfigurationReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }
        }

    }
    @AfterTest
    public void tearsDown() {
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }
    @BeforeClass
    public void goToApp(){
            driver.get(ConfigurationReader.getProperty("url"));
            driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
//    @BeforeMethod
//    public void login(){
//        ReusableMethods.login("hyraitesting@gmail.com","hyrai6161");
//    }
//    @AfterMethod
//    public static void logout(){ ReusableMethods.logout(); }
}
