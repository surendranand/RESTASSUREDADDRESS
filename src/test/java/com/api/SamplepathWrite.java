package com.api;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojotask2write.Datum;
import pojotask2write.RootTaskWrite;
import pojotask2write.SupportTaskWrite;

public class SamplepathWrite {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		File file=new File("C:\\Users\\suren\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\JsonWritetask4.json");
		ObjectMapper mapper= new ObjectMapper();
		SupportTaskWrite support=new SupportTaskWrite("https:\\\\/\\\\/www.omrbranch.com", "For Joining Automation Course, Please Contact-Velmurugan 9944152058");
		List<Datum>details=new ArrayList<Datum>();
		Datum data1= new Datum(3, "AirIndia", "India", "47", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Datum data2= new Datum(18, "AirIndia", "India", "87", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Datum data3= new Datum(22, "AirIndia", "India", "87", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Datum data4= new Datum(32, "AirIndia", "India", "87", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Datum data5= new Datum(33, "AirIndia", "India", "90", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		Datum data6= new Datum(36, "AirIndia", "India", "90", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		
		
		details.add(data1);
		details.add(data2);
		details.add(data3);
		details.add(data4);
		details.add(data5);
		details.add(data6);
		
		RootTaskWrite root=new RootTaskWrite(1, 6, 2840, 474, details, support);
		mapper.writeValue(file, root);

	}
	}

