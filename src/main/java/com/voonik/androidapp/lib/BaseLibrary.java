package com.voonik.androidapp.lib;
/**
 * 
 * @author Dhanashekhar
 *
 */

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import com.voonik.androidapp.init.GlobalVariables;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseLibrary
{
	public static GlobalVariables gv = new GlobalVariables();
	public static String userName = "dhanasekar14";
	public static String accessKey = "gQCyaYpLncxdwbKPRNgE";
	
	@BeforeClass
	public void configFile() throws MalformedURLException
	{
		gv.capabilities = new DesiredCapabilities();
//		gv.capabilities.setCapability("automationName", gv.automationName);
//		gv.capabilities.setCapability("port", gv.port);
//		gv.capabilities.setCapability("deviceName", gv.deviceName);
//		gv.capabilities.setCapability("platformName", gv.platformName);
//		gv.capabilities.setCapability("platformVersion", gv.platformVersion);
//		gv.capabilities.setCapability("UDID", gv.UDID);
		gv.capabilities.setCapability("os_version", gv.os_version);
		gv.capabilities.setCapability("name", gv.name);
		gv.capabilities.setCapability("build",gv.build);
		gv.capabilities.setCapability("project",gv.project);
		gv.capabilities.setCapability("app",gv.app);
		gv.capabilities.setCapability("device",gv.device);
		gv.capabilities.setCapability("appPackage", gv.appPackage);
		gv.capabilities.setCapability("appActivity", gv.appActivity);
		gv.capabilities.setCapability("fullReset", false);
		gv.capabilities.setCapability("noReset", true);
		gv.capabilities.setCapability("autoGrantPermissions", true);
		gv.capabilities.setCapability("autoAcceptAlerts", true);
		gv.capabilities.setCapability("appWaitDuration", 20000);
		gv.capabilities.setCapability("avdLaunchTimeout", 30000);
		gv.capabilities.setCapability("avdReadyTimeout", 30000);
		gv.capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
		
		//System.out.println("http://127.0.0.1:"+gv.port+"/wd/hub");

	//	gv.driver = new AndroidDriver(new URL("http://127.0.0.1:"+gv.port+"/wd/hub"),gv.capabilities);
		gv.driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), gv.capabilities);
		gv.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
	}
}
