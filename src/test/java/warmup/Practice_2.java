package warmup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_2 {

    public static void main(String[] args) throws InterruptedException{


        WebDriverManager.chromedriver().setup();

        ChromeDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/windows");

        Thread.sleep(4000);

        //driver.close();

        driver.quit();


    }
}