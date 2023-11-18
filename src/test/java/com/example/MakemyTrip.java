package com.example;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakemyTrip {
	@Test
	public void makemytrip() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label")).click();
		Thread.sleep(2000);
	WebElement from=driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
	from.sendKeys("kol");
	Thread.sleep(2000);
	from.sendKeys(Keys.ARROW_DOWN);
	from.sendKeys(Keys.ENTER);
		
	
	//to
	Thread.sleep(2000);
	driver.findElement(By.id("toCity")).click();
	WebElement to=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
    to.sendKeys("Bang");
    Thread.sleep(2000);
	to.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
	to.sendKeys(Keys.ENTER);
	
	}
}