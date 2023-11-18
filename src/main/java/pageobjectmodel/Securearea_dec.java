package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Securearea_dec {

	WebDriver driver;
	
	public  Securearea_dec(WebDriver driver) {
		this.driver=driver;
		
	}
	By secureMessage=By.xpath("");
	public String secureMessage() {
		String s=driver.findElement(secureMessage).getText();
		return null;
		
	}
}
