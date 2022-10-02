package dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotationClass2 {
	WebDriver driver;
	@BeforeClass
	public void beforeClassMethod() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/webtables");
	}

	@Test (dataProvider = "userData")
	public void verifyNewUserCanBeAddedInSystem(String fName,String lName, String email, String age,String salary, String dept) {
		
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("age")).sendKeys(age);
		driver.findElement(By.id("salary")).sendKeys(salary);
		driver.findElement(By.id("department")).sendKeys(dept);
		driver.findElement(By.id("submit")).click();

	}
	
	
	@DataProvider (name = "userData")
	public String[][] getUsersData()
	{
		String [][]arr = {{"Amit","Patil","amit@patil.com","23","34567","IT"},{"Sandip","Kulkarni","sandip@gmail.com","33","3434","Finance"}};
		return arr;
	}
}
