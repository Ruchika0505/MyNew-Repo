package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class DataProviderDemo {
  
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="dp")
	void testLogin(String email,String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	String exp_title="nopCommerce demo store";
	String act_title=driver.getTitle();
	
	Assert.assertEquals(exp_title, act_title);
	
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
	@DataProvider(name="dp",indices= {0})
	String[][] loginData()
	{
		
		String[][] data= { {"merry@gmail.com","test123"},
				           {"abc@gmail.com","abc123"},
				           {"abc@gmail.com","test@123"},
				           {"John@gmail.com","test123"}
				          };
		
		return data;
		}
	}
	
	

