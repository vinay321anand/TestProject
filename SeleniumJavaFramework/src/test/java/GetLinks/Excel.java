package GetLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Excel {
   
	@Test
	void Excelsheet() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	WebElement a = driver.findElement(By.name("q"));
	a.sendKeys("vinay");
	Thread.sleep(3000);

	
	Actions action = new Actions(driver);        
	action.SendKeys(Keys.ENTER);
	
	
	}
	
	
}	