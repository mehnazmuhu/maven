package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_demo_web {
	@Test
	public void alertdemo() {
		
		WebDriver driver=new ChromeDriver();
	//	driver.get("https://www.google.com/");
		driver .get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("confirmalertbox")).click();
	
		//a.accept is okay
		//a.accept();
		//a.dismiss is cancel
		driver.findElement(By.name("promptalertbox1234")).click();
		Alert a=driver.switchTo().alert();
		a.sendKeys("yes");
		a.accept();
		
	}

}
