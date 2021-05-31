package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnAlwaysRun {

    @Test(priority = 1)
    void start(){
        System.out.println("start car");

    }

    @Test(dependsOnMethods = {"start"} )
    void drive(){
        System.out.println("drive car");
    }
    @Test(priority = 2)
    void park(){
        System.out.println("park car");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"park","drive"}, alwaysRun = true)
    void stop(){
        System.out.println("stop car");
    }
}
