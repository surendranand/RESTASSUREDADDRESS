package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleAssuredPut {

	public static void main(String[] args) {
		RequestSpecification putreq;
		putreq= RestAssured.given();
		putreq=putreq.header("aacept","application/json");
		putreq.body("{\r\n" + 
				"    \"flightName\": \"AirIndia\",\r\n" + 
				"    \"Country\": \"India\",\r\n" + 
				"    \"Destinations\": 39,\r\n" + 
				"    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n" + 
				"}");
		Response put = putreq.put("https://www.omrbranch.com/api/flight/11620");
		int scode = put.getStatusCode();
		System.out.println(scode);
		String asString1 = put.asString();
		System.out.println(asString1);
		String asPrettyString1 = put.asPrettyString();
		System.out.println(asPrettyString1);

	}

}
