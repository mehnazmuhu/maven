package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseUI;

public class Excel_login extends BaseUI{
	WebDriver driver;
	By username=By.id("username");
	By password=By.id("password");
	By submit=By.id("submit");
	By error=By.id("error");
	
	public Excel_login(WebDriver driver) {
		this.driver=driver;
	}
	 
	public void setUsername(String usernameValue) {
		driver.findElement(username).sendKeys(usernameValue);
	}

	public void setPassword(String passwordValue) {
		driver.findElement(password).sendKeys(passwordValue);
	}
	public void clicksubmit() {
		driver.findElement(submit).click();
	}
	public String getErrorMassege() {
		return driver.findElement(error).getText();
	}
}
