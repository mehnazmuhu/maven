package com.example;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcountry {
	String[]testdata;
	WebDriver driver;
@BeforeTest
public void beforetest() {
	driver=new ChromeDriver();
}
@Test
public void test() throws IOException {
	testdata=Excelcountry.exceldata();
	driver.get("https://www.mycontactform.com/");
	driver.findElement(By.linkText("Sample Forms")).click();
	driver.findElement(By.id("subject")).sendKeys(testdata[1]);
	
}
}
