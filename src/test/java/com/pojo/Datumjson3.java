package com.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Datumjson3{
    private int id;
    private String flightName;
    @JsonProperty("Country") 
    private String country;
    @JsonProperty("Destinations") 
    private String destinations;
    @JsonProperty("URL") 
    private String uRL;
    public int getId() {
		return id;
	}
	public String getFlightName() {
		return flightName;
	}
	public String getCountry() {
		return country;
	}
	public String getDestinations() {
		return destinations;
	}
	public String getuRL() {
		return uRL;
	}
    
}





	