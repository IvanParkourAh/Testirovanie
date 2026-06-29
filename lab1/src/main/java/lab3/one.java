package lab3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class one {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.getTitle();

        try {
            driver.get("https://suninjuly.github.io/selects1.html");

            String num1Str = driver.findElement(By.id("num1")).getText();
            String num2Str = driver.findElement(By.id("num2")).getText();

            int sum = Integer.parseInt(num1Str) + Integer.parseInt(num2Str);

            WebElement dropdown = driver.findElement(By.id("dropdown"));
            Select select = new Select(dropdown);

            select.selectByValue(String.valueOf(sum));

            driver.findElement(By.cssSelector("button")).click();

            Thread.sleep(5000);

        } finally {
            driver.quit();
        }
    }
}