package com.typicode.test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static io.restassured.RestAssured.responseSpecification;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.json.JsonPath;

public class Test {

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

			// reqspecf = restassured.
			// given().header("SOAPAction", "http://tempuri.org/Divide")
			// .header("Content-Type", "text/xml;
			// charset=UTF-8").body(IOUtils.toString(fileInputStream));
			response = given().spec(reqspecf).when().get("/posts");

			response.then().and().log().body().extract().response().asString();

			System.out.println(response.getStatusCode());

			// List<Map<String, String>> companies = (response.jsonPath().getList("id"));
			// System.out.println(String.valueOf(companies.get(3).get("userId").toString()));
			// System.out.println(companies.get(0).get("userId"));

			// Map<String, String> company = response.jsonPath().getMap("id");
			// System.out.println(company.get("userId"));

			JsonPath jpath = new JsonPath(response.asString());

			List<String> userId = jpath.get("id");

			int sizeofCourse = jpath.getInt("id.size()");

			for (int i = 0; i < userId.size(); i++)

			{
				System.out.println(jpath.getString("id[" + i + "]"));
				if (jpath.getString("id[" + i + "]").equals("5"))
				{
					String alltitle=jpath.getString("title["+i+"]");

					System.out.println(alltitle+", ");
				}
				
				else
				{
					
				}
				//String titleName = response.path("title.find { id -> id == 5 }.title");

				//System.out.print(titleName + ", ");
			}

			// Taking all team name and save in list
			// List<String> allteamname =
			// response.path("userId"); System.out.println(allteamname);

			// Fetch team array and save it to list
			// List<Map<String, ?>> testdata =
			// response.path("id"); System.out.println(testdata);
			// String extractintostring =
			// response.toString(); String[] aftersplit = extractintostring.split(",");
			// System.out.println(aftersplit[0]);

			// String userId = response.path("id.find { it.id == 4 }.userId");
			// System.out.println(userId);
			// Fetch the player name having position Defence
			List<String> name = response.path(".findAll { it.userId == 5 }.id");
			System.out.println(name);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
