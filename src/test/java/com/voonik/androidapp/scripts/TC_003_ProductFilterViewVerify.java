package com.voonik.androidapp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.voonik.androidapp.lib.BaseLibrary;
import com.voonik.androidapp.lib.ExcelLibrary;
import com.voonik.androidapp.pagerepo.LandingPage;
import com.voonik.androidapp.pagerepo.WomenClothingPage;
import com.voonik.androidapp.utils.MobileActionUtils;

public class TC_003_ProductFilterViewVerify extends BaseLibrary
{
	@Test
	public void ProductFilterTestAndVerify() throws InterruptedException
	{
		LandingPage lp = new LandingPage(gv.driver);
		MobileActionUtils.click(gv.driver, lp.getKurtisLink());
		WomenClothingPage wp = new WomenClothingPage(gv.driver);
		MobileActionUtils.click(gv.driver, lp.getFilterIcon());
		System.out.println(MobileActionUtils.getList(lp.getFilterName()));
		MobileActionUtils.setFilter(lp.getFilterName(), ExcelLibrary.filterName, lp.getFilterOption(), ExcelLibrary.filterOption);
		MobileActionUtils.click(gv.driver, lp.getApplyFilterBtn());
		Thread.sleep(3000);
		Assert.assertEquals(MobileActionUtils.getList(wp.getPrice()), ExcelLibrary.priceList);
			
	}
}
