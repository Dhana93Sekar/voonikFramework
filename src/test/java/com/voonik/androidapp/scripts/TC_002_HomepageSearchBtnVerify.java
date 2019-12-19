package com.voonik.androidapp.scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.voonik.androidapp.lib.BaseLibrary;
import com.voonik.androidapp.lib.ExcelLibrary;
import com.voonik.androidapp.pagerepo.LandingPage;
import com.voonik.androidapp.utils.MobileActionUtils;

public class TC_002_HomepageSearchBtnVerify extends BaseLibrary
{
	@Test
	public void VoonikHomePageTest()
	{
		LandingPage lp = new LandingPage(gv.driver);
		
		MobileActionUtils.click(gv.driver, lp.getSearchLink());
		Assert.assertEquals(lp.getSearchBoxText(gv.driver), "Search");
		MobileActionUtils.sendKeysAndClick(lp.getSearchTextBox(), "shoes");
		Assert.assertEquals(MobileActionUtils.getList(lp.getSearchResults()),ExcelLibrary.searchlist);
		
	}
}
