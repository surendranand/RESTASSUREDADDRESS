package com.baseclass.testng;

import org.testng.annotations.Test;
import com.omrbranch.base.Baseclass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseTestNgList extends Baseclass {
	
	
	
	@Test
	public void getListFlight() {
	//	RequestSpecification reqspec = RestAssured.given();
		addHeader("content","application/json");
	Response response = addReqType("GET","https://www.omrbranch.com/api/flights");
	int statusCode = getStatusCode(response);
	System.out.println(statusCode);
	String resBodyAsPrettyString = getResBodyAsPrettyString(response);
	System.out.println(resBodyAsPrettyString);
	
		
		
	
	
	}

}
