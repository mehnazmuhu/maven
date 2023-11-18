package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window2 {
	@Test
	public void alert() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver .findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
		
	Set<String>window=driver.getWindowHandles();
		List<String>windows=new ArrayList<>(window);
		
		System.out.println(windows.size());
		driver.switchTo().window(windows.get(1));
		WebElement download=driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span"));
		download.click();
	}

}
