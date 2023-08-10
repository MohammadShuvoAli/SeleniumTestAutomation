import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class DynamicSearchTest {

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
        
        //Patient Records Search Check
        
        WebElement patientRecords = driver.findElement(By.id("patient-records-button"));

        patientRecords.click();

        Thread.sleep(2000);
        
        WebElement patientSearchInput = driver.findElement(By.id("searchInput"));
        patientSearchInput.sendKeys("Tom");
        Thread.sleep(2000);
        patientSearchInput.clear();
        
        patientSearchInput.sendKeys("mike");
        Thread.sleep(2000);
        patientSearchInput.clear();
        
        patientSearchInput.sendKeys("alex");
        Thread.sleep(2000);
        patientSearchInput.clear();
        
        //Appointment Search Test
        
        WebElement appointments = driver.findElement(By.id("appointments-button"));
        appointments.click();
        Thread.sleep(2000);

        WebElement appointmentSearchInput = driver.findElement(By.id("searchInput"));
        appointmentSearchInput.sendKeys("Tom");
        Thread.sleep(2000);
        appointmentSearchInput.clear();
        
        appointmentSearchInput.sendKeys("mike");
        Thread.sleep(2000);
        appointmentSearchInput.clear();
        
        appointmentSearchInput.sendKeys("alex");
        Thread.sleep(2000);
        appointmentSearchInput.clear();
        
        System.out.println("Page title: " + driver.getTitle());
        
        driver.quit();
        
        System.out.println("Automated Dynamic Search Test Successful!!!");
        
        
	}

}
