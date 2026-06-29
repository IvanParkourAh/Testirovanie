package lab1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class three {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.getTitle();

        try {
            driver.get("http://suninjuly.github.io/find_link_text");

            double x = Math.ceil(Math.pow(Math.PI, Math.E) * 10000);
            String linkText = String.valueOf((long) x);
            driver.findElement(By.linkText(linkText)).click();

            driver.findElement(By.tagName("input")).sendKeys("Ivan");
            driver.findElement(By.name("last_name")).sendKeys("Petrov");
            driver.findElement(By.className("city")).sendKeys("Smolensk");
            driver.findElement(By.id("country")).sendKeys("Russia");

            driver.findElement(By.cssSelector("button.btn")).click();

            Thread.sleep(30000);

        } finally {
            driver.quit();
        }
    }
}