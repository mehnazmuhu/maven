package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actiomdemo {
	
@Test	
	public void actiondemo() throws InterruptedException {
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.browserstack.com/");
	Actions act =new Actions(driver);
	WebElement product=driver.findElement(By.id("product-menu-toggle"));
	act.moveToElement(product).build().perform();
	
	Thread.sleep(2000);
	
	WebElement auto=driver.findElement(By.xpath("//*[@id=\"product-menu-dropdown\"]/div/ul[1]/li[3]/a/div[2]/div[1]"));
	auto.click();
	
	
	
	
	
	}

}
