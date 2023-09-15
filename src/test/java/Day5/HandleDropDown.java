package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
 WebElement	drpdwn =driver.findElement(By.name("country"));
		
		drpdwn.click();
		
		Select dp =new Select(drpdwn); //select class
	
		// Selecting option from DropDown
		
		//1st Method using text
		
	//	dp.selectByVisibleText("India");
		
		//2nd Method using value
		
	//	dp.selectByValue("4"); //India
		
		////3rd Method using Index
		
	//	dp.selectByIndex(3);
	
		
		//total no of options of drop down
		
	List <WebElement> options=dp.getOptions();
	System.out.println("The total no of options are :" +options.size());
	
	//Print options in console Window
	
//	for(int i=0;i<options.size();i++)
//	{
//		
//		System.out.println(options.get(i).getText());
//	}
	
	for(WebElement op:options)
	{
		System.out.println(op.getText());
	}
	
	}
}
