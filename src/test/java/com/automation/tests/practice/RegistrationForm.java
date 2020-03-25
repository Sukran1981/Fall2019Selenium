package com.automation.tests.practice;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationForm {

    private String URL="http://practice.cybertekschool.com/registration_form";
    private WebDriver driver;
//p tag name of success message

    //private String firstNameLocator="firstname";
    private By firstNameBy= By.name("firstname");
    //private String lastNameLocator="lastname";
    private By lastNameBy=By.name("lastname");
    private By usernameBy=By.name("username");

@Test
public void verifyFirstNameLengthTest(){
    driver.findElement(firstNameBy).sendKeys("a");
    BrowserUtils.wait(3);
    //WebElement warningMessage=driver.findElement(By.xpath())

}

    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().version("79").setup();
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown(){

        driver.quit();
    }
}
