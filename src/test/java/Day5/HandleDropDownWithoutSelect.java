package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropDownWithoutSelect {
	
	public static void main(String[] args) {


	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
	
	List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));

	//find the total no of element
	
	System.out.println("Total no of options " +options.size());
	
	//Print all the options on dropdown
	
	for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
	}
	
	//selecting options from dropdown
//	for(int i=0;i<options.size();i++)
//	{
//	String op= options.get(i).getText()
//		if(op.equals("Java"))
//		{
//				options.get(i).click();
//				break;
//		}
//	}
	
	//Selecting multiple options
	
//	for(int i=0;i<options.size();i++)
//	{
//		String op =options.get(i).getText();
//		if(op.equals("Java")||op.equals("Python")||op.equals("C#"))
//		{
//			options.get(i).click();
//		}
//	}
	
	for(WebElement op:options)
	{
		String Text= op.getText();
		if(Text.equals("Java")||Text.equals("Python")||Text.equals("C#"))
		{
			op.click();
		}
	}
	
	
}}
