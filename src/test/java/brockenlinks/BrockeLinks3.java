package brockenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrockeLinks3 {

	public static void main(String[] args) throws IOException {
		String baseURL = "https://demoqa.com/";
		String actLink;

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://demoqa.com/links");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("No of Links on Page = "+allLinks.size());
		
		for (WebElement each:allLinks)
		{
			String href = each.getAttribute("href");
			
			if (href!=null && href.contains("https"))
			{
				actLink = each.getAttribute("href");
			}
			
			else
			{
				actLink = baseURL+ each.getAttribute("id");
			}
			
			System.out.println(actLink);
		}

	}

}
