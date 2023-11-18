package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.PropertiesfileReading;

import base.BaseUI;
import base.Browser_demo;

public class ScrollDemo extends BaseUI{

	@BeforeMethod
	public void excel() throws IOException {
		
		String website=PropertiesfileReading.firoza("browsertype");
		
		if(website.equalsIgnoreCase("chrome")) {
			setDriver(driver);
			driver=Browser_demo.getdriver();
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
		
		}
	@Test
	public void test() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element= driver.findElement(By.xpath("//footer[@id='site-footer']//span"));
		//to scroll only 500 pixel downwards
		js.executeScript("window.scrollBy(0,500)");
		//to scroll upto the element
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		js.executeScript("argument[0].click()",element);
	}
}
