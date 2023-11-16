package Practice.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wisequarter.com");
        driver.manage().window().maximize(); // pencereyi buyuk hale geeetirir
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // driver.manage().window().fullscreen(); // menuleri d gizleyerek tum ekkrani kaplar


        driver.quit();
    }
}
