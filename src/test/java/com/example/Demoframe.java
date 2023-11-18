package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoframe {
	@Test
	public void frame() {
		WebDriver driver =new ChromeDriver();
		driver .get("https://jqueryui.com/");
		driver.findElement(By.linkText("Selectable")).click();
		WebElement fra=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fra);
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Sortable")).click();
		driver.switchTo().frame(fra);
	}

}
