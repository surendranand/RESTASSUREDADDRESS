package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleAssuredQuerry {

	public static void main(String[] args) {
		RequestSpecification queryParam;
		queryParam= RestAssured.given();
		queryParam= queryParam.queryParam("page", "1");
		Response response2 = queryParam.get("https://www.omrbranch.com/api/flights");
		int scode = response2.getStatusCode();
		System.out.println(scode);
		String asString1 = response2.asString();
		System.out.println(asString1);
		String asPrettyString1 = response2.asPrettyString();
		System.out.println(asPrettyString1);
	}

}
