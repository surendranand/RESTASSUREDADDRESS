package com.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTask_1 {
	public static void main(String[] args) throws IOException, ParseException {
		
	
	FileReader reader= new FileReader("C:\\Users\\suren\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\JsonTask1.json");
JSONParser jsonparser= new JSONParser();
Object parse = jsonparser.parse(reader);
JSONObject jsonObject= (JSONObject)parse;
//data
Object data = jsonObject.get("data");
JSONObject jsonObject1= (JSONObject)data;
Object id = jsonObject1.get("id");
Object flightname = jsonObject1.get("flightName");
Object country = jsonObject1.get("Country");
Object destination = jsonObject1.get("Destinations");
Object url = jsonObject1.get("URL");
Object cdate = jsonObject1.get("Created_Date");
Object udate = jsonObject1.get("Updated_Date");
System.out.println(id);

System.out.println(flightname);
System.out.println(country);
System.out.println(destination);
System.out.println(url);
System.out.println(cdate);
System.out.println(udate);

//support
Object support = jsonObject.get("support");
JSONObject jsonObject2= (JSONObject)support;
Object url1 = jsonObject2.get("url");
String stt=(String)url1;

Object text = jsonObject2.get("text");
System.out.println(stt);
System.out.println(text);




}
}