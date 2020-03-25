package com.automation.tests.day11;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class WebTables {
    private WebDriver driver;


    @BeforeMethod
    public void setup() {
        //driver = DriverFactory.createDriver("chrome");

        WebDriverManager.chromedriver().version("79").setup();//HEADLESS MODE MAKES EXECUTION TWICE FASTER
        //IT DOES EVERYTHING EXCEPT FILE UPLOADING
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        driver = new ChromeDriver(chromeOptions);
        driver.get("http://practice.cybertekschool.com/tables");
        driver.manage().window().maximize();
        BrowserUtils.wait(3);

    }

    @Test
    public void table_test_content() {
        List<WebElement> emails = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody//td[3]"));
        for (WebElement email : emails)

            System.out.println(email.getText());

    }

    @Test
    public void getColumnNames() {

        List<String> expected = Arrays.asList("Last Name", "First Name", "Email", "Due", "Web Site", "Action");
        List<WebElement> columnNames = driver.findElements(By.xpath("//table[1]//th"));

        for (WebElement columnName : columnNames) {
            System.out.println(columnName.getText());
        }
        Assert.assertEquals(BrowserUtils.getTextFromWebElements(columnNames), expected);

    }

    @Test
    public void verifyRowCount() {
        ////tbody//tr---to get all rows from table body,excluding table header
        List<WebElement> rows = driver.findElements(By.xpath("//table[1]//tbody//tr"));
        Assert.assertEquals(rows.size(), 4);
    }


    @Test
    public void getSpecificColumn() {
//td[5]--column with links
        List<WebElement> links = driver.findElements(By.xpath("//table[1]//tbody//tr//td[5]"));

        System.out.println(BrowserUtils.getTextFromWebElements(links));
    }

    @Test
    public void deleteRowTest() {
/** TASK until 4:45
 * Go to tables example page
 * Delete record with jsmith@gmail.com email
 * verify that number of rows is equals to 3
 * verify that jsmith@gmail.com doesn't exists any more in the table
 */


    }

    //*LETS WRITE A FUNCTION THAT WILL RETURN COLUMN INDEX BASED ON COLUMN NAME
// *
    @Test
    public void getColumnIndexByName() {

        String columnName = "Email";

        List<WebElement> columnNames = driver.findElements(By.xpath("//table[2]//th"));
        int index = 0;
        for (int i = 0; i < columnNames.size(); i++) {

        }


       // @AfterMethod
       // public void teardown () {
            //BrowserUtils.wait(2);
           // driver.quit();
        }
    }
