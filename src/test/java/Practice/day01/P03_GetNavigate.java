package Practice.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GetNavigate {
    public static void main(String[] args) throws InterruptedException {

        //Set Path
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        //Create a chrome driver and maximize window
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //Open google home page https://www.google.com
        driver.get("https://www.google.com");

        //On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().back();

        //Wait about 4 sn
        Thread.sleep(4000);

        //Navigate forward to amazon
        driver.navigate().forward();

        //Refresh page
        Thread.sleep(5000);
        driver.navigate().refresh();

        //Close/quit the browser
        driver.quit();

        //And Last step print "All is well" on console
        System.out.println("All is Well");
    }
}
