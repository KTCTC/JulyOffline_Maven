package fileupload;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUploadClass {
	WebDriver driver;
	@BeforeClass
	public void beforeClassMethod() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://demo.guru99.com/test/upload/");
	}

	@Test
	public void verifyFileCanBeUploadedSuccessfully() {
		
		
		driver.findElement(By.id("uploadfile_0")).sendKeys(System.getProperty("user.dir")+"\\env.properties");
		
		driver.findElement(By.id("terms")).click();
		
		driver.findElement(By.id("submitbutton")).click();
		
		WebDriverWait wt = new WebDriverWait(driver, 8);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(),'1 file')]"))));
		
		String msg = driver.findElement(By.id("res")).getText();
		System.out.println(msg);
		System.out.println("message has been printed......");
		String ss = msg.replace("\n", " ");
		
		Assert.assertEquals(ss, "1 file has been successfully uploaded88");
		
		
	}
	
	@AfterMethod
	public void afterTestMethod(ITestResult result) throws IOException
	{
		
		if (result.getStatus()==ITestResult.FAILURE)
		{
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		File outFile = ts.getScreenshotAs(OutputType.FILE);
		File img = new File(System.getProperty("user.dir") + "\\"+result.getName()+".png");

		FileUtils.copyFile(outFile, img);
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			System.out.println("Excellent test case is passed");
		}
		else
		{System.out.println("O ho test case is skipped");
			
		}
		
	}
	

}
