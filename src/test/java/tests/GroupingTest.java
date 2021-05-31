package tests;

import org.testng.annotations.Test;

public class GroupingTest {
    @Test(groups = {"smoke"})
    public void test(){
        System.out.println("smoke1");
    }
    @Test(groups = {"smoke","regression"})
    public void test1(){
        System.out.println("smoke,reg 1");
    }
    @Test(groups = {"smoke"})
    public void test2(){
        System.out.println("smoke2");
    }
    @Test
    public void test3(){
        System.out.println("bos");

    }
    @Test(groups = {"regression"})
    public void test4(){
        System.out.println("regres 1");
    }
    @Test(groups = {"smoke","regression"})
    public void test5(){
        System.out.println("smoke, reg 2");
    }
    @Test(groups = {"regression"})
    public void test6(){
        System.out.println("reg 2");
    }
}
