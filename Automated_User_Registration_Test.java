import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomatedRegistrationTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://localhost/hms/views/register.php");

        driver.findElement(By.id("username")).sendKeys("testuser");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("Test@123");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("testuser@example.com");
        Thread.sleep(1000);
        driver.findElement(By.id("role")).sendKeys("doctor");
        Thread.sleep(1000);

        // Use JavaScript to set the date input value
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('date_of_birth').value = '2000-01-01'");

        driver.findElement(By.id("male")).click(); 
        driver.findElement(By.id("address")).sendKeys("123 Main St, City");
        driver.findElement(By.id("phone")).sendKeys("1234567890");

        driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(3000);

        driver.quit();
        
        System.out.println("Automated Registration Test Successful!!!");
    }
}
