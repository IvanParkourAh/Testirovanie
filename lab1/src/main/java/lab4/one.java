package lab4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Set;

public class one {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        try {

            driver.get("http://suninjuly.github.io/alert_accept.html");

            driver.findElement(By.cssSelector("button")).click();

            driver.switchTo().alert().accept();

            Thread.sleep(500);

            WebElement xElement = driver.findElement(By.id("input_value"));

            double x = Double.parseDouble(xElement.getText());
            double y = Math.log(Math.abs(12 * Math.sin(x)));

            driver.findElement(By.id("answer")).sendKeys(String.valueOf(y));
            driver.findElement(By.cssSelector("button")).click();

            Thread.sleep(5000);

        } finally {

        }
    }
}
