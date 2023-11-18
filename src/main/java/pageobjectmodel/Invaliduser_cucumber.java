package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Invaliduser_cucumber {
WebDriver driver;
	
	By user=By.id("username");
	By pass=By.id("password");
	By sub=By.id("submit");
	By invalidMessage=By.id("error");
	
	
	public Invaliduser_cucumber(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void setUsername(String usernameValue) {
		 driver.findElement(user).sendKeys(usernameValue);
	 }
    public void setPassword(String passwordValue) {
    	driver.findElement(pass).sendKeys(passwordValue);
    }
    public void clickSubmit() {
    	driver.findElement(sub).click();
    }
	
	By invalidmassege=By.xpath("//*[@id=\"error\"]");
	public String invalidMessage() {
		String s=driver.findElement(invalidMessage).getText();
		return s;
}
}

