package org.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class AppTest {
	
	static RequestSpecification req;
	public static void main(String[] args) {
		
		req = RestAssured.given();
		req = req.log().all();
//		Response res = req.when().get("https://reqres.in/api/users?page=2");
		
		Response res = req.when().body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}").post("https://reqres.in/api/users");
		
		int status = res.getStatusCode();
		System.out.println(status);
		
		ResponseBody body = res.getBody();
		System.out.println(body);
		
		System.out.println(body.asString());
		
		System.out.println(body.asPrettyString());
	}

}
