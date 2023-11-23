package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    public static void main(String[] args) {

        /*
          1- http://babayigit.net/testdocs/ adresine gidilir
          2- INFO FORM butonuna tıklanır
          3- Form verileri girilir
          4- Save butonuna tıklanır
          5- Sonuç yazdırılır
       */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://babayigit.net/testdocs/");
        driver.findElement(By.xpath("//a[@href='information.html']")).click();
        driver.findElement(By.id("firstName")).sendKeys("ugi");
        // driver.findElement(By.xpath("input[@id='firstName']")).sendKeys("Tarık");
        driver.findElement(By.id("lastName")).sendKeys("uğurcan");
        driver.findElement(By.id("email")).sendKeys("ugurcan@ugi.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("905555554422");
        driver.findElement(By.cssSelector("input[id='age']")).sendKeys("15");
        driver.findElement(By.name("occupation")).sendKeys("Student");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("city")).sendKeys("Ankara");
        driver.findElement(By.id("country")).sendKeys("Türkiye");
        driver.findElement(By.xpath("//button")).click();

        System.out.println("Result Message = " + driver.findElement(By.id("resultMessage")).getText());
        driver.quit();
    }
}
