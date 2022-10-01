package ktctc.FirstMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import annotations.TestBase;

public class FirstSeleniumClass extends TestBase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

	}
	@Test
	public void sample()
	{
		System.out.println("Sample test");
	}

}
