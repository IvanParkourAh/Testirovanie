package lab2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class two {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        try {
            driver.get("https://suninjuly.github.io/get_attribute.html");

            WebElement chestImage = driver.findElement(By.id("treasure"));
            String xText = chestImage.getAttribute("valuex");
            double x = Double.parseDouble(xText);

            double y = Math.log(Math.abs(12 * (Math.sin(x))));
            String answer = String.valueOf(y);

            driver.findElement(By.id("answer")).sendKeys(answer);
            driver.findElement(By.id("robotCheckbox")).click();
            driver.findElement(By.id("robotsRule")).click();
            driver.findElement(By.cssSelector("button")).click();

            Thread.sleep(5000);

        } finally {
            driver.quit();
        }
    }
}