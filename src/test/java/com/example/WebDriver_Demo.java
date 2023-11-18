package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriver_Demo {
     @Test
	public void browser() {
    	 WebDriver  driver= new ChromeDriver();
    	//to open web page
    	 driver.get("https://www.google.com");
    	driver .navigate().to("https://www.amazon.com");
    	 //to maximize window
    	driver.manage().window().maximize();
    	
    	
    	//to minimize window
    	//driver.manage().window().minimize();
    	
    	//how to backward,forward,refresh
    	driver.navigate().back();
        driver.navigate().refresh();
    	driver.navigate().forward();
    	
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    
    	
	}
	
}
