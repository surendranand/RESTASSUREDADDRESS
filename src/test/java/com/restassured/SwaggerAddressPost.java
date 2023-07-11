package com.restassured;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.omrbranch.base.Baseclass;
import com.omrbranch.pojo.Address_input_pojo;
import com.omrbranch.pojo.Adress_output_pojo;
import com.omrbranch.pojo.DeleteAddress_pojo;
import com.omrbranch.pojo.Delete_Address_pojo;
import com.omrbranch.pojo.GetAllAddress_Output_pojo;
import com.omrbranch.pojo.GetCity_output_pojo;
import com.omrbranch.pojo.Getcity_input_pojo;
import com.omrbranch.pojo.Login_Output_pojo;
import com.omrbranch.pojo.UpdateAdress_Input_pojo;
import com.omrbranch.pojo.UpdateAdress_Output_pojo;
import com.omrbranch.pojo.citylist;
import com.omrbranch.pojo.getStatelist_outpur_pojo;
import com.omrbranch.pojo.statelist;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class SwaggerAddressPost extends Baseclass{
	String logtoken;
	String addressids;
	String stateid;
	int cityid;
	
	
@Test(priority=7)
public void getCityList() {

	List<Header>listheader3= new ArrayList<>();
	Header h1=new Header("accept", "application/json");
	
	Header h3=new Header("Content-Type", "application/json");
	 listheader3.add(h1);
	
	 listheader3.add(h3);
	 
	 Headers headers3 =new Headers(listheader3);
	 addHeaders(headers3);
	Getcity_input_pojo cityinput= new Getcity_input_pojo(stateid);
	Addbody(cityinput);
	Response response2 = addReqType("POST", "https://omrbranch.com/api/cityList");
	int statusCode = response2.getStatusCode();
	System.out.println(statusCode);
	Assert.assertEquals(statusCode,200,"verify");
	GetCity_output_pojo outcity = response2.as(GetCity_output_pojo.class);
	ArrayList<citylist>citynamelist= outcity.getData();
	for (citylist citylist : citynamelist) {
		String cityname = citylist.getName();
		if (cityname.equals("Yercaud")) {
		 cityid = citylist.getId();
		Assert.assertEquals(cityid, 4440,"verify");
		System.out.println(cityid);
		break;
		
		}
		
	}
	

}
	
	
	@Test(priority=6)
	public void getStatelist() {
		List<Header>listheader5= new ArrayList<>();
		Header h1=new Header("accept", "application/json");
		listheader5.add(h1);
		
		 
		 Headers headers3 =new Headers(listheader5);
		 addHeaders(headers3);
		Response response = addReqType("GET","https://omrbranch.com/api/stateList");
		int statusCode = getStatusCode(response);
		System.out.println(statusCode);
		Assert.assertEquals(statusCode,200,"verifymsg");
		getStatelist_outpur_pojo stateoutput=response.as(getStatelist_outpur_pojo.class);
		ArrayList<statelist> stateList = stateoutput.getData();
		for (statelist eachstate : stateList) {
			String statename = eachstate.getName();
			if (statename.equals("Tamil Nadu")) {
				 int stateidtext = eachstate.getId();
		stateid = String.valueOf(stateidtext);
		
			
				Assert.assertEquals(stateidtext,35,"verifystate");
				System.out.println(stateidtext);
				break;
			}
		}
		
	}
	
	@Test(priority=5)
	public void DeleteUserAddress() {
		
		List<Header>listheader3= new ArrayList<>();
		Header h1=new Header("accept", "application/json");
		Header h2=new Header("Authorization", "Bearer "+ logtoken);
		Header h3=new Header("Content-Type", "application/json");
		 listheader3.add(h1);
		 listheader3.add(h2);
		 listheader3.add(h3);
		 
		 Headers headers3 =new Headers(listheader3);
		 addHeaders(headers3);
		 Delete_Address_pojo deletedateaddress= new Delete_Address_pojo(addressids);
		 Addbody(deletedateaddress);
		 Response response5 = addReqType("DELETE","https://omrbranch.com/api/deleteAddress");
		 int statusCode4 = getStatusCode(response5);
		 System.out.println(statusCode4);
		 Assert.assertEquals(statusCode4,200,"verifymsg");
		 DeleteAddress_pojo deleteadress_output_pojo = response5.as(DeleteAddress_pojo.class);
			String message1 = deleteadress_output_pojo.getMessage();
			 Assert.assertEquals(message1,"Address deleted successfully","verifymsg");
		 
	}
	
	@Test(priority=4)
	public void GetAllUserAddress() {
		
		List<Header>listheader2= new ArrayList<>();
		Header h1=new Header("accept", "application/json");
		Header h2=new Header("Authorization", "Bearer "+ logtoken);
		
		 listheader2.add(h1);
		 listheader2.add(h2);
		 
		 Headers headers2 =new Headers(listheader2);
		 addHeaders(headers2);
		 Response response4 = addReqType("GET","https://omrbranch.com/api/getUserAddress");
		 int statusCode3 = getStatusCode(response4);
		 System.out.println(statusCode3);
		 Assert.assertEquals(statusCode3,200,"verifymsg");
		 GetAllAddress_Output_pojo getalladress_output_pojo = response4.as(GetAllAddress_Output_pojo.class);
			String message1 = getalladress_output_pojo.getMessage();
			 Assert.assertEquals(message1,"OK","verifymsg");
		 
	}
	@Test(priority=3)
	public void UpdateUserAddress() {
		
		List<Header> listheader1= new ArrayList<>();
		Header h1=new Header("accept", "application/json");
		Header h2=new Header("Authorization", "Bearer "+ logtoken);
		Header h3=new Header("Content-Type", "application/json");
		 listheader1.add(h1);
		 listheader1.add(h2);
		 listheader1.add(h3);
		 Headers headers1 =new Headers(listheader1);
		 addHeaders(headers1);
		 UpdateAdress_Input_pojo updateaddress=new UpdateAdress_Input_pojo(addressids ,"Raj", "Khundra", "1234567898", "apartment", 33, 3378, 101, "202020", "64/63 partap naga", "home");
		 Addbody(updateaddress);
		 
		  Response response3 = addReqType("PUT","https://omrbranch.com/api/updateUserAddress");
		 int statusCode2 = getStatusCode(response3);
		 System.out.println(statusCode2);
		 Assert.assertEquals(statusCode2,200,"verifymsg");
		UpdateAdress_Output_pojo updateadress_output_pojo = response3.as(UpdateAdress_Output_pojo.class);
		String message1 = updateadress_output_pojo.getMessage();
		 Assert.assertEquals(message1,"Address updated successfully","verifymsg");
		 
	}
	@Test(priority=2)
	public void AddUserAddress() {
		
		List<Header> listheader= new ArrayList<>();
		Header h1=new Header("accept", "application/json");
		Header h2=new Header("Authorization", "Bearer "+ logtoken);
		Header h3=new Header("Content-Type", "application/json");
		 listheader.add(h1);
		 listheader.add(h2);
		 listheader.add(h3);
		 Headers headers =new Headers(listheader);
		 addHeaders(headers);
		 Address_input_pojo address=new Address_input_pojo("Raj", "Khundra", "1234567898", "apartment", 33, 3378, 101, "202020", "64/63 partap naga", "home");
		 Addbody(address);
		 
		  Response response2 = addReqType("POST","https://omrbranch.com/api/addUserAddress");
		 int statusCode = getStatusCode(response2);
		 System.out.println(statusCode);
		 Assert.assertEquals(statusCode,200,"verifymsg");
		Adress_output_pojo adress_output_pojo = response2.as(Adress_output_pojo.class);
		String message = adress_output_pojo.getMessage();
		int addressid = adress_output_pojo.getAddress_id();
		 addressids = String.valueOf(addressid);
		 Assert.assertEquals(message,"Address added successfully", "verifymsg");
		 
		 

	}

	@Test(priority=1)
	public void login1() {
addHeader("accept","application/json");

AddBasicAuth("surendranrules@gmail.com","Surenand@2115");



Response response = addReqType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
int statusCode = getStatusCode(response);
Assert.assertEquals(statusCode, 200, "verifystatuscode");
System.out.println(statusCode);
Login_Output_pojo login_Output_pojo = response.as(Login_Output_pojo.class);
String first_name = login_Output_pojo.getData().getFirst_name();
Assert.assertEquals(first_name, "Anbu", "verifyfirstname");
 logtoken = login_Output_pojo.getData().getLogtoken();

	}

	
	
	
}
