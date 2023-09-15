package POM_DEMO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//Using Page Factory(Page Object class --login)
public class LoginPage2 {

	
	WebDriver driver;
	
	//constructors
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	//locators
	
		@FindBy(xpath="//img[@alt='company-branding']")
		WebElement img_logo;
		
//		@FindBy(how=How.XPATH,using="//img[@alt='company-branding']")
//		WebElement img_logo;
	
		@FindBy(name="username")
		WebElement txt_username;
		
		
		@FindBy(name="password")
		WebElement txt_password;
	
		By btn_submit_loc=By.xpath("");
	
		@FindBy(xpath="//button[@type='submit']")
		WebElement btn_submit;
		
		
//		@FindBy(tagName="a")
//		List <WebElement>links;
		
	
	
	//actions
	
		
		public void setusername(String username) 
		{
			txt_username.sendKeys(username);
		}
		
		public void setpassword(String password)
		{
			txt_password.sendKeys(password);
		}
		
		public void clickSubmit()
		{
			btn_submit.click();
		}
		
		public boolean checklogoPresence()
		{
			boolean	status=img_logo.isDisplayed();
			return status;
		}
}
