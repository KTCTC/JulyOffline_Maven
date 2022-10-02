package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationClass {
	
	@Test (dataProvider = "userNames", enabled = false)
	public void addNerUserInSystem(String name)
	{
		System.out.println(name);
	}
	
	
	@DataProvider (name = "userNames")
	public String[] getData()
	{
		
		String[] str = {"Amit", "Sandip", "Ajit"};
		
		return str;
		
	}
	
	@Test (dataProvider =  "credentials")
	public void verifyUserCanLoginToSystemWithDeffenertUserRoles(String uname, String pass)
	{
		System.out.println(uname);
		System.out.println(pass);
		
	}
	
	
	@DataProvider (name = "credentials")
	public String[][] getCredentials()
	{
		String [][]arr = {{"Amit","Amit123"},{"Sandip","Sandip999"}};
		return arr;
	}

}
