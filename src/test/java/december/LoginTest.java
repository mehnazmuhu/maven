package december;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.PropertiesfileReading;

import base.Browser_demo;
import pageobjectmodel.LogDec;
import pageobjectmodel.Securearea_dec;
import testcase.Browsertest;

public class LoginTest {
	
WebDriver driver;
	@BeforeTest
		public void validlogin() throws IOException {
		
		String website=PropertiesfileReading.firoza("browsertype");
		
		if(website.equalsIgnoreCase("chrome")) {
			
			driver=Browser_demo.getdriver();
			driver.get("https://the-internet.herokuapp.com/login");
		}	
		}
	@Test
		public void logintest() {
		LogDec ld=new LogDec(driver);
		ld.setUsername("tomsmith");
		ld.setpassword("SuperSecretPassword!");
		ld.setLog();
		
		String expectedtext=" You logged into a secure area!";
		Securearea_dec sd =new Securearea_dec(driver);
		assertEquals(sd.secureMessage(),expectedtext);
		/*WebElement ele= driver.findElement(By.xpath("//*[@id=\"flash\"]"));
		String s=ele.getText();
		System.out.println(s);
		
		Assert.assertEquals("You logged into a secure area!",ele.getText());
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a/i")).click();*/
		
		}
	
	
	}





