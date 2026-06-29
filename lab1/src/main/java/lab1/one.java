package lab1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class one {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.getTitle();

        try {
            driver.get("http://suninjuly.github.io/xpath_examples");
            WebElement button = driver.findElement(By.xpath("//button[text()='Gold']"));
            System.out.println("Успешно найдена кнопка: " + button.getText());
            button.click();
        } finally {
            driver.quit();
        }
    }
}