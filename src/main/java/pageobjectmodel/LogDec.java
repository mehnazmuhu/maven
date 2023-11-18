package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogDec {
	
	WebDriver driver;
     
	By username=By.id("username");
	By password=By.id("password");
	By login=By.xpath("//*[@id=\"login\"]/button/i");
	
	
	public  LogDec(WebDriver driver) {
		this.driver= driver;
	}
		public void setUsername(String usernameValue) {
		
			driver.findElement(username).sendKeys(usernameValue);
		}
		public void setpassword(String passwordValue) {
			driver.findElement(password).sendKeys(passwordValue);
		}
		public void setLog() {
			driver.findElement(login).click();
		}
	
	}

