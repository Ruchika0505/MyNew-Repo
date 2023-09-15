package Day11;


import org.testng.annotations.*;

public class AnnotationDemo1 {

	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout......");
	}
	@BeforeMethod
	void login()
	{
		System.out.println("This is login......");
	}
	@Test(priority=1)
	void Search()
	{
		System.out.println("This is Search.....");
		
	}

	@Test(priority=2)
void AdvancedSearch()
{
		System.out.println("This is Advanced Search.....");
}

}
