package lab3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class two {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.getTitle();

        try {

            driver.get("https://suninjuly.github.io/execute_script.html");

            String xStr = driver.findElement(By.id("input_value")).getText();
            int x = Integer.parseInt(xStr);

            double y = Math.log(Math.abs(12 * Math.sin(x)));

            WebElement answerInput = driver.findElement(By.id("answer"));

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", answerInput);
            Thread.sleep(500);

            answerInput.sendKeys(String.valueOf(y));

            driver.findElement(By.id("robotCheckbox")).click();
            driver.findElement(By.id("robotsRule")).click();
            WebElement button = driver.findElement(By.cssSelector("button"));
            js.executeScript("arguments[0].click();", button);

            Thread.sleep(5000);

        } finally {
            driver.quit();

        }
    }
}