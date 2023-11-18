package base;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utilities.DateUtil;

public class BaseUI {
	public static WebDriver driver;
	public static String timestamp=DateUtil.getTimestamp();
	
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	public static void setDriver (WebDriver driver) {
	BaseUI.driver = driver;	
		
	}
	public static void ScreenShot(String filepath) {
		try {
			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File(filepath));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	}
	


