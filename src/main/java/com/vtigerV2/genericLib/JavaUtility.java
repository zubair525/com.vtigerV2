package com.vtigerV2.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
/**
 * This class contains java specifics methods which is used to fetch date, read random data and read
 * common data from properties file.
 * @author zubair
 */
public class JavaUtility {
	/**
	 * This method is used to read the common data from properties file
	 * @param key
	 * @return value
	 * @throws Throwable
	 */
	public String getPropertyData(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IConstant.commonDatapath);
		Properties pobj=new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
		
	}
	/**
	 * This method is used to generate random data with 1000 limit
	 * @return random data in the form of String
	 *
	 */
	public String getRandomData() {
		Random random=new Random();
		int nextInt = random.nextInt(1000);
		return ""+nextInt;
	}
	/**
	 * This method is used to generate Systems current Date
	 * @return current date in the form of String.
	 */
	public String getSystemCurrentDate() {
		Date date=new Date();
		String currentDate = date.toString();
		return currentDate;
	}
}
