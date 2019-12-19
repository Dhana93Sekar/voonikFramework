package com.voonik.androidapp.lib;

import java.util.*;

public class ExcelLibrary
{
	public static ArrayList<String> searchlist,priceList,menMenu,womenMenu;
	public static String filterName = "Discount";
	public static String filterOption = "70% and above";
	
	public static List<String> getsearchList()
	{
		searchlist = new ArrayList<String>();
		searchlist.add("CATEGORY");
		searchlist.add("men chappals");
		searchlist.add("ethnic suits");
		searchlist.add("men nehru jackets");
		searchlist.add("men sandals and floaters");
		return searchlist;
	}
		
	public static List<String> getpriceList()
	{
		priceList = new ArrayList<String>();
		priceList.add("Rs 1549");
		return searchlist;
	}	
	
	public static List<String> getMensCategory()
	{
		menMenu  = new ArrayList<String>();
		menMenu.add("T-shirts");
		menMenu.add("Bottomwear");
		menMenu.add("Footwear");
		menMenu.add("Shirts");
		return menMenu;
	}
	
	public static List<String> getWomensCategory()
	{
		womenMenu  = new ArrayList<String>();
		womenMenu.add("Kurtis");
		womenMenu.add("Tops & Tunics");
		womenMenu.add("Western Wear");
		womenMenu.add("Denims");
		return womenMenu;
	}
			
}
