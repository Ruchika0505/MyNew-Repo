package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_1 {

	public static void main(String[] args) throws InterruptedException {
		//id,name,linkText,partiallinkText
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); //use for maximize the browser window
		
		//open url
		driver.get("http://www.automationpractice.pl/index.php");
		
		//using locator id
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		
		
		//using locator name
		driver.findElement(By.name("submit_search")).click();
		
		//using locator linkText
		//driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		
		//using locator partiallinkText
		
		driver.findElement(By.partialLinkText("Faded Short")).click();
		
		Thread.sleep(5000); //wait
		
		System.out.println("code executed successfully");
		
		driver.close();
		
		
	}
}
