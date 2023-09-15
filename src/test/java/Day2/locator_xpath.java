package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_xpath {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); //use for maximize the browser window
		
		//open url
		
		driver.get("https://demo.opencart.com/");
		
		Thread.sleep(3000);
		
		driver.findElement((By.xpath("/html/body/main/div[2]/div/div/div[2]/div[1]/form/div/div[2]/div[1]/h4/a"))).click();
		
		//Printing the name on console
		Thread.sleep(3000);
		
		String product_name =driver.findElement((By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1"))).getText();
		
				System.out.println(product_name);
				
				driver.close();
}}
