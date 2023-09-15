package Day11;

import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParamTest {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String appUrl) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(appUrl);
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	}
	
	@Test(priority=2)
	void testLogo()
	{
		try
		{
	boolean status	=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	Assert.assertEquals(status,true);
		}
	catch(Exception e)
		{
		Assert.fail();
		}
	}
	
	@Test(priority=1)
	void testHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM","Titles are not matched...");
		
	}
	
	@AfterClass
	void closeApp()
	{
	driver.quit();	
	}
}
