package com.automation.tests.day11;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FluentWaitTest {
private WebDriver driver;


    @BeforeMethod
    public void setup(){
        driver= DriverFactory.createDriver("chrome");
    }



    @AfterMethod
    public void teardown(){
driver.quit();
    }


    @Test
    public void fluentWaitTest(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading/6");


            //10, TimeUnit.SECONDS = Duration.ofSeconds(10)
            Wait<WebDriver> wait = new FluentWait<>(driver).
                    withTimeout(Duration.ofSeconds(10)).
                    pollingEvery(Duration.ofSeconds(3)).
                    ignoring(NoSuchElementException.class);
        }
    }


