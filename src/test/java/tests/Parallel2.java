package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel2 {
    WebDriver driver;
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://amazon.com/");
        driver.quit();
    }







}
