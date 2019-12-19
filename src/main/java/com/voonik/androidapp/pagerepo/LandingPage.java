package com.voonik.androidapp.pagerepo;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.voonik.androidapp.utils.MobileActionUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage 
{
	public AndroidDriver driver;
	public LandingPage(AndroidDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="com.mrvoonik.android:id/search_button_new")
	private MobileElement searchLink;
	
	@AndroidFindBy(id="com.mrvoonik.android:id/etSearch")
	private MobileElement searchTextBox;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Shop For Men']")
	private MobileElement shopForMenCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Shop For Women']")
	private MobileElement shopForWomenCategory;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Shop For Women']"
			+ "/following-sibling::android.view.ViewGroup//android.widget.TextView")
	private List<MobileElement> WomenCategoryMenu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Shop For Men']"
			+ "/following-sibling::android.view.ViewGroup//android.widget.TextView")
	private List<MobileElement> MenCategoryMenu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Bottomwear']")
	private MobileElement bottomwearlink;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='T-shirts']")
	private MobileElement tshirtsLink;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Footwear']")
	private MobileElement footwearLink;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Shirts']")
	private MobileElement shirtsLink;
	
	@AndroidFindBy(xpath="//android.support.v7.widget.RecyclerView[@resource-id='com.mrvoonik.android:id/suggestions_recycler']"
			+ "//android.widget.TextView[@resource-id='com.mrvoonik.android:id/text']")
	private List<MobileElement> searchResults;
	
	@AndroidFindBy(id="com.mrvoonik.android:id/filter_with_sort_icon")
	private MobileElement filterIcon;
	
	@AndroidFindBy(id="com.mrvoonik.android:id/sort_app_icon")
	private MobileElement sortIcon;
	
	@AndroidFindBy(id="com.mrvoonik.android:id/filter_name_text")
	private List<MobileElement> filterName;
	
	@AndroidFindBy(id="com.mrvoonik.android:id/filter_item_text")
	private List<MobileElement> filterOption;
	
	@AndroidFindBy(id="com.mrvoonik.android:id/apply_filter")
	private MobileElement applyFilterBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Kurtis']")
	private MobileElement kurtisLink;
	
	/**
	 * @return the kurtisLink
	 */
	public MobileElement getKurtisLink() {
		return kurtisLink;
	}

	/**
	 * @return the driver
	 */
	public AndroidDriver getDriver() {
		return driver;
	}

	/**
	 * @return the applyFilterBtn
	 */
	public MobileElement getApplyFilterBtn() {
		return applyFilterBtn;
	}

	/**
	 * @return the filterIcon
	 */
	public MobileElement getFilterIcon() {
		return filterIcon;
	}

	/**
	 * @return the sortIcon
	 */
	public MobileElement getSortIcon() {
		return sortIcon;
	}

	/**
	 * @return the filterName
	 */
	public List<MobileElement> getFilterName() {
		return filterName;
	}

	/**
	 * @return the filterOption
	 */
	public List<MobileElement> getFilterOption() {
		return filterOption;
	}
	
	/**
	 * @return the searchResults
	 */
	public List<MobileElement> getSearchResults() {
		return searchResults;
	}

	/**
	 * @return the searchTextBox
	 */
	public MobileElement getSearchTextBox() {
		return searchTextBox;
	}
	
	/**
	 * @return the shopForMenCategory
	 */
	public MobileElement getShopForMenCategory() {
		return shopForMenCategory;
	}
	
	/**
	 * @return the shopForWomenCategory
	 */
	public MobileElement getShopForWomenCategory() {
		return shopForWomenCategory;
	}
	
	/**
	 * @return the womenCategoryMenu
	 */
	public List<MobileElement> getWomenCategoryMenu() {
		return WomenCategoryMenu;
	}

	/**
	 * @return the menCategoryMenu
	 */
	public List<MobileElement> getMenCategoryMenu() {
		return MenCategoryMenu;
	}
	
	/**
	 * @return the searchLink
	 */
	public MobileElement getSearchLink() {
		return searchLink;
	}

	/**
	 * @return the bottomwearlink
	 */
	public MobileElement getBottomwearlink() {
		return bottomwearlink;
	}

	/**
	 * @return the tshirtsLink
	 */
	public MobileElement getTshirtsLink() {
		return tshirtsLink;
	}

	/**
	 * @return the footwearLink
	 */
	public MobileElement getFootwearLink() {
		return footwearLink;
	}

	/**
	 * @return the shirtsLink
	 */
	public MobileElement getShirtsLink() {
		return shirtsLink;
	}
	
	public String getThsirtsLinkText(AndroidDriver driver)
	{
		return MobileActionUtils.getText(tshirtsLink);
	}
	
	public String getShirtsLinkText(AndroidDriver driver)
	{
		return MobileActionUtils.getText(shirtsLink);
	}
	public String getFootwearLinkText(AndroidDriver driver)
	{
		return MobileActionUtils.getText(footwearLink);
	}
	
	public String getBottomwearlinkText(AndroidDriver driver)
	{
		return MobileActionUtils.getText(bottomwearlink);
	}
	
	public String getMensCategoryText(AndroidDriver driver)
	{
		return MobileActionUtils.getText(shopForMenCategory);
	}
	
	public String getWomensCategoryText(AndroidDriver driver)
	{
		return MobileActionUtils.getText(shopForWomenCategory);
	}
	
	public String getSearchBoxText(AndroidDriver driver)
	{
		return MobileActionUtils.getText(searchTextBox);
	}
}
