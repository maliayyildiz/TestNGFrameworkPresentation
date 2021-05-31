package tests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.BaseClass;



public class DataPr  extends BaseClass {
//    @DataProvider(name = "mali")
//    public Object[][] getTestData(){
//
//        Object[][] data = {{"hyraitesting","hyrai6161"},{"hy@gmd.com","password1"},
//                {"ma@gmd.com","password1"},{"mali@gmd.com","password1"}};
//        return data;
//
//    }

    @Test(dataProvider = "mali", dataProviderClass = DataPrClass.class)
    void dp(String username,String pass){
        driver.findElement(By.cssSelector("[href='/api/login']")).click();
        driver.findElement(By.xpath("//input[@type='email']")).clear();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
      //  driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
