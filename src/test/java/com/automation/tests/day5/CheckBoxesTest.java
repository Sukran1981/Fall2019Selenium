package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxesTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().version("79").setup();

        WebDriver driver =new ChromeDriver();

        driver.get("http:/" +
                "" +
                "" +
                "/practice.cybertekschool.com/checkboxes");

        //#Task
        //verify that 1st checkbox is not selected and 2nd is seleected

        List<WebElement> checkBoxes=driver.findElements(By.tagName("input"));

      if(!checkBoxes.get(0).isSelected()&& checkBoxes.get(1).isSelected()) {

          System.out.println("TEST PASSED");

      }else{

          System.out.println("TEST FAILED");
      }

        BrowserUtils.wait(2);

      WebElement checkbox1 =checkBoxes.get(0);//to get 1st checkbox

      checkbox1.click();

      if(checkbox1.isSelected()) {

          System.out.println(" test passed");

          System.out.println("checkbox#1 is selected");

      }else{

          System.out.println(" TEST FAILED");


          System.out.println("checkbox#1 is not selected");


      }

      driver.quit();



    }
}
