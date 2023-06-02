package com.typicode.custom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;

import com.typicode.util.*;

/*
* #author - Dushant Bhinge 
* #version 1.0 
* #since - 2023-05-17
*/

public class CustomeValueReturn {

	private static String dateTime;
	protected static String machineName;
	protected static String filePathExtentReport;
	protected static String filePathCustomReport;
	protected static FileInputStream fileInputStream;

	protected static String getCalenderValue() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // 0 to 11
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		String yearstring = "" + year;

		dateTime = yearstring + "_" + month + "_" + day + "_" + hour + "_" + minute + "_" + second;
		return dateTime;
	}

	protected static String getMachineValue() {
		return machineName = System.getProperty("user.name");
	}

	public static String getFilePathExtentReport() {
		return filePathExtentReport = System.getProperty("user.dir") + File.separator + "logs" + File.separator
				+ "testlogs.html";
	}

	public static String getFilePathCustomReport() {
		return filePathCustomReport = System.getProperty("user.dir") + File.separator
				+ CustomeValueReturn.getMachineValue() + File.separator + "ResultsViewer_" + Constants.testname + "_"
				+ CustomeValueReturn.getCalenderValue() + ".htm";
	}

	public static FileInputStream getFileInputObject() {
		try {
			fileInputStream = new FileInputStream(new File(Constants.fileInputPath));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return fileInputStream;
	}
}