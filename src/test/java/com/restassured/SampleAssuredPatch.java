package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleAssuredPatch {

	public static void main(String[] args) {
		RequestSpecification patchreq;
		patchreq= RestAssured.given();
		patchreq=patchreq.header("accept","application/json");
		patchreq.body("{\r\n" + 
				"    \"Destinations\": 43\r\n" + 
				"}");
		Response patch = patchreq.patch("https://www.omrbranch.com/api/flight/11620");
		int scode = patch.getStatusCode();
		System.out.println(scode);
		String asString1 = patch.asString();
		System.out.println(asString1);
		String asPrettyString1 = patch.asPrettyString();
		System.out.println(asPrettyString1);

	}

}
