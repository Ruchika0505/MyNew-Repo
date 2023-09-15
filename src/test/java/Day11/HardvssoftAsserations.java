package Day11;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvssoftAsserations {
  //@Test
	void hard_asseration()
	{
		
	  
	  System.out.println("Testing.......");
	  System.out.println("Testing.......");
	  System.out.println("Testing.......");
	  System.out.println("Testing.......");
	  
	 // Assert.assertEquals(1, 1); //pass
	  
	  Assert.assertEquals(1, 2); //fail
	  
	  System.out.println("Hard Asseration completed ");
	  Assert.assertEquals(1, 1); //pass
	  }
	
  
  
  @Test
	void soft_asseration()
	{
		
	  
	  System.out.println("Testing.......");
	  System.out.println("Testing.......");
	  System.out.println("Testing.......");
	  System.out.println("Testing.......");
	  
	 // Assert.assertEquals(1, 1); //pass
	  
	  SoftAssert sa =new SoftAssert();
	 sa.assertEquals(1, 2); //fail
	  
	  System.out.println("soft Asseration completed ");
	  sa.assertEquals(1, 1); //pass
	  
	  sa.assertAll(); //mandatory
	  }
}
