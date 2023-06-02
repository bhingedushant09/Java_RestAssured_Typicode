package com.typicode.test;

import org.testng.annotations.Test;

import com.typicode.apisteps.TypicodeSteps;
import com.typicode.execution.CommonExecution;
import com.typicode.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TypicodeTest3 extends CommonExecution {
	private ExtentTest gettestGeneralInit;
	private TypicodeSteps typicodesteps;

	@Test()
	public void typicode_test_001_verifyResourcePostsSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificValueAndGetNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_001_verifyResourcePostsSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_002_verifyResourcePostsAllId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificAllNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API  typicode_test_002_verifyResourcePostsAllId " + e);
		}
	}

	@Test()
	public void typicode_test_003_verifyResourceCommentsAllId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificAllNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from comments API typicode_test_003_verifyResourceCommentsAllId " + e);
		}
	}

	@Test()
	public void typicode_test_004_verifyResourceAlbumsAllId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificAllNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from comments API typicode_test_004_verifyResourceAlbumsAllId " + e);
		}
	}

	@Test()
	public void typicode_test_005_verifyResourcePhotosAllId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificAllNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from comments API typicode_test_005_verifyResourcePhotosAllId " + e);
		}
	}

	@Test()
	public void typicode_test_006_verifyResourceTodosAllId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificAllNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from comments API typicode_test_006_verifyResourceTodosAllId " + e);
		}
	}

	@Test()
	public void typicode_test_007_verifyResourceUsersAllId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificAllNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from comments API typicode_test_007_verifyResourceUsersAllId " + e);
		}
	}

	@Test()
	public void typicode_test_008_verifyResourceCommentsSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificValueAndGetNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_008_verifyResourceCommentsSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_009_verifyResourceAlbumsSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificValueAndGetNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_009_verifyResourceAlbumsSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_010_verifyResourcePhotosSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificValueAndGetNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_010_verifyResourcePhotosSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_011_verifyResourceTodosSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificValueAndGetNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_011_verifyResourceTodosSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_012_verifyResourceUsersSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.verifySpecificValueAndGetNodeValue();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_012_verifyResourceUsersSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_013_updateResourcePostsSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "put";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.updateResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_013_updateResourcePostsSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_014_updateResourceCommentsSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "put";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.updateResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_014_updateResourceCommentsSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_015_updateResourceAlbumsSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "put";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.updateResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_015_updateResourceAlbumsSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_016_updateResourcePhotosSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "put";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.updateResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_016_updateResourcePhotosSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_017_updateResourceTodosSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "put";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.updateResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_017_updateResourceTodosSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_018_updateResourceUsersSpecificId() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "put";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.updateResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_018_updateResourceUsersSpecificId " + e);
		}
	}

	@Test()
	public void typicode_test_019_createResourcePosts() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail while getting id from posts API typicode_test_019_createResourcePosts " + e);
		}
	}

	@Test()
	public void typicode_test_020_createResourceComments() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_020_createResourceComments " + e);
		}
	}

	@Test()
	public void typicode_test_021_createResourceAlbums() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_021_createResourceAlbums " + e);
		}
	}

	@Test()
	public void typicode_test_022_createResourcePhotos() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_022_createResourcePhotos " + e);
		}
	}

	@Test()
	public void typicode_test_023_createResourceTodos() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail while getting id from posts API typicode_test_023_createResourceTodos " + e);
		}
	}

	@Test()
	public void typicode_test_024_createResourceUsers() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail while getting id from posts API typicode_test_024_createResourceUsers " + e);
		}
	}

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

	@Test()
	public void typicode_test_031_createResourcePosts() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail while getting id from posts API typicode_test_019_createResourcePosts " + e);
		}
	}

	@Test()
	public void typicode_test_032_createResourceComments() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_020_createResourceComments " + e);
		}
	}

	@Test()
	public void typicode_test_033_createResourceAlbums() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_021_createResourceAlbums " + e);
		}
	}

	@Test()
	public void typicode_test_034_createResourcePhotos() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL,
					"Fail while getting id from posts API typicode_test_022_createResourcePhotos " + e);
		}
	}

	@Test()
	public void typicode_test_035_createResourceTodos() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail while getting id from posts API typicode_test_023_createResourceTodos " + e);
		}
	}

	@Test()
	public void typicode_test_036_createResourceUsers() {
		try {
			Constants.testname = new Exception().getStackTrace()[0].getMethodName();
			Constants.isBodyRequired = "Yes";
			Constants.type = "post";
			gettestGeneralInit = general_Init();
			System.out.println(restaassured.baseURI);
			typicodesteps = new TypicodeSteps(restaassured, gettestGeneralInit);
			typicodesteps.createResourceSpecificId();

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail while getting id from posts API typicode_test_024_createResourceUsers " + e);
		}
	}
}
