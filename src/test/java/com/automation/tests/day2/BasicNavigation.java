package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {

    public static void main(String[] args) throws Exception {

        //to start selenium script we need:
        //setup webdriver(browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        //in selenium,everything  starts from WebDriver interface

        // CHROMEDRIVER EXTENDS REMOTEWEBDRIVER --->IMPLEMENTS WEBDRIVER
        driver.get("http://google.com");

        driver.manage().window().maximize();//to maximize browser
//      driver.manage().window().fullscreen();
        Thread.sleep(3000);//for demo ,wait 3 seconds

        //method that return page title
        //you can also see it is  as tab name, in the browser
        String title=driver.getTitle();
        String expectedTitle="Google";
        System.out.println("Title is...." + title);

        if(expectedTitle.equals(title)) {
            System.out.println("TEST PASSED!@");
        }else{
            System.out.println("TEST FAILED!");
        }

//go to another website within the same window
        driver.navigate().to("http://amazon.com");
        if(driver.getTitle().toLowerCase().contains("amazon")) {

            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }
//Comeback to google
        driver.navigate().back();
//CHECKING IF PAGE TITLE IS EQUALS TO GOOGLE
        verifyEquals(driver.getTitle(),"Google");
driver.navigate().forward();
        System.out.println("Title :"+driver.getTitle());
        //MUST BE AT THE END
        driver.close();//to close browser

        //browser cannot close itself
    }

    public static void verifyEquals(String arg1,String arg2){

        if(arg1.equals(arg2)) {
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED");
        }
    }

}
