package com.typicode.util;

import java.io.File;
import java.util.Calendar;
import java.util.HashMap;

/*
* #author - Dushant Bhinge 
* #version 1.0 
* #since - 2023-05-16
*/
public class Constants {

	static Calendar cal = Calendar.getInstance();
	public static int year = cal.get(Calendar.YEAR);
	public static int month = cal.get(Calendar.MONTH) + 1;
	public static int day = cal.get(Calendar.DAY_OF_MONTH);
	public static int hour = cal.get(Calendar.HOUR_OF_DAY);
	public static int minute = cal.get(Calendar.MINUTE);
	public static int second = cal.get(Calendar.SECOND);
	public static String yearstring = "" + year;

	public static String testname = null;

	public static HashMap<String, String> getstepstatus = null;

	public static String testcasename = null;
	
	public static String testcasenameexcel = null;
	
	public static String calculatorpostrequest = "";
	
	public static String result = "Not Set";

	public static int SYNC_SHORT = 2000;
	
	public static String isBodyRequired = null;
	
	public static String type = null;

	public static int SYNC_MEDIUM = 6000;

	public static String loggerResultsFile;
	
	public static String getcontentType = "text/xml; charset=UTF-8";

	public static String logoPath = System.getProperty("user.dir") + File.separator + "Logo" + File.separator + "icon.png";
	public static String xmlfilePostPath = System.getProperty("user.dir") + File.separator + "TestData" + File.separator;
	public static String fileInputPath;
}