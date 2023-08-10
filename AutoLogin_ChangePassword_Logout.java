import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class AutoLoginWithChangePassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver\\ChromeDriver\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1/hms");
        
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
        
        WebElement chnagePassword = driver.findElement(By.id("change-password-button"));

        chnagePassword.click();
        
        WebElement currentPassword = driver.findElement(By.name("current_password"));
        currentPassword.sendKeys("NewPassword@123");
        
        Thread.sleep(2000);
        
        WebElement newPasswordInput = driver.findElement(By.name("new_password"));
        newPasswordInput.sendKeys("NewPassword@123");

        Thread.sleep(2000);
        
        WebElement confirmPasswordInput = driver.findElement(By.name("confirm_password"));
        confirmPasswordInput.sendKeys("NewPassword@123");
        
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        
        Thread.sleep(3000);
        
        WebElement logoutButton = driver.findElement(By.id("logout-button"));

        logoutButton.click();
        
        Thread.sleep(3000);

        
        driver.quit();
        
        System.out.println("Test Successful!!!");
	}

}
