package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Islahiart {
	
	WebDriver driver;
	@BeforeMethod
public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.islahiart.com/");
	}
	/*@AfterClass
	public void close() {
		driver.close();
	}*/
	@Test(priority=1)
	public void selectwomens() throws InterruptedException {
		Actions act= new Actions(driver);
		WebElement Wocloth=driver.findElement(By.xpath("//*[@id=\"menu-item-37\"]/a"));
		act.moveToElement(Wocloth).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu-item-2072\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/ul/li[1]/div[2]/a/h2")).click();
		driver.findElement(By.xpath("//*[@id=\"ast-sticky-row-summary\"]/div[2]/form/table/tbody/tr[1]/td/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"ast-sticky-row-summary\"]/div[2]/form/table/tbody/tr[2]/td/div/div[2]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"ast-sticky-row-summary\"]/div[2]/form/div/div[2]/button")).click();
		}
	@Test(priority=2)
	@Parameter()
	public void InformationDetails() {
		//driver.findElement(By.xpath)
		
	}
}
