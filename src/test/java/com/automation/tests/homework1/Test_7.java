package com.automation.tests.homework1;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_7 {

    private WebDriver driver;

    @Test(description="verify that uploaded file name is displayed.")
    public void Case7() {

        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("File Upload")).click();
        BrowserUtils.wait(3);


        driver.findElement(By.id("file-upload")).sendKeys("/Users/sukran2019/Desktop/sukran1upload.txt");
        BrowserUtils.wait(3);

        WebElement file_Uploaded= driver.findElement(By.id("file-submit"));
        file_Uploaded.click();
        BrowserUtils.wait(3);

        String actual=driver.findElement(By.tagName("h3")).getText();
        String expected="File Uploaded!";

        Assert.assertEquals(actual,expected);

        driver.quit();

    }
}