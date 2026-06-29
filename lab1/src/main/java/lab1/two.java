package lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class two {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.getTitle();

        try {
            driver.get("http://suninjuly.github.io/simple_form_find_task.html");

            driver.findElement(By.tagName("input")).sendKeys("Ivan");
            driver.findElement(By.name("last_name")).sendKeys("Petrov");
            driver.findElement(By.className("city")).sendKeys("Smolensk");
            driver.findElement(By.id("country")).sendKeys("Russia");
            driver.findElement(By.cssSelector("button.btn")).click();

            Thread.sleep(30000);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            driver.quit();

        }

    }

}

