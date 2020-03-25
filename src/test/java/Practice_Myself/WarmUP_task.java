package Practice_Myself;

import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class WarmUP_task {
    static WebDriver driver;

    public static void main(String[] args) throws Exception {

        ebayTest ();
        wikiTest();
    }
        public static void ebayTest(){
     driver= DriverFactory.createDriver("chrome");


        driver.get("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys("JAVA BOOK");
        driver.findElement(By.id("gh-btn")).click();
        WebElement searchResults=driver.findElement(By.tagName("h1"));

        String[] searchSentence=searchResults.getText().split("");
        System.out.println(Arrays.toString(searchSentence));
        System.out.println(searchSentence[0]);
        driver.quit();

    }
    public static void wikiTest() throws Exception{
        driver = DriverFactory.createDriver("chrome");

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver", Keys.RETURN);
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("Selenium (software)")).click();
        Thread.sleep(5000);

        String link=driver.getCurrentUrl();
        if(link.endsWith("Selenium_(software)")){

        System.out.println("test passed");
    }else {

            System.out.println("test failed");
        }
     driver.quit();


/**go to wikipedia.org
 *enter search term'selenium webdriver"
    *click on search button
    *click on search result'Selenium(software)'
    *verify url ends with'Selenium_(software)'
            */
    }
}
