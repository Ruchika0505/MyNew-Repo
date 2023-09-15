package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mercurylogin {

	WebDriver driver;
@BeforeClass	
void open_browser()
{
	
	 driver =new ChromeDriver();
}

@Test
void Open_URL()
{
	driver.get("https://demo.guru99.com/test/newtours/");
}	
@Test
	void enter_Data() throws InterruptedException
	{
		
	driver.findElement(By.name("userName")).sendKeys("mercury");
     driver.findElement(By.name("password")).sendKeys("mercury");
     driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

    @Test
	void Capture_home_page() throws InterruptedException 
	{
    	try
    	{
   String title = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']")).getText();
   Assert.assertEquals(true,title.contains("Login"));
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }

@AfterClass
void tear_down()
{

driver.close();

}	


}

