import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class AutomatedLoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1/hms");
        
        Thread.sleep(1000);
        
        driver.manage().window().maximize();
        
        Thread.sleep(1000);
        
        WebElement loginButton = driver.findElement(By.id("login-button"));

        loginButton.click();

        Thread.sleep(2000);
        
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("shuvo");

        Thread.sleep(1000);
        
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("NewPassword@123");
        
        Thread.sleep(1000);

        WebElement loginButtonOnLoginPage = driver.findElement(By.id("loginButtonOnLoginPage"));
        loginButtonOnLoginPage.click();

        Thread.sleep(3000);
        
        System.out.println("Page title: " + driver.getTitle());
        
        driver.quit();
        
        System.out.println("Automated Login Test Successful!!!");
        
        
	}

}
