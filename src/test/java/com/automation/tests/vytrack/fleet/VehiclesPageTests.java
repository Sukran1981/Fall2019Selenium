package com.automation.tests.vytrack.fleet;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/** TASK
        under fleet package create a class called VehiclesPageTests
        In this class, you will need to create @beforemethod with setup and @aftermethod with teardown part. Use LoginPageTests class as a reference.
        create a test called verifyPageSubTitle
        - in this test, you will need to navigate to Fleet --> Vehicles and verify that page subtitle is equals to "All Cars"
        user assertions for validation.**/
public class VehiclesPageTests {
    private WebDriver driver;
    private String URL = "https://qa2.vytrack.com/user/login";
    private String username = "storemanager85";
    private String password = "UserUser123";
    private By usernameBy = By.id("prependedInput");
    private By passwordBy = By.id("prependedInput2");
@Test
public void verifyPageNumber(){
    driver.findElement(usernameBy).sendKeys(username);
    driver.findElement(passwordBy).sendKeys(password, Keys.ENTER);
    BrowserUtils.wait(5);
    //click on fleet
   // driver.findElement

}


@BeforeMethod
    public void setup() {
    WebDriverManager.chromedriver().version("79").setup();
    driver = new ChromeDriver();
    driver.get(URL);
    driver.manage().window().maximize();
}
    @AfterMethod
    public void teardown () {
        //if webdriver object alive
        if (driver != null) {
            //close browser, close session
            driver.quit();
            //destroy webdriver object for sure
            driver = null;
        }
    }
}
