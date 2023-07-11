 package com.restassured;

import org.testng.annotations.Test;

import com.omrbranch.base.Baseclass;

import io.restassured.response.Response;

public class SwaggerPost extends Baseclass {
	
	
	
	@Test
	public void login() {
addHeader("accept","application/json");








AddBasicAuth("surendranrules@gmail.com","Surenand@2115");



Response response = addReqType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
int statusCode = getStatusCode(response);
System.out.println(statusCode);
String getpretty = getResBodyAsPrettyString(response);
System.out.println(getpretty);

	}

}
