package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionInTestNG {
	
	String data;
	
	@Test
	public void B()
	{
		boolean flag = false;
		boolean flagCompose = false;
		
		Assert.assertFalse(flag);
		Assert.assertTrue(flag,"User profile Name is not displayed");
		Assert.assertTrue(flagCompose, "Compose button is not displayed");
		
		Assert.assertEquals(flag, true);
		System.out.println("B method");
		
	}
	
	@Test
	public void A()
	{
		float expCurrentPrice = 34.5f;
		
		Assert.assertNotEquals("1 file", "1 file");
		Assert.assertEquals("34.5", expCurrentPrice, "Current share price is not matching");
		
		String actMsg = "1 File uploaded Successfully";
		Assert.assertEquals(actMsg, "1 File uploaded Successfully.");
		
		//Assert.assertTrue(actMsg.equals("1 file uploaded"));
		
		System.out.println("A method");

	}
	@Test
	public void C()
	{
		Assert.assertNull(data);
		Assert.assertNotNull(data);
		System.out.println("C method");

	}

}
