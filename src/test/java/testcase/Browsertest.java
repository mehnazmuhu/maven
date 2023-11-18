package testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.util.PropertyFilePropertySource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.PropertiesfileReading;

import base.Browser_demo;
import pageobjectmodel.ComformationPage;
import pageobjectmodel.Invalidpass;
import pageobjectmodel.Invaliduser;
import pageobjectmodel.Login;

public class Browsertest {
	WebDriver driver;
	@BeforeMethod
	public void  browser() throws IOException {
		
		String website=PropertiesfileReading.firoza("browsertype");
		
		if(website.equalsIgnoreCase("chrome")) {
			
			driver=Browser_demo.getdriver();
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
		
		}
	}
	@Test(priority=0)
	public void testcase() {
		Login lin=new Login(driver);
		lin.setUsername("student");
		lin.setPassword("Password123");
		lin.clickSubmit();
		String expectedtext="Congratulations student. You successfully logged in!";
			
		ComformationPage cp=new ComformationPage(driver);
		assertEquals(cp.successMessage(),expectedtext);
	
		System.out.println(expectedtext);
	}		
	
   @Test(priority=1)
   public void invalid() {
	Invaliduser IU=new Invaliduser(driver);
	IU.setUsername("Student");
     IU.setPassword("Password123");
     IU.clickSubmit();
     
     String worngtext=("Your username is invalid!");
     
    assertEquals(IU.invalidMessage(),worngtext);
     
     System.out.println(worngtext);
}
  @Test(priority=2)
    public void invalid2() {
	Invaliduser ip=new Invaliduser(driver);
	ip.setUsername(" student");
	ip.setPassword(" Firoza");
	ip.clickSubmit();
	String worngtext=("Your username is invalid!"); 
	
	
	assertEquals(ip.invalidMessage(),worngtext);
	
	System.out.println(worngtext);
	
	
}
}

