package lab1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class four {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.getTitle();


        try {
            driver.get("http://suninjuly.github.io/registration1.html");

            driver.findElement(By.className("input[placeholder='Input your first name']")).sendKeys("Ivan");
            driver.findElement(By.cssSelector("input[placeholder='Input your last name']")).sendKeys("Petrov");
            driver.findElement(By.cssSelector("input[placeholder='Input your email']")).sendKeys("test@test.com");
            driver.findElement(By.cssSelector("button.btn")).click();
            Thread.sleep(1000);
            WebElement welcomeTextElt = driver.findElement(By.tagName("h1"));
            String welcomeText = welcomeTextElt.getText();

            assert welcomeText.equals("Congratulations! You have successfully registered!") :
                    "Текст не совпадает! Получено: " + welcomeText;

            System.out.println("Тест пройден успешно! Текст совпадает.");

        } finally {
            Thread.sleep(1000);

        }

    }

}
