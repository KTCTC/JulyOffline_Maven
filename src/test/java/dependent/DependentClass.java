package dependent;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependentClass {
	
	String data;
	@Test 
	public void B()
	{
		SoftAssert sAssert = new SoftAssert();
		
		boolean flag = false;
		boolean flagCompose = false;
		
		sAssert.assertFalse(flag);
		sAssert.assertTrue(flag,"User profile Name is not displayed");
		sAssert.assertTrue(flagCompose, "Compose button is not displayed");
		
		sAssert.assertEquals(flag, true);
		System.out.println("B method");
		sAssert.assertAll();
		System.out.println("Aafter assert All");
	}
	
	@Test (dependsOnMethods = {"B","C"})
	public void A()
	{
		SoftAssert sAssert = new SoftAssert();
		float expCurrentPrice = 34.5f;
		
		sAssert.assertNotEquals("1 file", "1 file");
		sAssert.assertEquals("34.5", expCurrentPrice, "Current share price is not matching");
		
		String actMsg = "1 File uploaded Successfully";
		sAssert.assertEquals(actMsg, "1 File uploaded Successfully.");
		
		//Assert.assertTrue(actMsg.equals("1 file uploaded"));
		
		System.out.println("A method");
		sAssert.assertAll();

	}
	@Test 
	public void C()
	{
		SoftAssert sAssert = new SoftAssert();
		sAssert.assertNull(data);
	//	sAssert.assertNotNull(data);
		System.out.println("C method");
		sAssert.assertAll();

	}

}
