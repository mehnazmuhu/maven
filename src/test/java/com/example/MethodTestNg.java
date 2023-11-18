package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodTestNg {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");
	}
		@Test
		public void login() {
			driver.findElement(By.id("username")).sendKeys("tomsmith");
			driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		}
	@Test
		public void login2() {
			driver.findElement(By.id("username")).sendKeys("Firoza");
			driver.findElement(By.id("password")).sendKeys("Akter!");
		}
	@Test
		public void login3() {
			driver.findElement(By.id("username")).sendKeys("Mehnaz");
			driver.findElement(By.id("password")).sendKeys("Ahmed");
		}
		@AfterMethod
		public void teardown() {
			driver.close();
			
		}
	}
	


