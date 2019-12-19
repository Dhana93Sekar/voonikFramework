package com.voonik.androidapp.pagerepo;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WomenClothingPage 
{
	public AndroidDriver driver;
	public WomenClothingPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.mrvoonik.android:id/price")
	private List<MobileElement> price;
	/**
	 * @return the driver
	 */
	
	public AndroidDriver getDriver() {
		return driver;
	}

	/**
	 * @return the price
	 */
	public List<MobileElement> getPrice() {
		return price;
	}
}
