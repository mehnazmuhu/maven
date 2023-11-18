package com.example;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test_find_element {
	@Test
	public void webtest() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sample Forms")).click();
		
		WebElement username=driver.findElement(By.id("user"));
		username.sendKeys("firoza");
		
		//driver.findElement(By.id("user")).sendKeys("firoza");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("akter");
		
		driver.findElement(By.name("email_to[]")).click();
		
		WebElement subject =driver.findElement(By.id("subject"));
	    subject.sendKeys("manager");
	    
		WebElement email =driver.findElement(By.id("email"));
		email.sendKeys("akterfs@yahoo.com");
		
		WebElement textBox=driver.findElement(By.id("q1"));
		textBox.sendKeys("Bangladesh");
		WebElement multiline=driver.findElement(By.id("q2"));
		multiline.sendKeys("I love my country");
		
	WebElement dropdown =driver.findElement(By.id("q3"));
	Select s = new Select(dropdown);
	s.selectByVisibleText("Third Option");
	
	WebElement radiobuttom=driver.findElement(By.xpath("//input[@value='Third Option']"));
	radiobuttom.click();
	
	WebElement checkbox=driver.findElement(By.id("q5"));
	checkbox.click();
	 
	 WebElement checkmulti=driver.findElement(By.xpath("//input[@value='Second Check Box']"));
	 checkmulti.click();
	 
	 WebElement checkboxmulti=driver.findElement(By.xpath("//input[@value='Fifth Check Box']"));
	 checkboxmulti.click();
	 
	 WebElement date=driver.findElement(By.id("q7"));
	 date.sendKeys("16/08/2023");
	 
	 WebElement usstate=driver.findElement(By.id("q8"));
	 Select s1=new Select(usstate);
	 s1.selectByVisibleText("VA");
	 
	 List<WebElement> checkboxlist=driver.findElements(By.xpath("//input[@type='checkbox']"));
	 System.out.println("Total number of check box is " +checkboxlist.size());
	for(int i=0;i<checkboxlist.size();i++) {
		checkboxlist.get(i);
	}
	List<WebElement>radiobuttomlist=driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println("Total number of radio button is "+radiobuttomlist.size());
	for(int i=0;i<radiobuttomlist.size();i++) {
		radiobuttomlist.get(i);
	}
	List<WebElement>textboxfield=driver.findElements(By.xpath("//input[@type='text']"));
	System.out.println("Total number of text box is "+textboxfield.size());
	for(int i=0;i<textboxfield.size();i++) {
		textboxfield.get(i);
	}
	WebElement country=driver.findElement(By.id("q9"));
	Select c=new Select(country);
	c.selectByVisibleText("United States of America ");
	
	WebElement canadian=driver.findElement(By.id("q10"));
	Select ca=new Select(canadian);
	ca.selectByVisibleText("Ontario");
	
	WebElement definedname=driver.findElement(By.name("q11_title"));
	Select n=new Select(definedname);
	n.selectByIndex(1);
	
	WebElement First=driver.findElement(By.name("q11_first"));
	First.sendKeys("Firoza");
	
	WebElement last=driver.findElement(By.name("q11_last"));
	last.sendKeys("Akter");
	
	WebElement month=driver.findElement(By.name("q12_month"));
	Select d=new Select(month);
	d.selectByIndex(2);

	WebElement defineddate=driver.findElement(By.name("q12_day"));
     Select da=new Select(defineddate);
     da.selectByVisibleText("16");

	WebElement year=driver.findElement(By.name("q12_year"));
	Select y=new Select(year);
	y.selectByVisibleText("1999");
	
	List<WebElement> link=driver.findElements(By.tagName("a"));
	System.out.println("Total number of links is"+link.size());
	
	List<WebElement> links=driver.findElements(By.xpath("//*[@id='left_col_top']/ul/li/a"));
	System.out.println("Total number of links is "+links.size());
	
	for (int i = 0; i < links.size(); i++) {
  List<WebElement> links2=driver.findElements(By.xpath("//*[@id='left_col_top']//ul["+i+"]//li//a"));
	
  for (int j = 1; j < links2.size(); j++) {
	driver.findElement(By.xpath("//*[@id='left_col_top']//ul["+i+"]//li["+j+"]/a")).click();
	 
	TakesScreenshot src=(TakesScreenshot) driver;
     File screen =src.getScreenshotAs(OutputType.FILE);
    //FileUtils.copyFile(screen, new File("/Users/sharminahmed/eclipse-workspace/MavenDemo/screenshot/mycontact.jpg"));
    FileUtils.copyFile(screen,new File("/Users/sharminahmed/eclipse-workspace/MavenDemo/screenshots/aa["+i+"]["+j+"].jpg"));
	}

	 }
	}
}
       


