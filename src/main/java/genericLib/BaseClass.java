package genericLib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public PropertyFile p=new PropertyFile();
	public WebDriverUtilits utilits=new WebDriverUtilits();
	
	@BeforeMethod
	public void openapp() throws FileNotFoundException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getData("url"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeapp(ITestResult t) throws IOException
	{
		int ststus = t.getStatus();
		String name = t.getName();
		if(ststus==2)
		{
			photo ph=new photo();
			ph.getPhoto(driver, name);		
		}
		driver.quit();
	}
}
