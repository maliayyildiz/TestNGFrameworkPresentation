package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.BaseClass;

public class TestNGAnnotations extends BaseClass {


    @Test
    public void test1() throws InterruptedException {
       driver.findElement(By.cssSelector("[href='/dashboard/add-client']")).click();
       Thread.sleep(5000);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.findElement(By.cssSelector("[href='/dashboard/settings']")).click();
        Thread.sleep(5000);
    }


}
