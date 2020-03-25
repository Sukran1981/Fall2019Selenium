package com.automation.tests.homework1;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

    public class TestScript1_5{

        private WebDriver driver;
        private By registration_form = By.linkText("Registration Form");
        private By birthdayBy = By.name("birthday");
        private By firstName=By.name("firstname");
        private By lastName=By.name("lastname");
        private By userName=By.name("username");
        private By email=By.name("email");
        private By password=By.name("password");
        private By phoneNumber=By.name("phone");
        //private By dateOfBirth=By.name("birthday");
        private By department=By.name("department");
        private By gender=By.xpath("//input[@value='female']");
        private By jobTitle=By.name("job_title");
        private By selectLanguages=By.id("inlineCheckbox2");
        private By signUp=By.id("wooden_spoon");


        @Test
        public void Case1() {

            driver.findElement(birthdayBy).sendKeys("wrong_dob");

            WebElement wrongMessage=
                    driver.findElement(By.xpath("//small[contains(text(),'is not valid')]"));
            BrowserUtils.wait(2);
        }
///_______________________________________________________________________________//


        @Test
        public void Case2(){
            WebElement cplus= driver.findElement(By.xpath("//label[@for='inlineCheckbox1']"));
            assertTrue(cplus.isDisplayed());
            WebElement java= driver.findElement(By.xpath("//label[@for='inlineCheckbox2']"));
            assertTrue(java.isDisplayed());
            WebElement jscript= driver.findElement(By.xpath("//label[@for='inlineCheckbox3']"));
            assertTrue(jscript.isDisplayed());



        }

///=====================================================================================//
        @Test
        public void Case3(){


            driver.findElement(firstName).sendKeys("s");
            WebElement firstname=driver.findElement(By.xpath("//small[text()='first name must be more than 2 and less than 64 characters long']"));
             assertTrue(firstname.isDisplayed());
             BrowserUtils.wait(2);
}
        @Test
        public void Case4() {
            driver.findElement(lastName).sendKeys("s");
            WebElement wrongLstName = driver.findElement(By.xpath("//small[text()='The last name must be more than 2 and less than 64 characters long']"));
            assertTrue(wrongLstName.isDisplayed());
        }
            @Test
            public void Case5(){
            driver.findElement(firstName).sendKeys("sukran");
            driver.findElement(lastName).sendKeys("Sevilmis");
            driver.findElement(userName).sendKeys("sukran123");
            driver.findElement(email).sendKeys("sukransevilmis@gmail.com");
            driver.findElement(password).sendKeys("Sukran678");
            driver.findElement(phoneNumber).sendKeys("937-823-3782");
            driver.findElement(birthdayBy).sendKeys("01/01/2007");
            driver.findElement(gender).click();
            Select depart=new Select(driver.findElement(department));
                    depart.selectByVisibleText("Department of Engineering");
            //driver.findElement(jobTitle).click();
                Select job_Title=new Select(driver.findElement(jobTitle));
                job_Title.selectByVisibleText("SDET");
                //job_Title.selectByIndex(5);
            driver.findElement(selectLanguages).click();

            driver.findElement(signUp).click();

         String actual=  driver.findElement(By.tagName("p")).getText();
         String expected="You've successfully completed registration!";
         assertEquals(actual,expected);
            BrowserUtils.wait(2);



        }
        @BeforeMethod
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://practice-cybertekschool.herokuapp.com");
            driver.manage().window().maximize();
            driver.findElement(registration_form).click();


            BrowserUtils.wait(2);
        }

        @AfterMethod

        public void teardown() {

            driver.quit();
        }


    }



