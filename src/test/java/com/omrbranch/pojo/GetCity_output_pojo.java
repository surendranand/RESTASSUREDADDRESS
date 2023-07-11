package com.omrbranch.pojo;

import java.util.ArrayList;

public class GetCity_output_pojo {
	  private int status;
	  private String message;
	  private ArrayList<citylist>data;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ArrayList<citylist> getData() {
		return data;
	}
	public void setData(ArrayList<citylist> data) {
		this.data = data;
	}
	  
}
