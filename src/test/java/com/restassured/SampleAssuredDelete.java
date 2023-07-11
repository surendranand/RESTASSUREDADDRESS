package com.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleAssuredDelete {

	public static void main(String[] args) {
		RequestSpecification deletereq;
		deletereq= RestAssured.given();
		deletereq=deletereq.header("accept","application/json");
		
		Response delete = deletereq.patch("https://www.omrbranch.com/api/flight/11620");
		int scode = delete.getStatusCode();
		System.out.println(scode);
		String asString1 = delete.asString();
		System.out.println(asString1);
		String asPrettyString1 = delete .asPrettyString();
		System.out.println(asPrettyString1);

	}

	}


