package com.omrbranch.pojo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.omrbranch.base.Baseclass;

import io.restassured.response.Response;

public class swaggerPostPojo extends Baseclass {
	
	@Test
	public void login() {
addHeader("accept","application/json");








AddBasicAuth("surendranrules@gmail.com","Surenand@2115");



Response response = addReqType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
int statusCode = getStatusCode(response);
Assert.assertEquals(statusCode, 200, "verifystatuscode");
System.out.println(statusCode);
Login_Output_pojo login_Output_pojo = response.as(Login_Output_pojo.class);
String first_name = login_Output_pojo.getData().getFirst_name();
Assert.assertEquals(first_name, "Anbu", "verifyfirstname");
	}

}
