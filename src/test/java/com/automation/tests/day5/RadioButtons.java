package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().version("79").setup();


        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();

        BrowserUtils.wait(2);
        //<input type="radio">

        List<WebElement> radioButtons = driver.findElements(By.tagName("input"));

        for (WebElement radioButton : radioButtons) {

            String id = radioButton.getAttribute("id");
            boolean isSelected=radioButton.isSelected();

            System.out.println(id +"is selected ? "+isSelected);

            if (radioButton.isEnabled()) {
                radioButton.click();

                System.out.println("Clicked on ::" + radioButton.getAttribute("id"));
                BrowserUtils.wait(1);


            } else {
                System.out.println("button is disabled,not clicked ::");
            }
            System.out.println();
            }
            driver.quit();
        }

    }

//if button is eligible to click
//return true of you can click on the button
// check if button eligible to click but not click