package lab3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class three {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();


        try {
            driver.get("http://suninjuly.github.io/file_input.html");

            driver.findElement(By.name("firstname")).sendKeys("Петя");
            driver.findElement(By.name("lastname")).sendKeys("Иванова");
            driver.findElement(By.name("email")).sendKeys("petr@test.com");

            File file = new File("test.txt");

            String absolutePath = file.getAbsolutePath();

            driver.findElement(By.id("file")).sendKeys(absolutePath);

            driver.findElement(By.cssSelector("button")).click();

            Thread.sleep(5000);

        } finally {
            driver.quit();
        }
    }
}