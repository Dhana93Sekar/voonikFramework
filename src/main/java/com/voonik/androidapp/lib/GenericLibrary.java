package com.voonik.androidapp.lib;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
/**
 * 
 * @author Dhanashekhar
 *
 */
public class GenericLibrary 
{
	/**
	 *
	 *It is used to read data from DCapabilities.properties file to get the basic configurations based on Key
	 *@param key
	 *@return value
	 * @throws IOException 
	 */
	public static String getPropertyKeyValue(String path,String key)
	{ 
		FileInputStream fis;
		String value = null;
		try
		{
			fis = new FileInputStream(path);
			Properties p = new Properties();
			p.load(fis);
			value = p.getProperty(key);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
			e.getLocalizedMessage();
		}
		return value;
	} 

	public static void setPropertyKeyValue(String path,String key, String value)
	{
		FileInputStream fis;
		FileOutputStream fos; 
		try {
			Properties p = new Properties();
			
			fos = new FileOutputStream(path,true);
			System.out.println(p.get(key));
			Set keys = p.keySet();
			for(Object s:keys)
			{
				System.out.println(s);
			}
			p.replace(key, value);
			p.setProperty(key, value);
			p.store(fos, null);
		}catch(IOException e)
		{
			e.printStackTrace();
			e.getLocalizedMessage();
		}
	}

	public static void removePropertyKey(String path,String key)
	{
		FileOutputStream fos;
		try {
			Properties p = new Properties();
			fos = new FileOutputStream(path,true);
			p.remove(key);
			p.store(fos, null);
		}catch(IOException e)
		{
			e.printStackTrace();
			e.getLocalizedMessage();
		}
	}
	public static String executeBatchCommmand(String command) {

		String id = null;
		try {
			String line;
			ArrayList<String> deviceUDID = new ArrayList<String>();
			Process p = Runtime.getRuntime().exec(command);

			BufferedReader bri = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((line = bri.readLine()) != null) {
				deviceUDID.add(line);
			}
			System.out.println(deviceUDID);
			id = deviceUDID.get(1).replace("device", "").trim();
			bri.close();

		} catch (Exception err) {
			err.printStackTrace();
		}

		return id;
	}
}
