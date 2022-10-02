package screencapture;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureClass {

	@Test
	public void captureScreen() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/webtables");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File outFile = ts.getScreenshotAs(OutputType.FILE);
		File img = new File(System.getProperty("user.dir") + "\\abc.png");

		FileUtils.copyFile(outFile, img);

	}

}
