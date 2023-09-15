package POM_DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//page Object class--login
public class LoginPage {

	WebDriver driver;
	
	//Constructors
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Locators
	
	By img_logo_loc=By.xpath("//img[@alt='company-branding']");
	By txt_username_loc= By.name("username");
	By txt_passwd_loc=	By.name("password");
	By btn_submit_loc=By.xpath("//button[@type='submit']");

	
	//Actions
	
	public void setusername(String username) 
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		driver.findElement(txt_passwd_loc).sendKeys(password);
	}
	
	public void clickSubmit()
	{
		driver.findElement(btn_submit_loc).click();
	}
	
	public boolean checklogoPresence()
	{
		boolean	status=driver.findElement(img_logo_loc).isDisplayed();
		return status;
	}
}
