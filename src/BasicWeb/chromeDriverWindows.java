package BasicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriverWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://www.google.com";
		WebDriver driver;
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hideki\\eclipse-workspace\\Libs\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		

	}

}
