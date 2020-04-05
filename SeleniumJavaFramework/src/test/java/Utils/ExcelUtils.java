package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


 
public class ExcelUtils {
    public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://hdfcbank.com");
		driver.manage().window().maximize();
		String a= driver.getCurrentUrl();
		System.out.println(a);
		captureScreenshots("login");
		
		
		}
	
	public static void captureScreenshots(String filename) throws IOException
	{
	   
		
		TakesScreenshot objScreenshot = (TakesScreenshot)driver;
		File ObjSrcFile = objScreenshot.getScreenshotAs(OutputType.FILE);
	
		File ObjDestFile = new File("F:\\Selenium\\Snapshots"+ filename +".jpg") ;
		FileUtils.copyFile(ObjSrcFile, ObjDestFile);

 
	}
}