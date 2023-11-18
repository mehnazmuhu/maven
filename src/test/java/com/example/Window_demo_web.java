package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window_demo_web {
	@Test
	public void windowdemo() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.id("button1")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		List<String> windowslist=new ArrayList(windows);
		System.out.println(windowslist.size());
		
		driver.switchTo().window(windowslist.get(1));
		System.out.println(driver.getTitle());
	//	driver.switchTo().window(windowslist.get(0));
	//	System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement tech=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[1]/div/div/div/div[1]/div/h2"));
		System.out.println(tech.getText());
	}

}
