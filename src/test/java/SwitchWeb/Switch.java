package SwitchWeb;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Switch {
	@Test
public WebDriver casedriver() {
	//	Scanner sc = new Scanner(System.in);
		//String browser= sc.next();
		String browser = null;
		WebDriver driver = null ;
		
		switch(browser) {
		case ("chrome"):
			driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
		 break;
		 
		case("firefox"):
			driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		break;
		
		case("edge"):
			driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		}
		return driver;
		
		
	}
	}
