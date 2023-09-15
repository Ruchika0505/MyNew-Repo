package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_cmds {

public static void main(String[] args) throws InterruptedException  {
	
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); //use for maximize the browser window
		
		
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed
		
// WebElement	logo	= driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']"));
//	
//   System.out.println(logo.isDisplayed());
//   
	//isDisplayed and isEnabled
//   WebElement input_box	= driver.findElement(By.name("q"));
//  System.out.println("The element is displayed " +input_box.isDisplayed());
//  System.out.println("The element is enabled " + input_box.isEnabled());
  
  //isSelected
  
  System.out.println("Before Selection......");
  
 WebElement male_rd= driver.findElement(By.xpath("//input[@id='gender-male']"));
 WebElement female_rd= driver.findElement(By.xpath("//input[@id='gender-female']"));
  System.out.println( male_rd.isSelected()); //false
  System.out.println(female_rd.isSelected()); //false
  
  male_rd.click();
  
  System.out.println("After Selection......");
  
//  WebElement male_rd= driver.findElement(By.xpath("//input[@id='gender-male']"));
//  WebElement female_rd= driver.findElement(By.xpath("//input[@id='gender-female']"));
   
   System.out.println( male_rd.isSelected()); //true
   System.out.println(female_rd.isSelected()); //false
   
 driver.close();
	
}}
