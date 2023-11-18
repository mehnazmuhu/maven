package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alertdemo {
	@Test
	public void alert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(3000);
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.dismiss();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		Alert a2=driver.switchTo().alert();
		a2.sendKeys("firoza");
		a2.accept();
		
	}

}
