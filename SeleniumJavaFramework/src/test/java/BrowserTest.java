import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BrowserTest {
	

		@Test
		public void Run() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
	//	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win32\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();	
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
		dropdown.selectByVisibleText("Database Testing");  
	    
		}

} 
