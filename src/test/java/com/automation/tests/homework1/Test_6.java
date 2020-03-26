package com.automation.tests.homework1;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_6 {

private WebDriver driver;
    @Test
public void Case6(){

        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tempmailaddress.com/");
        String email= driver.findElement(By.id("email")).getText();

        BrowserUtils.wait(3);
        driver.navigate().to("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        BrowserUtils.wait(3);

        driver.findElement(By.name("full_name")).sendKeys("John Adams");
        driver.findElement(By.name("email")).sendKeys(email);

        BrowserUtils.wait(3);

        driver.findElement(By.className("radius")).click();
        //driver.findElement(By.name("wooden_spoon")).click();
        BrowserUtils.wait(3);

        WebElement message= driver.findElement(By.name("signup_message"));

        Assert.assertTrue(message.isDisplayed());
        BrowserUtils.wait(3);

        driver.navigate().to("https://www.tempmailaddress.com/");
        BrowserUtils.wait(3);

        WebElement receivedEmail=  driver.findElement(By.xpath("//td[text()='do-not-reply@practice.cybertekschool.com']"));
        Assert.assertTrue(receivedEmail.isDisplayed());

        receivedEmail.click();
        BrowserUtils.wait(3);

        String from=driver.findElement(By.id("odesilatel")).getText();
        String expected="do-not-reply@practice.cybertekschool.com";
        Assert.assertEquals(from,expected);
        BrowserUtils.wait(3);

       String subject= driver.findElement(By.id("predmet")).getText();
       String expectedSubject="Thanks for subscribing to practice.cybertekschool.com!";
       Assert.assertEquals(subject,expectedSubject);

       driver.quit();
    }
}