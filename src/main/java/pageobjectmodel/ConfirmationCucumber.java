package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationCucumber {

	WebDriver driver;

	public ConfirmationCucumber(WebDriver driver) {
		
		this.driver = driver;
	}
	By successMessage=By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong");
	
	public String successMessage() {
		String s=driver.findElement(successMessage).getText();
		return s;
	}
	
	
}
