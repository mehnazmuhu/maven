package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import base.BaseUI;

public class Pagefactory extends BaseUI  {

	WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement paasword;
	@FindBy(id="submit")
	private WebElement submit;
	@FindBy(id="error")
	private WebElement error;
	  
	public Pagefactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setUsername(String usernameValue) {
		username.sendKeys(usernameValue);
		logger.log(Status.INFO,"Entered username");
	}
	public void setPassword(String passwordValue) {
		paasword.sendKeys(passwordValue);
		logger.log(Status.INFO,"Entered password");
	}
	public void clicksumit() {
		submit.click();
		logger.log(Status.INFO,"Clicked on submit buttom");
		
	}
	public String getErrormassege() {
		return error.getText();
	}
	
	
	
}
