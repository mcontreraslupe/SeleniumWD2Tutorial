package BasicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://www.google.com";
		WebDriver driver;
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Shisho\\eclipse-workspace\\Libs\\selenium\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.get(baseURL);

	}

}
