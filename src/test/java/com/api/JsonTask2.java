package com.api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTask2 {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader reader= new FileReader("C:\\Users\\suren\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\JsonTask2.json");	
JSONParser jsonparser= new JSONParser();
Object parse = jsonparser.parse(reader);
JSONObject jsonObject= (JSONObject)parse;	
Object page = jsonObject.get("page");
Object per_page = jsonObject.get("per_page");
Object total = jsonObject.get("total");
Object total_pages = jsonObject.get("total_pages");
Object data = jsonObject.get("data");
JSONArray array=(JSONArray)data;
for (int i = 0; i < array.size(); i++) {
Object object = array.get(i);
JSONObject jsonObject2= (JSONObject)object;
Object id = jsonObject2.get("id");
Object flightName = jsonObject2.get("flightName");
Object Country = jsonObject2.get("Country");
Object Destinations = jsonObject2.get("Destinations");
Object URL = jsonObject2.get("URL");
System.out.println(id);
System.out.println(flightName);
System.out.println(Country);
System.out.println(Destinations);
System.out.println(URL);





	
	
}

System.out.println(page);
System.out.println(per_page);
System.out.println(total);
System.out.println(total_pages);
		
		
		
		
		
		
		
	}
	
}
