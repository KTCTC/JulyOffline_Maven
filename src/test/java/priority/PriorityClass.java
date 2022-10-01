package priority;

import org.testng.annotations.Test;

public class PriorityClass {
	@Test (priority = 2)
	public void verifyUserCanLoginWithValidCredentials() {
		System.out.println("verify UserCanLoginWithValidCredentioals");
		
	}

	@Test (priority = 1)
	public void verifyUserCanNotLoginWithInvalidUserNameAndValidPassword() {
		System.out.println("verifyUserCanNotLoginWithInvalidUserNameAndValidPassword");
	}
	
	@Test (priority = 3)
	public void verifyUserCanSendEmail()
	{
		System.out.println("verify User Can Send Email");
	}

		

}
