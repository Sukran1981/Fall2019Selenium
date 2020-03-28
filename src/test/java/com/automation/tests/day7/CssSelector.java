package com.automation.tests.day7;


import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {


    public static void main(String[] args) {
        //WebDriverManager.chromedriver().version("79").setup();
       // WebDriver driver=new ChromeDriver();

        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement heading=driver.findElement(By.cssSelector(".h3"));
        WebElement home=driver.findElement(By.cssSelector(".nav-link"));

        WebElement button1=driver.findElement(By.cssSelector("[onclick='button1()']"));
                    button1.click();
        BrowserUtils.wait(2);
        WebElement button2=driver.findElement(By.cssSelector("[name='button2']"));
        button2.click();
        BrowserUtils.wait(2);
        WebElement button3=driver.findElement(By.cssSelector("[id^='button_']"));//start with
        button3.click();
        BrowserUtils.wait(2);
        WebElement button4=driver.findElement(By.cssSelector("[onclick='button4()']"));
        button4.click();
        BrowserUtils.wait(2);
        WebElement button5=driver.findElement(By.cssSelector("[onclick='button5()']"));
        button5.click();
        BrowserUtils.wait(2);
        WebElement button6=driver.findElement(By.cssSelector("#disappearing_button"));
        button6.click();

        BrowserUtils.wait(2);
        driver.quit();
    }


}