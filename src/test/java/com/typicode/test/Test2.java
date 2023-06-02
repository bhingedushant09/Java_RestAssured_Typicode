package com.typicode.test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static io.restassured.RestAssured.responseSpecification;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.json.JsonPath;

public class Test2 {

	private static RequestSpecification reqspecf;
	private static RestAssured restassured;
	protected static FileInputStream fileInputStream;

	private static Response response;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// String fileName = System.getProperty("user.dir") + File.separator +
			// "Divide.xml";
			// fileInputStream = new FileInputStream(new File(fileName));

			reqspecf = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();

			// .setBasePath("/posts").setContentType("application/json").
			// Adding Authentication token in header section

			String fileName = System.getProperty("user.dir") + File.separator +
			"TC_013.json";
			fileInputStream = new FileInputStream(new File(fileName));

			//reqspecf = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();
			// .setBasePath("/posts").setContentType("application/json").
			// Adding Authentication token in header section

			// reqspecf = restassured.
			given().spec(reqspecf)
			.contentType(ContentType.JSON).body(IOUtils.toString(fileInputStream))
			.when().put("/posts/2")
			.then().and().log()
			.body().extract().response().asString();

			Map<String, Object> petMap = new HashMap<>();
			petMap.put("userId", "1");
			petMap.put("id", "2");
			petMap.put("title", "qui est esse");
			petMap.put("body", "est rerum tempore vitae");
			String getbody = "{\r\n" + "  \"userId\": 1,\r\n" + "  \"id\": 2,\r\n"
					+ "  \"title\": \"qui est esse\",\r\n" + "  \"body\": \"est rerum tempore vitae\"\r\n" + "}";
			
			//given().baseUri("https://jsonplaceholder.typicode.com")
			//.contentType(ContentType.JSON).body(IOUtils.toString(fileInputStream))
			//.when().put("/posts/2")
			//.then().and().log()
			//.body().extract().response().asString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
