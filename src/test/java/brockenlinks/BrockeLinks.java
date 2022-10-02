package brockenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class BrockeLinks {

	public static void main(String[] args) throws IOException {
String link = "https://demoqa.com/links";
		
		URL url = new URL(link);
		URLConnection urlConn = url.openConnection();
		HttpURLConnection http = (HttpURLConnection)urlConn;
		
		http.setConnectTimeout(15000);
		
		http.connect();
		
		int resCode = http.getResponseCode();
		
		String resMsg = http.getResponseMessage();
		
		System.out.println(resCode);
		System.out.println(resMsg);

	}

}
