package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiwindow {
	@Test
	public void window() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		Set<String>window=driver.getWindowHandles();
		List<String>windowname=new ArrayList<>(window);
		
		System.out.println(windowname.size());
		driver.switchTo().window(windowname.get(1));
		
		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[1]/a")).click();
		Thread.sleep(2000);
				
		driver.switchTo().window(windowname.get(0));
		//we can as below
		//driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
	}

}
