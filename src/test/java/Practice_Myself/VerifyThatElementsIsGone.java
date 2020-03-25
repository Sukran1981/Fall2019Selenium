package Practice_Myself;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyThatElementsIsGone {

    /*

    *How to check if element doesnt exists any more in DOM(Document Object Model
     */

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        Thread.sleep(2000);

        driver.findElement(By.id("disappearing_button")).click();
        Thread.sleep(2000);

       if(driver.findElements(By.id("disappearing_button")).size()==0) {
           System.out.println("TEST PASSED");
       }else{
           System.out.println("TEST FAILED");
        }
    }


}





