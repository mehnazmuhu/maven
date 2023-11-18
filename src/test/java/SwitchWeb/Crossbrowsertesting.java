package SwitchWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Crossbrowsertesting {
	@Test
	public void crossbrower() {
		WebDriver driver ;
		Switch s= new Switch();
		
		driver=s.casedriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		//driver.navigate().forward();
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		WebElement el=driver.findElement(By.xpath("//*[@id=\"flash\"]"));
		System.out.println(el.getText());
		String pass=el.getText();
		
		if(pass.contains("You logged into a secure area!")) {
			System.out.println("print ture");
		}
		
	}

}
