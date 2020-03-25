package Practice_Myself;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;//go to amazon,enter search term.click on search buton,verify title contains search term
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79.0").setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book", Keys.ENTER);
        driver.quit();

        String title = driver.getTitle();

        if (title.contains("java book")) {
        System.out.println("TEST PASSED");
    }else {
            System.out.println("TEST FAILED");

        }

        driver.quit();
    }
}
