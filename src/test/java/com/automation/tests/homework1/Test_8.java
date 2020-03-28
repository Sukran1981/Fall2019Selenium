package com.automation.tests.homework1;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_8 {


   WebDriver driver;

   @Test
    public void Case8(){

       WebDriverManager.chromedriver().version("79").setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://practice-cybertekschool.herokuapp.com/");
       driver.findElement(By.linkText("Autocomplete")).click();
       BrowserUtils.wait(3);

        driver.findElement(By.id("myCountry")).sendKeys("United States of America");

      WebElement message=driver.findElement(By.xpath("//input[@type='button']"));
      message.click();
      Assert.assertTrue(message.isDisplayed());
       BrowserUtils.wait(3);
       driver.quit();
   }
}
