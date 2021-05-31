package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utilities.BaseClass;
import utilities.ReusableMethods;

public class ParameterTest extends BaseClass {
    @Test
    @Parameters({"userName","pass"})
    void test(String userName, String pass){

        driver.findElement(By.cssSelector("[href='/api/login']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@type='submit']")).click();


        ReusableMethods.logout();
    }
}
