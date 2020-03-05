package warmup;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class March4 {

   /** Go to ebay
    enter search term
    click on search button
    print number of results

    go to amazon
    Go to ebay
    enter search term
    click on search button
    verify title contains search term

    Go to wikipedia.org
    enter search term `selenium webdriver`
    click on search button
    click on search result `Selenium (software)`
    verify url ends with `Selenium_(software)**/

static WebDriver driver;

    public static void main(String[] args) {
        /**ebayTest();
        amazonTest();
        wikiTest();
    }
public static void ebayTest() throws Exception{
driver= DriverFactory.createDriver("chrome");
driver.get("http://ebay.com");

driver.findElement(By.id("gh-ac")).sendKeys("java book");

driver.findElement(By.id("gh-btn")).click();

WebElement searchResults=driver.findElement(By.tagName("h1"));


String[] searchSentence=searchResults.getText().split("");
    System.out.println(searchResults.getText().split(" ")[0]);


driver.quit();
}
public static void amazonTest(){
    driver= DriverFactory.createDriver("chrome");


    driver.get("http://amazon.com");
    //enter text and click enter
    driver.findElement(By.id(" twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);
    String title=driver.getTitle();

    if(title.contains("java book"))


    driver.quit();
}
public static void wikiTest(){
    driver= DriverFactory.createDriver("chrome");

driver.get("https://www.wikipedia.org/");
driver.findElement(By.id("go")).click();
driver.findElement(By.id("searchInput")).sendKeys("Selenium(software)").
   // driver.quit();**/
}
}
