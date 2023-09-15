package Day10_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
 	
@BeforeClass
void login()
{
	System.out.println("This is login");
}

	@Test(priority=11)
void Search()
{
		System.out.println("This is Search");
}
	
	@AfterClass
void logout()
{
		
		System.out.println("This is logout");
}

}