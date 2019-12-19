package com.voonik.androidapp.scripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.voonik.androidapp.lib.BaseLibrary;
import com.voonik.androidapp.lib.ExcelLibrary;
import com.voonik.androidapp.pagerepo.LandingPage;
import com.voonik.androidapp.reports.ExtentReportManager;
import com.voonik.androidapp.utils.MobileActionUtils;

public class TC_001_HomePageVerify extends BaseLibrary
{
	@Test
	public void homePageTest() throws InterruptedException 
	{
		Logger logger = LogManager.getLogger(TC_001_HomePageVerify.class);
		LandingPage lp = new LandingPage(gv.driver);
		Thread.sleep(5000);
		Assert.assertEquals(lp.getWomensCategoryText(gv.driver),"Shop For Women");
		logger.info("Shop for Women Category dispalyed");
		ExtentReportManager.testlog.log(Status.PASS, "Shop for Womens Category ids displayed");
		
//		MobileActionUtils.swipeUp(gv.driver, 545, 580);
//
//		Assert.assertEquals(MobileActionUtils.getList(lp.getWomenCategoryMenu()),ExcelLibrary.getWomensCategory());
//		logger.info("Women Category Menu's dispalyed");
//		ExtentReportManager.testlog.log(Status.PASS, "Shop for Womens Category ids displayed");
		
		MobileActionUtils.scrollToElement(gv.driver, "text", "T-shirts");
		logger.info("Scrolled succesfully to T-shirts menu");
		ExtentReportManager.testlog.log(Status.PASS, "Shop for Womens Category ids displayed");
		
		Assert.assertEquals(lp.getMensCategoryText(gv.driver),"Shop For Men");
		logger.info("Shop for Men Category dispalyed");
		ExtentReportManager.testlog.log(Status.PASS, "Shop for Womens Category ids displayed");
		
		Assert.assertEquals(MobileActionUtils.getList(lp.getMenCategoryMenu()),ExcelLibrary.getMensCategory());
		logger.info("Mens Category Menu's displayed");
		ExtentReportManager.testlog.log(Status.PASS, "Shop for Womens Category ids displayed");
	}
}
