package Practice_Myself;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Radio_BUtton {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().version("79.0").setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
        BrowserUtils.wait(2);
        List<WebElement>radioButtons=driver.findElements(By.tagName("input"));
        for(WebElement radioButton :radioButtons){
            String id=radioButton.getAttribute("id");
           // String id=radioButton.getAttribute("type");
            //String id=radioButton.getAttribute("name");


            //if(radioButton.isEnabled())
            radioButton.click();

            //BrowserUtils.wait(2);
        }
        driver.quit();
    }
}
