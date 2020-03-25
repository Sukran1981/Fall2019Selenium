package Practice_Myself;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

        public class TestCase_12 {
            public static void main(String[] args) {

//Step1
                WebDriver driver = DriverFactory.createDriver("chrome");
                driver.get("http://practice-cybertekschool.herokuapp.com/");
                BrowserUtils.wait(3);

//Step 2
                WebElement statuscodeLink = driver.findElement(By.linkText("Status Codes"));//.click();
                statuscodeLink.click();

                //step3

                WebElement statusCode = driver.findElement(By.linkText("500"));
                statusCode.click();


                // Step4
                String expectedMessage = "";

                WebElement displayedMessageElement = driver.findElement(By.xpath("//p"));

                String actualMessage = displayedMessageElement.getText();
                if (actualMessage.contains(expectedMessage)) {
                    System.out.println("Passed");
                } else {
                    System.out.println("FAILED");
                }
                driver.close();
            }
        }