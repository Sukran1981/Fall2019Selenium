package Practice_Myself;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass2 {

    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);

        WebElement  simpleDropdown=driver.findElement(By.id("dropdown"));
        Select selectSimpleDropdown=new Select(simpleDropdown);
        selectSimpleDropdown.selectByVisibleText("Option 1");

        BrowserUtils.wait(3);
        driver.quit();

    }
}
