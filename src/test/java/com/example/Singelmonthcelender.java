package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Singelmonthcelender {
	
	@Test
	public void month() {
		String month="February 2024";
		String day="10";
		
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
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr/td/div[contains(text(),"+day+")]")).click();
	}

}
