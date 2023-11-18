package com.example;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.PropertiesfileReading;

import base.Browser_demo;
import pageobjectmodel.Invalidpass;

public class Invalid_test {
//	WebDriver driver;
/*	@BeforeTest
	public void  browser() throws IOException {
		
		String website=PropertiesfileReading.firoza("browsertype");
		
		if(website.equalsIgnoreCase("chrome")) {
			
			driver=Browser_demo.getdriver();
			
			driver.get("https://practicetestautomation.com/practice-test-login/");
		
}
}
	@Test
	public void invaledTest() {
	Invalid_login il=new Invalid_login(driver);
	il.setUsername("Student");
	il.setPassword("Firoza");
	il.clickSubmit();*/
	@Test
	public void invalid() throws InterruptedException {
/*WebDriver driver = new ChromeDriver();
//driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/login");
driver.navigate().to("https://www.google.com/");
driver.navigate().back();
driver.findElement(By.id("username")).sendKeys("tomsmith");
driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
Thread.sleep(3000);
String title= driver.getTitle();
System.out.println(title);
Assert.assertEquals("The Internet",title);*/
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/login");
		driver.navigate().to("https://www.google.com/");
	    driver.navigate().back();
	   // driver.navigate().forward();
	    
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
		
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"flash\"]"));
		String s=ele.getText();
		System.out.println(s);
		
		Assert.assertEquals("You logged into a secure area!",ele.getText());
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a/i")).click();	
}
}