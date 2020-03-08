package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();

        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        BrowserUtils.wait(5);

        List<WebElement> checkBoxes=driver.findElements(By.tagName("input"));

        checkBoxes.get(0).click();

        BrowserUtils.wait(5);

        for(int i=0 ; i<checkBoxes.size(); i++) {


            if (!checkBoxes.get(1).isDisplayed() && checkBoxes.get(1).isEnabled() && (!checkBoxes.get(1).isSelected())) {
                checkBoxes.get(1).click();

                System.out.println(i + 1 + "checkbox clicked");

            }else {

                System.out.println(i+1 + "checkbox wasnt clicked!");
            }
        }
        //if checkbox is not selected,dont click

        BrowserUtils.wait(5);

        driver.quit();

    }
}
