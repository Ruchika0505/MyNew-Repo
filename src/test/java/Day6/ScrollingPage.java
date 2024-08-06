package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	
	//	WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
				
				driver.manage().window().maximize();
				
				JavascriptExecutor js= driver;
				
				//Scroll page down by pixel;
				
			js.executeScript("window.scrollBy(0,3000)","");	
		System.out.println(js.executeScript("return window.pageYOffset;", ""));
//		
		
		//Scroll down the page till the required element
		
	WebElement India=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
	js.executeScript("arguments[0].scrollIntoView();", India);
	System.out.println(js.executeScript("return window.pageYOffset;", ""));
	
	// Scroll down till end of the document
			
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;", ""));
				
		//Scroll back to initial position
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pageYOffset;", ""));
			
		//	driver.close();
				}	
}
