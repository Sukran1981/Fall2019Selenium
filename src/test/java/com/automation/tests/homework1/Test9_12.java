package com.automation.tests.homework1;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test9_12 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Status Codes")).click();

        BrowserUtils.wait(2);
    }

    @Test
    public void Case9() {


        WebElement codeLink = driver.findElement(By.linkText("200"));
        codeLink.click();
        BrowserUtils.wait(3);


        String expectedMessage = "This page returned a 200 status code.";

        WebElement actualMessageElement = driver.findElement(By.xpath("//p"));
        String actualMessage = actualMessageElement.getText();

        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");

            //Assert.assertEquals(actualMessage, expectedMessage);
            BrowserUtils.wait(2);

        }

    }

    @Test
    public void Case10() {
        WebElement codeLink = driver.findElement(By.linkText("301"));
        codeLink.click();
        BrowserUtils.wait(3);


        String expectedMessage = "This page returned a 301 status code.";

        WebElement actualMessageElement = driver.findElement(By.xpath("//p"));
        String actualMessage = actualMessageElement.getText();

        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");

            //Assert.assertEquals(actualMessage, expectedMessage);
            BrowserUtils.wait(2);

        }

    }

    @Test
    public void Case11() {


        WebElement codeLink = driver.findElement(By.linkText("404"));
        codeLink.click();
        BrowserUtils.wait(3);


        String expectedMessage = "This page returned a 404 status code.";

        WebElement actualMessageElement = driver.findElement(By.xpath("//p"));
        String actualMessage = actualMessageElement.getText();

        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");

            //Assert.assertEquals(actualMessage, expectedMessage);
            BrowserUtils.wait(2);

        }
    }

    @Test
    public void Case12() {


        WebElement codeLink = driver.findElement(By.linkText("500"));
        codeLink.click();
        BrowserUtils.wait(3);


        String expectedMessage = "This page returned a 500 status code.";
        WebElement actualMessageElement = driver.findElement(By.xpath("//p"));
        String actualMessage = actualMessageElement.getText();

        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");

        }

        //BrowserUtils.wait(3);
        //driver.quit();

    }


    @AfterMethod
    public void teardown() {
        BrowserUtils.wait(3);
        driver.quit();

        }
    }
