package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import base.BaseUI;

public class Listenerss implements ITestListener {
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	public void onStart(ITestContext testContext) {
		extent =ExtendReport.getReportInstance();
	}
	public void onTestStart(ITestResult result) {
		logger =extent.createTest(result.getName());
		BaseUI.logger=logger;
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS,MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		String Testname = result.getName();
		String filepath="/Users/sharminahmed/eclipse-workspace/MavenDemo/logscreenshot/"+Testname+BaseUI.timestamp+"passed.png";
		try {
			BaseUI.ScreenShot(filepath);
			logger.log(Status.PASS,"Snapshot attached :" +logger.addScreenCaptureFromPath(filepath));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
    @Override
	public void onTestFailure(ITestResult result) {
    	logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
    	
    	String Testname = result.getName();
		String filepath="/Users/sharminahmed/eclipse-workspace/MavenDemo/logscreenshot/"+Testname+BaseUI.timestamp+"failed.png";
		BaseUI.ScreenShot(filepath);
		logger.log(Status.FAIL,"Actual result "+logger.addScreenCaptureFromPath(filepath));
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger= extent.createTest(result.getName());
		logger.log(Status.SKIP,MarkupHelper.createLabel(result.getName(),ExtentColor.ORANGE));
		String Testname = result.getName();
		String filepath="/Users/sharminahmed/eclipse-workspace/MavenDemo/logscreenshot/"+Testname+BaseUI.timestamp+"skipped.png";
		BaseUI.logger=logger;
		
	}

	@Override
	public void onFinish(ITestContext context) {
	extent.flush();
	}
	}


