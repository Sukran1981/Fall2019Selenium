package warmup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver=new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.get("https://www.google.com");

        String title=driver.getTitle();
        System.out.println(title);


    }
}
