package Practice_Myself;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StatusCodes2 {
//WebDriver driver=DriverFactory.createDriver("chrome");
    private WebDriver driver;
    @BeforeMethod
    public void setup(){


    driver=DriverFactory.createDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
    }

    @Test(description = "Verify that following message is displayed:'This page returned a 400 status code")
    public void testCase11() throws InterruptedException {
        //Step 1
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        //Step 2
        WebElement statusCodeLink = driver.findElement(By.linkText("Status Codes"));
        statusCodeLink.click();
        //Step 3
        WebElement statusCode = driver.findElement(By.linkText("404"));
        statusCode.click();
        Thread.sleep(3000);
        //Step 4
        String expectedMessage = "This page returned a 404 status code";
        WebElement displayedMessageElement = driver.findElement(By.xpath("//p"));
        String actualMessage = displayedMessageElement.getText();
        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Passed");
        } else {
            System.out.println("FAILED");
        }
        driver.close();

    }

    @DataProvider(name = "testData")
    public static Object[] testData() {
        return new Object[]{"404", "500", "301", "200"};
    }

    /*
         DataProvider returns data in form of single dimensional Object array (Object [])or 2 dimensional object array (Object [] [])
         Object [] --> When you have only 1 parameter
         Object [] [] --> When you have 2+ parameters
      */
    @Test(dataProvider = "testData")
    public void statusCodes(String code) {
        //500, 404 should be the parameters
        //Step 1
        WebDriver driver = DriverFactory.createDriver("chrome") ;
        driver.get("https://practice-cybertekschool.herokuapp.com");
        //Step 2
        WebElement statusCodeLink = driver.findElement(By.linkText("Status Codes"));
        statusCodeLink.click();
        //Step 3
        WebElement statusCode = driver.findElement(By.linkText(code));
        statusCode.click();
        String expectedMessage = "This page returned a " + code + " status code";
        WebElement displayedMessageElement = driver.findElement(By.xpath("//p"));
        String actualMessage = displayedMessageElement.getText();
        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Passed");
        } else {
            System.out.println("FAILED");
        }
        driver.close();
    }

@AfterMethod
    public void tearDown(){
        driver.close();

}
}


