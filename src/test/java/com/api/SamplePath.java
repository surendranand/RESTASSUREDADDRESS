package com.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Datumjson3;
import com.pojo.Rootjson3;
import com.pojo.Supportjson3;

public class SamplePath  {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
File file=new  File("C:\\Users\\suren\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\Jsontask3.json");
ObjectMapper mapper=new ObjectMapper();
Rootjson3 data = mapper.readValue(file,Rootjson3.class);
System.out.println(data.getPage());

System.out.println(data.getPer_page());
System.out.println(data.getTotal());
System.out.println(data.getTotal_pages());
ArrayList<Datumjson3> data2 = data.getData();
for (Datumjson3 datumjson3 : data2) {

	System.out.println(datumjson3.getId()); 
	System.out.println(datumjson3.getFlightName()); 
	System.out.println(datumjson3.getCountry()); 
	System.out.println(datumjson3.getDestinations()); 
}
Supportjson3 support = data.getSupport();
System.out.println(support.getUrl());
System.out.println(support.getText());
 

	}

}
