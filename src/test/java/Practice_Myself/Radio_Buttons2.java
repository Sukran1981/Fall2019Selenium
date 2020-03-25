package Practice_Myself;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radio_Buttons2 {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blackButton=driver.findElement(By.id("black"));

        blackButton.click();
        if(blackButton.isSelected()) {
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
    }
}
