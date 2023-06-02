package com.typicode.apisteps;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import org.apache.commons.io.IOUtils;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.typicode.custom.CustomeValueReturn;
import com.typicode.dataprovider.ReadExcelData;
import com.typicode.restassuredutil.RestAssuredUtil;
import com.typicode.util.Constants;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class TypicodeSteps extends RestAssuredUtil {
	private LinkedHashMap<String, String> read_keyvalue;
	private String readnodevalueexcel;
	private String[] splitreadnodevalueexcel;
	private List<String> listchildnodevalues;
	// private SimpleDateFormat sdf;

	public TypicodeSteps(RestAssured restassured, ExtentTest testcon) throws IOException {
		super(restassured, testcon);
		read_keyvalue = ReadExcelData.readExcel(Constants.testcasenameexcel);
	}

	public void verifyValidate200Response() {
		try {
			given();
			when();
			then();
			validateGetStatusCode();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail to get 200 response  " + e);
		}
	}

	public void verifyValidat500Response() {
		try {
			given();
			when();
			then();
			validateGetStatusCode500();
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail to get 200 response  " + e);
		}
	}

	public void verifySpecificAllNodeValue() {
		verifyValidate200Response();
		listchildnodevalues = getNodeSpecificValues(read_keyvalue.get("ParentNode1"), read_keyvalue.get("ChildNode1"));
		verifyNodeValues(listchildnodevalues, "VerifyChildNodeValue1");
	}

	public void verifyNodeValues(List<String> listchildnodevalues, String verifyChildNodeValue) {
		readnodevalueexcel = read_keyvalue.get(verifyChildNodeValue);
		splitreadnodevalueexcel = readnodevalueexcel.split(",");
		test.log(LogStatus.INFO, "Size of actual noe and expected node " + " SIZE IN RESPONSE "
				+ listchildnodevalues.size() + " SIZE IN EXCEL " + splitreadnodevalueexcel.length);
		for (int i = 0; i <= splitreadnodevalueexcel.length - 1; i++) {
			System.out.println("Excel Value " + splitreadnodevalueexcel[i]);

			System.out.println("API Response " + listchildnodevalues.get(i));
			if (listchildnodevalues.contains(splitreadnodevalueexcel[i])) {
				test.log(LogStatus.PASS, "Excel Value " + splitreadnodevalueexcel[i] + " API Response "
						+ listchildnodevalues.get(i) + " " + Constants.testname);
			} else {
				test.log(LogStatus.FAIL, "Fail Excel Value " + splitreadnodevalueexcel[i] + "Fail API Response "
						+ listchildnodevalues.get(i) + " " + Constants.testname);
			}
		}
	}

	public void verifySpecificValueAndGetNodeValue() {
		verifyValidate200Response();
		listchildnodevalues = getNodeRandomValues(read_keyvalue.get("ParentNode1"), read_keyvalue.get("ChildNode1"));
		verifyNodeValues(listchildnodevalues, "VerifyChildNodeValue2");
	}

	public void verifyResponseEachAttribute(String verifyChildNodeValue) throws IOException {
		splitreadnodevalueexcel = verifyChildNodeValue.split(",");
		JsonPath jpathReadJson = new JsonPath(IOUtils.toString(CustomeValueReturn.getFileInputObject()));
		JsonPath jpathReadResponse = new JsonPath(response.asString());
		for (int i = 0; i <= splitreadnodevalueexcel.length - 1; i++) {
			System.out.println("Excel Value " + splitreadnodevalueexcel[i]);
			System.out.println(jpathReadJson.getString(splitreadnodevalueexcel[i]));
			System.out.println(jpathReadResponse.getString(splitreadnodevalueexcel[i]));

			if (jpathReadJson.getString(splitreadnodevalueexcel[i])
					.equalsIgnoreCase(jpathReadResponse.getString(splitreadnodevalueexcel[i]))) {
				test.log(LogStatus.PASS,
						"Value Json Read " + jpathReadJson.getString(splitreadnodevalueexcel[i]) + " "
								+ "Value Json Response Read " + jpathReadResponse.getString(splitreadnodevalueexcel[i])
								+ Constants.testname);
			} else {
				test.log(LogStatus.FAIL,
						"Value Json Read " + jpathReadJson.getString(splitreadnodevalueexcel[i] + " "
								+ "Value Json Response Read " + jpathReadResponse.getString(splitreadnodevalueexcel[i])
								+ Constants.testname));
			}
		}
	}

	public void updateResourceSpecificId() throws IOException {
		verifyValidate200Response();
		verifyResponseEachAttribute(read_keyvalue.get("VerifyChildNodeValue1"));
	}

	public void createResourceSpecificId() throws IOException {
		verifyValidate200Response();
		verifyResponseEachAttribute(read_keyvalue.get("VerifyChildNodeValue1"));
	}

	public void deleteResourceSpecificId() throws IOException {
		verifyValidate200Response();
	}
}
