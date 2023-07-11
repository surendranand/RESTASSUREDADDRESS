package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleAssuredPathparm {

	public static void main(String[] args) {
		RequestSpecification reqspec;
		
	 reqspec = RestAssured.given();
	 
	 reqspec=reqspec.pathParam("Flightnumber","11580");
Response response = reqspec.get("https://www.omrbranch.com/api/flight/{Flightnumber}");

int statusCode = response.getStatusCode();
System.out.println(statusCode);
String asString = response.asString();
System.out.println(asString);
String asPrettyString = response.asPrettyString();
System.out.println(asPrettyString);



	}

}
