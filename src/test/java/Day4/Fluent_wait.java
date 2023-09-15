package Day4;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluent_wait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		 // for its presence once every 5 seconds.
	
		//Declare
		
		FluentWait mywait= new FluentWait(driver);
		
		    mywait.withTimeout(Duration.ofSeconds(30));
		    mywait.pollingEvery(Duration.ofSeconds(5));
		    mywait.ignoring(NoSuchElementException.class);

	
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();

//usage
	
WebElement username=(WebElement)mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	
	username.sendKeys("Admin");	
		     
	
WebElement password=(WebElement)mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	
	password.sendKeys("admin123");	
		     
		     
		     
		     
 }}	  
		 
				
		
