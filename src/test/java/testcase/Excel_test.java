package testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.example.PropertiesfileReading;

import base.BaseUI;
import base.Browser_demo;
import pageobjectmodel.ComformationPage;
import pageobjectmodel.Excel_login;
import pageobjectmodel.Invalidpass;
import pageobjectmodel.Invaliduser;
import pageobjectmodel.Login;
import utilities.ExcelLogin;
@Listeners(utilities.Listenerss.class)
public class Excel_test extends BaseUI{
	WebDriver driver;
	String data[][];
	
	@BeforeMethod
	public void excel() throws IOException {
		
		String website=PropertiesfileReading.firoza("browsertype");
		
		if(website.equalsIgnoreCase("chrome")) {
			setDriver(driver);
			driver=Browser_demo.getdriver();
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
		
		}
	@DataProvider(name="testdata")
	public Object[][]exceltestdata() throws IOException{
		data=ExcelLogin.exceldata();
		return data;
	}
	@Test(dataProvider="testdata")
	public void test(String username, String password) throws InterruptedException {
		Excel_login elog=new Excel_login(driver);
		ComformationPage cp= new ComformationPage(driver);
		Invaliduser IU=new Invaliduser(driver);
		 Invalidpass ip =new  Invalidpass(driver);
		elog.setUsername(username);
		Thread.sleep(2000);
		elog.setPassword(password);
		Thread.sleep(2000);
		elog.clicksubmit();
		
		/*if(username.equals("firoza")||password.equals("Password123")) {
			Assert.assertEquals("Your username is invalid!", elog.getErrorMassege());
			
		}else if(password.equals("akter")) {
			Assert.assertEquals("Your password is invalid!", elog.getErrorMassege());
		}else {
			//Assert.assertEquals(driver.getCurrentUrl(), contains("/logged-in-successfully/"));
			SoftAssert softassert=new SoftAssert();
			softassert.assertTrue(driver.getCurrentUrl().contains("/logged-in-successfully/"));
		}*/
		if(username.equals("student")&&password.equals("Password123")) {
			Assert.assertEquals("Congratulations student. You successfully logged in!",cp.successMessage());
		}else if(username.equals("Incorrectuser")&&password.equals("Password123")) {
			Assert.assertEquals("Your username is invalid",IU.invalidMessage());
		}
		else if(username.equals("Incoorct username")&&password.equals("Incorrct password")){
			Assert.assertEquals("Your password is invalid", ip.invalidMessage());
		}
	}
	
	}
	
