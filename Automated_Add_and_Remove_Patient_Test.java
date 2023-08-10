import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

public class AddPatientTest {

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
        
        WebElement patientRecords = driver.findElement(By.id("patient-records-button"));
        patientRecords.click();
        Thread.sleep(2000);
        
        WebElement addPatient = driver.findElement(By.id("add-patient"));
        addPatient.click();
        Thread.sleep(2000);
        
     // Fill in the patient information
        WebElement firstNameInput = driver.findElement(By.id("first_name"));
        firstNameInput.sendKeys("Umma Shara Ali");

        WebElement lastNameInput = driver.findElement(By.id("last_name"));
        lastNameInput.sendKeys("Setu");

        // Use JavaScript to set the date input value
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('date_of_birth').value = '2001-01-01'");

        WebElement genderMaleInput = driver.findElement(By.id("gender_female"));
        genderMaleInput.click();

        WebElement addressInput = driver.findElement(By.id("address"));
        addressInput.sendKeys("AIUB");

        WebElement phoneInput = driver.findElement(By.id("phone"));
        phoneInput.sendKeys("1234567890");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("ummasharaalisetu@gmail.com");
        
        Thread.sleep(3000);
        
        // Submit the form
        WebElement addButton = driver.findElement(By.name("submit"));
        addButton.click();
        
        Thread.sleep(1000);
        
        WebElement patientSearchInput = driver.findElement(By.id("searchInput"));
        patientSearchInput.sendKeys("Setu");
        Thread.sleep(5000);
        
        //patient-search-edit
        WebElement patientSearchEdit = driver.findElement(By.id("patient-search-edit"));
        patientSearchEdit.click();
        Thread.sleep(2000);
        
        WebElement deletePatient = driver.findElement(By.id("delete-patient"));
        deletePatient.click();
        Thread.sleep(2000);
        
        // Switch to the JavaScript alert
        Alert alert = driver.switchTo().alert();

        // Accept the alert (Click OK)
        alert.accept();
        
        Thread.sleep(1000);
        
        WebElement patientSearchInput2 = driver.findElement(By.id("searchInput"));
        patientSearchInput2.sendKeys("Setu");
        Thread.sleep(3000);
        patientSearchInput2.clear();
        
        System.out.println("Page title: " + driver.getTitle());
        
        driver.quit();
        
        System.out.println("Automated Dynamic Search Test Successful!!!");
	}

}
