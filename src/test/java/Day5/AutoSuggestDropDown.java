package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(3000);
		
	List <WebElement> options=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]//span"));
	
	// No of options
	
	
	System.out.println("The no of options :" +options.size());
	
	//printing the options on console
	
	for(int i=0;i<options.size();i++)
	{	

		System.out.println("The options are :" + options.get(i).getText());
	}
	
	//Select an option from list
	
	for(int i=0;i<options.size();i++)
	{	
	String text=options.get(i).getText();

	//System.out.println("The options are: " +text );
	
	if(text.equals("selenium ide"))
	{
		options.get(i).click();
		break;
	}
	}
	

	

	
	}
	
}
