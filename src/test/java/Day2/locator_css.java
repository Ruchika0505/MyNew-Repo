package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_css {

	public static void main(String[] args) {
		

			ChromeDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize(); //use for maximize the browser window
			
			//open url
			driver.get("https://demo.nopcommerce.com/");
			
			//1 tag and id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
			
//			driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
//			driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();

			//2 tag and class
			
			//driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("MacBook");
//			driver.findElement(By.cssSelector(".search-box-text ")).sendKeys("MacBook");
//	        driver.findElement(By.className("button-1")).click();
	        
	        //3 tag and attribute
			
//					driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("MacBook");
//					 driver.findElement(By.className("button-1")).click();
					 
			 //4 tag,class and attribute
					 			 
			driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");
		driver.findElement(By.className("button-1")).click();
					 
	        driver.close();
	}
}
