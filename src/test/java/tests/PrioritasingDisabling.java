package tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PrioritasingDisabling {
    @Ignore
    @Test(priority = 2)
    void veli(){
        System.out.println("veli");
    }
    @Test(priority = 3)
    void hasan(){
        System.out.println("hasan");
    }

    @Test(priority = 4)
    void ali(){
        System.out.println("ali");
    }
    @Test(priority = 1,enabled = false)
    void zafer(){
        System.out.println("zafer");
    }
}
