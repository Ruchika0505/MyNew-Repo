package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractionWithElementUsingJS {

	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
	//	WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.get("https://testautomationpractice.blogspot.com/");
				
				driver.manage().window().maximize();
				
			

	           // JavascriptExecutor js=(JavascriptExecutor) driver;  //type casting
	             JavascriptExecutor js=driver;
	             
	           
	             //Inputbox
	             
//	    WebElement  inputbox= driver.findElement(By.xpath("//input[@id='name']"));
//	    js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
//	             
//	             //RadioButton
//	    
//	   WebElement male_rd= driver.findElement(By.id("male"));
//	 //  male_rd.click();
//	   js.executeScript("arguments[0].click();", male_rd);
//	   
	   //checkbox
	   
	   WebElement chkbox= driver.findElement(By.id("sunday"));
	   js.executeScript("arguments[0].click();", chkbox);
	   
	   //button
	   
	   WebElement button=driver.findElement(By.id("FSsubmit"));
	    js.executeScript("arguments[0].click();",button);
	   
	  //dropdown
	   
	   WebElement dd= driver.findElement(By.xpath("//*[@id=\"country\"]"));
	   js.executeScript("arguments[0].click();", dd);   

  // Use JavaScript Executor to select an option from the dropdown
  String optionValue = "canada"; // Change this to the desired option value
  String script = "arguments[0].value='" + optionValue + "';";
  
  driver.executeScript(script, dd);

  // Verify selection if needed
  String selectedOption = (String) js.executeScript("return arguments[0].value;", dd);
  System.out.println("Selected option is: " + selectedOption);
	    
	   
	}}
