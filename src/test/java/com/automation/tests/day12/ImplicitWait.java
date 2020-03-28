package com.automation.tests.day12;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.tagName;

public class ImplicitWait {

    private WebDriver driver;
    @BeforeMethod
  public void setup(){
        driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/2");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void waitTest(){
       driver.findElement(By.tagName("button")).click();
       WebElement finishElement=driver.findElement(By.id("finish"));

    }

    @AfterMethod
    public void teardown(){

        driver.quit();
    }
}