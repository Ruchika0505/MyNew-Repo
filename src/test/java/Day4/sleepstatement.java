package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sleepstatement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000); //thread sleep statement(java)
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
