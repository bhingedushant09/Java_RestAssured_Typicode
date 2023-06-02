package com.typicode.execution;

import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.typicode.custom.*;
import com.typicode.testreport.*;
import com.typicode.util.Constants;
import com.typicode.util.PropertiesCache;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/*
* #author - Dushant Bhinge 
* #version 2.0 
* #since - 2023-05-16
*/

@SuppressWarnings("serial")
public class CommonExecution extends ExtentManager {

	private ExtentReports extent;
	public ExtentTest test;
	private String statustestcase;
	private String[] Strsplit = null;
	private String part2;
	private String part0;
	public static Response response = null;
	public static RestAssured restaassured;

	@BeforeMethod
	protected void setUp() throws InterruptedException, IOException {
		// testcondition = new TestCondition();

		try {

			extent = getReporter(CustomeValueReturn.getFilePathExtentReport());

			if (PropertiesCache.getInstance().getProperty("TYPICODEAPPLICATION").equalsIgnoreCase("Y")) {
				restaassured.baseURI = PropertiesCache.getInstance().getProperty("BASEURLTYPICODE");

			}

			else if (PropertiesCache.getInstance().getProperty("CALCULATOR").equalsIgnoreCase("Y")) {

			}

			else if (PropertiesCache.getInstance().getProperty("CALCULATOR1").equalsIgnoreCase("Y")) {

			}
		} catch (Exception ex) {
			System.out.println("Exception While Setting BASEURL " + ex);
		}
	}

	@AfterMethod
	protected void afterMethod() {

		try {
			statustestcase = test.getRunStatus().name();
			System.out.println(statustestcase);
			response = null;
			restaassured = null;

			if (extent != null) {
				extent.endTest(test);
				test.log(LogStatus.INFO, "End Of API Automation Test Report");
				extent.flush();
			} else {

				test.log(LogStatus.FAIL, "Fail To Flush Result In Log File ");
				extent.flush();
			}
		}

		catch (Exception e) {
			extent.endTest(test);
			test.log(LogStatus.FAIL, "Fail To Flush Result In Log File ");
			extent.flush();
			System.out.println("Error In After method");
			System.out.println(e.getStackTrace());
		}
		System.out.println("Closing of RestAssured Session");
	}

	private ExtentTest testStart(final String Testname) {
		test = extent.startTest(Constants.testname, Testname);
		test.log(LogStatus.INFO, "Start of API Automation Test Report");
		return test;
	}

	protected ExtentTest general_Init() throws IOException {

		try {
			Constants.loggerResultsFile = CustomeValueReturn.getFilePathCustomReport();
			Strsplit = Constants.testname.split("_");
			part0 = this.Strsplit[0];
			part2 = this.Strsplit[2];
			Constants.testcasenameexcel = "TC_" + part2;
			Constants.testcasename = part0 + File.separator + "TC_" + part2 + ".json";
			Constants.fileInputPath = Constants.xmlfilePostPath + Constants.testcasename;
			testStart(Constants.testname);
		} catch (Exception ex) {

			Constants.result = "Fail";
		}
		return test;
	}
}
