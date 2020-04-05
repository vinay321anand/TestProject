package GetLinks;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetLinks {

	@Test
	public static void CountLinks() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://instagram.com");
		
		driver.manage().window().maximize();
		List <WebElement> list  = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
		
		
		
	}
	
	
}
