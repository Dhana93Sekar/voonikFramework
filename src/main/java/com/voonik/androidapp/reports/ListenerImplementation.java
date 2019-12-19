package com.voonik.androidapp.reports;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.voonik.androidapp.init.Constants;
import com.voonik.androidapp.lib.BaseLibrary;
import com.voonik.androidapp.lib.GenericLibrary;
import com.voonik.androidapp.utils.MobileActionUtils;

public class ListenerImplementation implements ITestListener 
{
	@Override
	public void onStart(ITestContext context)
	{
		ExtentReportManager.report(context);
		ExtentReportManager.testlog.log(Status.INFO, context.getName()+"suite is started");
	//	GenericLibrary.setPropertyKeyValue(Constants.dcFile, "UDID", GenericLibrary.executeBatchCommmand("adb devices"));
	//	GenericLibrary.executeBatchCommmand("adb logcat > D:\\Maven\\MavenPractise\\voonikFramework\\logs\\logcat.logs");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		ExtentReportManager.testlog.log(Status.FAIL, result.getName()+" failed");
		System.out.println("Test Execution failed"+result.FAILURE+result.getName());
		try {
			String dest = MobileActionUtils.captureScreenshot(BaseLibrary.gv.driver, result.getName());
			ExtentReportManager.testlog.addScreenCaptureFromPath(dest+".png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ExtentReportManager.testlog.log(Status.SKIP, result.getName()+" is skipped");
		System.out.println("Test Skipped"+result.SKIP+result.getName()+" is skipped");
	}

	@Override
	public void onTestStart(ITestResult result) {
		ExtentReportManager.testlog.log(Status.INFO, "Test Started Succesfully "+result.getName()+" is started");
		System.out.println("Test Started"+result.STARTED+result.getName()+" is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ExtentReportManager.testlog.log(Status.PASS, "Test Passed"+result.getName()+" is success");
		System.out.println("onTestSuccess"+result.SUCCESS+result.getName()+" is success");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		ExtentReportManager.report.flush();
		ExtentReportManager.testlog.log(Status.INFO, context.getName()+" Suite is Completed");
	}

}
