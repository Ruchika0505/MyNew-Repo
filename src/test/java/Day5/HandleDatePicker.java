package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//Approach 1--- sendKeys()
		
		
		//driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("05/20/2020");  //mm/dd/yyyy
		
		
		//Approach 2
		
	String	year="2020";
	String	month="May";
	String	date ="5";
		
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		
		//selecting month and year
		
		while(true)
		{
	String m =	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
	String y= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
	
	if(m.equals(month) && y.equals(year))
	{
		break;
	}
	
	//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click(); //future date
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click(); //past date
	
	}
		//selecting date
		
	List <WebElement> allDates=	driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//td"));
	
	for(WebElement dt:allDates)
	{
		if(dt.getText().equals(date))
		{
			dt.click();
			break;
	}
	}
}}
