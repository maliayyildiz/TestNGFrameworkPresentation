package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
    WebDriver driver;
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.quit();
    }

    @Test
    public void test1(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://hyrai.com/");
        driver.quit();
    }

    @Test
    public void test2(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        driver.quit();
    }



}
