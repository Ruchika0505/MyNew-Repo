package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//handle single check-box
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//How many total no. of elements
		
	List<WebElement> checkboxes =driver.findElements(By.xpath("//*[@class='form-check-input'][@type='checkbox']"));
		System.out.println("The total no of checkboxes are :" +checkboxes.size());
		
		//how to select all the check-boxes
		
//		for(int i=0;i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//			
//		}
		
		//for each loop
		
//		for(WebElement chkb:checkboxes)
//		{
//			chkb.click();
//		}
		
		
//		//Select last two check-boxes
//		
//		for(int i=5;i<checkboxes.size();i++)
//			{
//				checkboxes.get(i).click();
//				
//			}
		
		//select first three check-boxes
		
//		for(int i=0;i<3;i++)
//		{
//			checkboxes.get(i).click();
//			
//		}
		
		//unchecked or clear check-boxes
		
//		for(int i=0;i<3;i++)
//			{
//				checkboxes.get(i).click();
//				
//			}
		
		//Thread.sleep(5000);
		
//		for(int i=0;i<checkboxes.size();i++)
//		{
//			if(checkboxes.get(i).isSelected())
//			{
//			checkboxes.get(i).click();
//			}
		
		//}
		
		for(WebElement chkb:checkboxes)
		{
			if(!(chkb.isSelected()))
			{
				chkb.click();
			}
			
		}
			
		}
}
