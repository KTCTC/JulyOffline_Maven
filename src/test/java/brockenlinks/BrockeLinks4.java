package brockenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrockeLinks4 {

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
			printStatusCodeOfLink(actLink);
		}

	}
	
	public static void printStatusCodeOfLink(String link)
	{
		HttpURLConnection http;
		try {
			URL url = new URL(link);
			URLConnection urlConn = url.openConnection();
			http = (HttpURLConnection)urlConn;
			
			http.setConnectTimeout(15000);
			
			http.connect();
			int resCode = http.getResponseCode();
			
			String resMsg = http.getResponseMessage();
			System.out.println(resCode);
			System.out.println(resMsg);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
