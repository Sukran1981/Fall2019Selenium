package Practice_Myself;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
static WebDriver driver= DriverFactory.createDriver("chrome");
    public static void main(String[] args) {

    }

    public static void setup(){
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        BrowserUtils.wait(3);

    }

    public static void selectByTextTest(){

        Select select=new Select(driver.findElement(By.id("dropdown")));

        select.selectByVisibleText("Option 1");
        BrowserUtils.wait(3);

        driver.quit();

    }
}
