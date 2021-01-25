package SeleniumImplementation;
import java.io.IOException;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/*import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.lowagie.text.List;

public class JETAirwaysBrokenLinks {

//Learning github broken links


//REVISION

	public static void main(String[] args) throws IOException {
		/*TrustManager[] trustAllCerts = new TrustManager[]{
				new X509TrustManager() {
				    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				        return null;
				    }
				    public void checkClientTrusted(
				        java.security.cert.X509Certificate[] certs, String authType) {
				    }
				    public void checkServerTrusted(
				        java.security.cert.X509Certificate[] certs, String authType) {
				    }
				}};

				   try {
				    SSLContext sc = SSLContext.getInstance("SSL");
				    sc.init(null, trustAllCerts, new java.security.SecureRandom());
				    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
				    } catch (Exception e) {
				    }*/
		System.setProperty("webdriver.chrome.driver","G:/study/chromedriver_win32/newDivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.jetairways.com/insolvencyproceedings/");
		List<WebElement> allPageLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links on Jet Airways site-"  + allPageLinks.size());
		for(int i=0;i<allPageLinks.size();i++){
			WebElement pageLink = allPageLinks.get(i);
			String pageURL = pageLink.getAttribute("href");
			int responseCode;
			URL link =new URL(pageURL);
			HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
			httpConn.connect();
			responseCode = httpConn.getResponseCode();
			if(responseCode>=400){
				System.out.println(responseCode + " - " + pageURL + " is a Broken Link ");
			}
			else{
				System.out.println(responseCode + " - " + pageURL + " is a Valid Link ");
			}
			
			
		}
		
		

	}

}
