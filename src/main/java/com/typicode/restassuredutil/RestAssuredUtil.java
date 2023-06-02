package com.typicode.restassuredutil;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.io.IOUtils;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.typicode.custom.CustomeValueReturn;
import com.typicode.dataprovider.ReadExcelData;
import com.typicode.util.Constants;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.w3c.dom.Node;

/*
* #author - Dushant Bhinge 
* #version 1.0 
* #since - 2023-05-17
*/

public class RestAssuredUtil {

	private RestAssured restassured;
	private LinkedHashMap<String, String> read_keyvalue;
	protected final ExtentTest test;
	private static RequestSpecification reqspecf;
	protected static Response response;
	private Document document;
	private NodeList nodeList;
	private Element eElement;
	private List<String> nodeValues;
	private List<String> listValues;
	private NodeList nodechildattributeList;
	private int nodexcel;
	private List<String> getuserId;
	private JsonPath jpath;

	public RestAssuredUtil(RestAssured restassuredcon, ExtentTest testcon) throws IOException {
		this.test = testcon;
		this.restassured = restassuredcon;
		read_keyvalue = ReadExcelData.readExcel(Constants.testcasenameexcel);
	}

	protected void given() {
		try {
			System.out.println(restassured.baseURI);

			reqspecf = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();

			if (Constants.isBodyRequired != null && Constants.isBodyRequired.equalsIgnoreCase("Yes")) {
				reqspecf = restassured.given().contentType(ContentType.JSON)
						.body(IOUtils.toString(CustomeValueReturn.getFileInputObject()));
			} else {
				reqspecf = restassured.given();
			}
			// reqspecf = restassured.given().header("SOAPAction", "http://tempuri.org/Add")
			// .header("Content-Type", "text/xml;
			// charset=UTF-8").body(IOUtils.toString(CustomeValueReturn.getFileInputObject()));
			Thread.sleep(Constants.SYNC_SHORT);
			test.log(LogStatus.PASS, "Able to set header and body in given section " + Constants.testname);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail to set header and body in given section " + e);
			Assert.fail("given");
		}
	}

	protected void when() {
		try {
			Thread.sleep(Constants.SYNC_SHORT);
			if (Constants.type != null && Constants.type.equalsIgnoreCase("Post")) {
				response = reqspecf.when().post(read_keyvalue.get("Resources"));
			} else if (Constants.type != null && Constants.type.equalsIgnoreCase("Put")) {
				response = reqspecf.when().put(read_keyvalue.get("Resources"));

				// response = reqspecf.when().put(read_keyvalue.get("Resources"));
			} else if (Constants.type != null && Constants.type.equalsIgnoreCase("Delete")) {
				response = reqspecf.when().delete(read_keyvalue.get("Resources"));
			} else {
				response = reqspecf.when().get(read_keyvalue.get("Resources"));
			}
			// response = reqspecf.when().post("/calculator.asmx");
			test.log(LogStatus.PASS, "Able to set when section " + Constants.testname);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Able to set when section " + e);
			Assert.fail("when");
		}
	}

	protected void then() {
		try {
			Thread.sleep(Constants.SYNC_SHORT);
			response.then().contentType(ContentType.JSON).log().body().extract().response();
			Thread.sleep(Constants.SYNC_SHORT);
			test.log(LogStatus.PASS, "Able to set then section " + Constants.testname);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail to set then section " + e);
			Assert.fail("when");
		}
	}

	protected void validateGetStatusCode() {
		if (response != null) {
			try {
				System.out.println(response.getStatusCode());
				if (response.getStatusCode() == 200) {
					test.log(LogStatus.PASS,
							"Getting " + response.getStatusCode() + "Response for API " + Constants.testname);
				} else if (response.getStatusCode() == 201) {
					test.log(LogStatus.PASS,
							"Getting " + response.getStatusCode() + "Response for API " + Constants.testname);
				} else {
					test.log(LogStatus.FAIL,
							"Getting " + response.getStatusCode() + "Response for API " + Constants.testname);
					Assert.fail("validateGetStatusCode");
				}
			} catch (Exception e) {
				// TODO: handle exception
				test.log(LogStatus.FAIL,
						"Getting " + response.getStatusCode() + "Response for API " + Constants.testname);
				Assert.fail("validateGetStatusCode");
			}

		} else {
			test.log(LogStatus.FAIL, "Response is null in validateGetStatusCode");
			Assert.fail("validateGetStatusCode");
		}
	}

	protected void validateGetStatusCode500() {
		if (response != null) {
			try {
				System.out.println(response.getStatusCode());
				if (response.getStatusCode() == 500) {
					test.log(LogStatus.PASS,
							"Getting " + response.getStatusCode() + "Response for API " + Constants.testname);
				} else {
					test.log(LogStatus.FAIL,
							"Getting " + response.getStatusCode() + "Response for API " + Constants.testname);
					Assert.fail("validateGetStatusCode500");
				}
			} catch (Exception e) {
				// TODO: handle exception
				test.log(LogStatus.FAIL,
						"Getting " + response.getStatusCode() + "Response for API " + Constants.testname);
				Assert.fail("validateGetStatusCode");
			}

		} else {
			test.log(LogStatus.FAIL, "Response is null in validateGetStatusCode500");
			Assert.fail("validateGetStatusCode500");
		}
	}

	protected List<String> getNodeRandomValues(String parentnode, String childnode) {
		try {
			nodeValues = new ArrayList<String>();
			if (parentnode != null && parentnode != "") {
				System.out.println("Value");
			} else if (parentnode != "" || childnode != null) {
				jpath = new JsonPath(response.asString());
				List<String> userId = jpath.get(childnode);
				for (int i = 0; i < userId.size(); i++)

				{
					if (jpath.getString(childnode + "[" + i + "]").equals(read_keyvalue.get("VerifyChildNodeValue1"))) {
						listValues = new ArrayList<String>(read_keyvalue.values());
						for (nodexcel = 5; nodexcel < listValues.size(); nodexcel++) {
							System.out.println(listValues.get(nodexcel));
							if (nodexcel % 2 != 0 && listValues.get(nodexcel).length() > 2
									&& listValues.get(nodexcel) != null) {
								// String alltitle=jpath.getString("listValues.get(nodexcel)["+nodexcel+"]");
								System.out.println();
								nodeValues.add(
										jpath.getString(listValues.get(nodexcel) + "[" + i + "]").toString().trim());
							} else {

							}
						}
					} else {

					}
				}
			}
		}

		catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail to get node value getNodeRandomValues " + childnode + e);
			Assert.fail("getNodeRandomValues");
		}
		return nodeValues;
	}

	protected List<String> getNodeSpecificValues(String parentnode, String childnode) {

		try {
			int count = 0;
			nodeValues = new ArrayList<String>();
			if (parentnode != null && parentnode != "") {
				System.out.println("Value");
			} else if (parentnode != "" || childnode != null) {
				JsonPath jpath = new JsonPath(response.asString());
				getuserId = jpath.get(childnode);
				for (int i = 0; i < getuserId.size(); i++) {
					System.out.println(jpath.getString(childnode + "[" + i + "]").toString().trim());
					nodeValues.add(jpath.getString(childnode + "[" + i + "]").toString().trim());
					count++;
					if (count >= 5000) {
						break;
					}
				}
			}

		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Fail to get node value getNodeValues " + childnode);
			Assert.fail("getNodeValues");
		}
		return nodeValues.stream().distinct().collect(Collectors.toList());
	}
}
