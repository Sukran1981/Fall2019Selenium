package com.automation.tests.day11;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait {
private WebDriver driver;


    @BeforeMethod
    public void setup(){
        driver = DriverFactory.createDriver("chrome");
    }
    @Test
    public void waitForTitle(){
        driver.get("https://google.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait up to 10 seconds until title contains Google
        wait.until(ExpectedConditions.titleContains("Google"));
    }



    @Test
    public void waitForVisibility(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        driver.findElement(By.tagName("button")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.tagName("button")).click();

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement submitBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("tomsmith");
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("SuperSecretPassword");
        wait.until(ExpectedConditions.visibilityOf(submitBtn));
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();

        String expected = "Welcome to the Secure Area. When you are done click logout below.";
        String actual = driver.findElement(By.className("subheader")).getText();
        Assert.assertEquals(actual, expected);


    }

    @Test
    public void elementToBeClickableTest(){
driver.get("http://practice.cybertekschool.com/dynamic_loading/5");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement username=driver.findElement(By.name("username"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement submitBtn=driver.findElement(By.cssSelector("button[type='submit']"));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loadingoverlay"))) ;
         wait.until(ExpectedConditions.elementToBeClickable(submitBtn));

username.sendKeys("tomsmith");
password.sendKeys("SuperSecretPasswords");
submitBtn.click();


        String expected = "Welcome to the Secure Area. When you are done click logout below.";
        String actual = driver.findElement(By.className("subheader")).getText();
        Assert.assertEquals(actual, expected);

    }
//overlay screen ==> div element goes on top of page we have this page this screen, it will show up but not immediately there is a gap
//selenium starts manipulating once load done, but there is a gap=> between loading complete - overlay screen pop up
//submit button condition not helpful cause it becomes true even before overlay appears
//so we put condition:
//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loadingoverlay")));


    @AfterMethod
    public void teardown(){

        driver.quit();
    }
}
