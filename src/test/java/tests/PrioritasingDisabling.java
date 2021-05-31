package tests;

import org.testng.annotations.Test;

public class PrioritasingDisabling {

    @Test(priority = 1)
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
    @Test(priority = 2, enabled = false)
    void zafer(){
        System.out.println("zafer");
    }
}
