package testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.example.PropertiesfileReading;

import base.BaseUI;
import base.Browser_demo;
import pageobjectmodel.ComformationPage;
import pageobjectmodel.Pagefactory;
import utilities.ExcelLogin;
@Listeners(utilities.Listenerss.class)
public class TestpageFactory extends BaseUI {
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
	public void test(String username,String password) {
		Pagefactory pf=new Pagefactory(driver);
		 ComformationPage cp =new  ComformationPage(driver);
		pf.setUsername(username);
		pf.setPassword(password);
		pf.clicksumit();
		pf.getErrormassege();
		
	
	if(username.equals("student")&&password.equals("Password123")) {
		Assert.assertEquals("Congratulations student. You successfully logged in!",cp.successMessage());
	}else if(username.equals("Incorrectuser")&&password.equals("Password123")) {
		Assert.assertEquals("Your username is invalid",pf.getErrormassege());
	}
	else if(username.equals("Incoorct username")&&password.equals("Incorrct password")){
		Assert.assertEquals("Your password is invalid",pf.getErrormassege());
	}
}
}
