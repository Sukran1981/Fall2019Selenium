package com.automation.tests.day7;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
        public class Xpath {

        public    static String userNameLocator = "//label[text()='Username']/following-sibling::input";
         public   static String passwordLocator="//label[text()='Password']/following-sibling::input";
         public static String loginBtnLocator="//button[contains(text(),'Login')]";
            // code little bit organize
            //we create String static variable

            public static void main(String[] args) {
                WebDriver driver = DriverFactory.createDriver("chrome");
                driver.get("http://practice.cybertekschool.com/login");
                BrowserUtils.wait(3);

               // driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"));
                driver.findElement(By.xpath(userNameLocator)).sendKeys("tomsmith");

                driver.findElement(By.xpath(passwordLocator)).sendKeys("SuperSecretPassword");

                driver.findElement(By.xpath(loginBtnLocator)).click();
                BrowserUtils.wait(3);
                driver.quit();
            }
        }


