package com.voonik.androidapp.init;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.voonik.androidapp.lib.GenericLibrary;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
/**
 * 
 * @author Dhanashekhar
 *
 */
public class GlobalVariables 
{
	public static AndroidDriver<AndroidElement> driver;
	public DesiredCapabilities capabilities;
	
//DesiredCapabilities Setup
//	public String port =GenericLibrary.getPropertyKeyValue(Constants.dcFile, "port");
//	public String deviceName = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "deviceName");
//	public String platformName = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "platformName");
//	public String platformVersion = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "platformVersion");
//	public String UDID = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "avd");
//	public String automationName = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "automationName");
//	public String appPackage = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "appPackage");
//	public String appActivity = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "appActivity");
	
	public String device =GenericLibrary.getPropertyKeyValue(Constants.dcFile, "device");
	public String app = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "app");
	public String project = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "project");
	public String os_version = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "os_version");
	public String build = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "build");
	public String name = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "name");
	public String appPackage = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "appPackage");
	public String appActivity = GenericLibrary.getPropertyKeyValue(Constants.dcFile, "appActivity");
}
