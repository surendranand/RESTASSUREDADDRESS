package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleAssuredPost {

	public static void main(String[] args) {
		RequestSpecification postreq;
		postreq= RestAssured.given();
		postreq=postreq.header("aacept","application/json");
		postreq.body("{\r\n" + 
				"    \"flightName\": \"AirIndia\",\r\n" + 
				"    \"Country\": \"India\",\r\n" + 
				"    \"Destinations\": \"87\",\r\n" + 
				"    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + 
				"}");
		Response post = postreq.post("https://www.omrbranch.com/api/flights");
		int scode = post.getStatusCode();
		System.out.println(scode);
		String asString1 = post.asString();
		System.out.println(asString1);
		String asPrettyString1 = post.asPrettyString();
		System.out.println(asPrettyString1);
	}

}
