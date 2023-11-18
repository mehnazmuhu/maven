package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.BaseUI;

public class ExtendReport {
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	
   public static ExtentReports getReportInstance() {
	   extent= new ExtentReports();
	   String repnmae="TestReport"+BaseUI.timestamp +"html";
	   reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//report//"+"repname");
		extent.attachReporter(reporter);	   
		extent.setSystemInfo("OS",System.getProperty("os.name"));
		extent.setSystemInfo("User Name","Firoza");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Application name","My contact form");
		extent.setSystemInfo("Application Version","1.0");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Contact Form-Functional Test");
		reporter.config().setTheme(Theme.DARK);
		return extent;
   }
}
