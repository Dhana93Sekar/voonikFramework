package com.voonik.androidapp.scripts;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserStackAndroid {

	public static String userName = "dhanasekar14";
	public static String accessKey = "gQCyaYpLncxdwbKPRNgE";

	public static void main(String args[]) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("device", "Samsung Galaxy S5");
		caps.setCapability("os_version", "4.4");
		caps.setCapability("project", "My First Project");
		caps.setCapability("build", "My First Build");
		caps.setCapability("name", "Bstack-[Java] Sample Test");
		caps.setCapability("app", "bs://9818e49c912c554b4dcee46608ea508c0dccb4b6");
		caps.setCapability("appPackage", "com.mrvoonik.android");
		caps.setCapability("appActivity", "com.mrvoonik.android.SplashScreen");


		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

		/* Write your Custom code here */
		Thread.sleep(5000);
		driver.quit();
	}
}


