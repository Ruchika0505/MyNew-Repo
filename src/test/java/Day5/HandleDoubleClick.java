package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		
		WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
		f1.clear();
		f1.sendKeys("Welcome");
		
	WebElement	button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

	
	Actions act=new Actions(driver);
	
	act. doubleClick(button).perform(); //perform double click on button
	
	//validation
	
	
	WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
	
	//String copy text
	
	//String copiedtext=f2.getText(); //inner text---not work in this case
	String copiedtext=f2.getAttribute("value"); //this will work
	
	//System.out.println("The text in field2 is :" +copiedtext); 
	
	if(copiedtext.equals("Welcome"))
		System.out.println("Test passed");
	else
		System.out.println("Test Failed");
	
	}
}