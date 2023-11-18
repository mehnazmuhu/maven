package december;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Browser_initiate {

WebDriver driver;

WebDriver browser_init() throws IOException {
	
	//step1
	String fils=System.getProperty("user.dir")+"//src//test//resources//configuration//develop.properties";
	//step2
	FileInputStream file = new FileInputStream(fils);
	
	Properties p=new Properties();
	//step3
	p.load(file);
	//step4
	String s=p.getProperty("browserntype");

	switch(s){
	case"chrome":{
		//System.setProperty("Webdriver.chrome.driver",p.getProperty("chromepath"));
		driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
	}
		
	}
	return driver;

	
}

}
