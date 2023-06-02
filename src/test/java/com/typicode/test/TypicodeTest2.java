package com.typicode.test;

import org.testng.annotations.Test;

import com.typicode.apisteps.TypicodeSteps;
import com.typicode.execution.CommonExecution;
import com.typicode.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TypicodeTest2 extends CommonExecution {
	private ExtentTest gettestGeneralInit;
	private TypicodeSteps typicodesteps;

	@Test()
	public void typicode_test_025_deleteResourcePosts() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.type = "delete";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.deleteResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail while getting id from posts API typicode_test_025_deleteResourcePosts " + e);
		}
	}

	@Test()
	public void typicode_test_026_deleteResourceComments() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.type = "delete";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.deleteResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_026_deleteResourceComments " + e);
		}
	}

	@Test()
	public void typicode_test_027_deleteResourceAlbums() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.type = "delete";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.deleteResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_027_deleteResourceAlbums " + e);
		}
	}

	@Test()
	public void typicode_test_028_deleteResourcePhotos() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.type = "delete";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.deleteResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_028_deleteResourcePhotos " + e);
		}
	}

	@Test()
	public void typicode_test_029_deleteResourceTodos() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.type = "delete";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.deleteResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail while getting id from posts API typicode_test_029_deleteResourceTodos " + e);
		}
	}

	@Test()
	public void typicode_test_030_deleteResourceUsers() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.type = "delete";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.deleteResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail while getting id from posts API typicode_test_030_deleteResourceUsers " + e);
		}
	}
}
