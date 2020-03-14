package Practice_Myself;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPracticeXPath2 {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        BrowserUtils.wait(3);

        WebElement headerText=driver.findElement(By.xpath("//span[@class='h1y']"));
        System.out.println(headerText.getText());
        driver.close();
    }
}
