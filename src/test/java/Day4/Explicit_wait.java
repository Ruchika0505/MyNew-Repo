package Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	
	
	//Declare & usage
	
	//Declare
	
	WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(30));
			
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	//usage
	
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	
	WebElement username = driver.findElement(By.name("username"));
	
	username.sendKeys("Admin");
		
	
	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
	WebElement pw=	driver.findElement(By.name("password"));
		pw.sendKeys("admin123");


}
	
}
