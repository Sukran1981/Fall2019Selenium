package com.automation.tests.day8;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNGTests {
    //runs before every test automatically
    //work as a pre -condition or setup
    @BeforeMethod
    public void setup(){

        System.out.println("BEFORE METHOD");
    }

    @Test
    public void test1(){
        String expected ="apple";
        String actual="apple";

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test2(){
        //it calls hard assertion
        //if assertion fails-it stops the execution(due to exception)
        int num1=5;
        int num2=10;
        Assert.assertTrue(num1<num2);
    }
}
