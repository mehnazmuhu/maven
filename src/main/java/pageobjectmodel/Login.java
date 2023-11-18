package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import base.BaseUI;

public class Login extends BaseUI{
	WebDriver driver;
	
	By username=By.id("username");
	By password=By.id("password");
	By submit=By.id("submit");
	
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}

	public void setUsername(String usernameValue) {
		driver.findElement(username).sendKeys(usernameValue);
		 logger.log(Status.INFO,"Entered username");
	}
	public void setPassword(String passwordValue) {
		driver.findElement(password).sendKeys(passwordValue);
		logger.log(Status.INFO,"Entered password");
	}
	public void clickSubmit(){
		driver.findElement(submit).click();
		logger.log(Status.INFO,"Clicked on submit button");
		
	}
	

	}


