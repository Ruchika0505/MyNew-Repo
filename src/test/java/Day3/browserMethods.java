package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserMethods {

public static void main(String[] args) throws InterruptedException  {
	
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); //use for maximize the browser window
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

}}
