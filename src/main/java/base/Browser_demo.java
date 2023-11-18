package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_demo {

	
	public static WebDriver getdriver() {
		//WebDriver driver;
		
		WebDriver driver=new ChromeDriver();
		
		return driver;
		
	}
	
	
}
