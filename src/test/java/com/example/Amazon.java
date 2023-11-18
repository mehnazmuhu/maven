package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void testamazon() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement account=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		Actions a=new Actions(driver);
		a.moveToElement(account).build().perform();
		driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[3]/span")).click();
	}

}


