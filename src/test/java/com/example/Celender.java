package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Celender {
	@Test
	public void celender() {
		String month="February 2024";
		String day="15";
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com");
		WebElement departure=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[4]/div/div[1]/div/input"));
		departure.click();
		System.out.println(driver.getTitle());
		
		while(true) {
			String text=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div")).getText();
			if(text.equals(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/button")).click();
			}
		}

		List<WebElement>dates=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[5]/div"));
	int totalnode=dates.size();
		
	for(int i=0;i<totalnode;i++){
	String	d=dates.get(i).getText();
		if(d.equals(day)) {
			dates.get(i).click();
			break;
		}
		
	}
	String Returnmonth="April 2024";
	String Returnday="20";
	
	WebElement Return=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/div/div[4]/div/div[2]/div/input"));
	Return.click();
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/button")).click();
	
	while(true){
		String text2=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div")).getText();
		if(text2.equals(Returnmonth)) {
	     break;
	}
	else {
	
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/button")).click();
	}
	}
	List<WebElement>Date=driver.findElements(By.xpath("/html/body/div[5]/div[2]/div[1]/table/tbody/tr[3]/td[7]/div"));
	int totalday=Date.size();
	
	for(int i=0;i<totalday;i++) {
		
	String da=Date.get(i).getText();
	if(da.equals(Returnday)) {
		Date.get(i).click();
		break;
	}
}
	
	}
}
