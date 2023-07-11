package com.omrbranch.pojo;

import java.util.ArrayList;



public class GetAllAddress_Output_pojo {
	  private int status;
	    private String message;
	    private ArrayList<Alladdress_Data> data;
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
		public ArrayList<Alladdress_Data> getData() {
			return data;
		}
		public void setData(ArrayList<Alladdress_Data> data) {
			this.data = data;
		}
	    
}
