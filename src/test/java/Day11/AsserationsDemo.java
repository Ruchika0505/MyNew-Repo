package Day11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserationsDemo {
 @Test
	void test()
	{
	 int x=20;
	 int y=25;
//	 if(x==y)
//	 {
//		 System.out.println("Test passed");
//	 }
//	 else 
//	 {
//		 System.out.println("Test failed"); 
//	 }
	 
	// Assert.assertEquals(x, y);
	// Assert.assertTrue(true);
	// Assert.assertTrue(false);

	//assert.assertEquals("actual","expected","description");
	 
	// Assert.assertEquals(x>y,true,"x is not greater than y");
	
	 String s1="abc";
	 String s2="abc";
	 //Assert.assertEquals(s1,s2,"s1 is not equals to s2"); //pass
	
	// Assert.assertEquals(s1,s2,"s1 is not equals to s2"); //fail
	// Assert.assertNotEquals(s1,s2);// fail
	
	 if(true)
	 {
		 Assert.assertTrue(true);
	
		 }
	 else 
		// Assert.assertTrue(false);
	 Assert.fail();
	}
	
}
