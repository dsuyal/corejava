package com.rays.oop;

import java.util.Date;

public class Person {
	
	private String name;
	private Date dob;
	private String Address;
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setDate(Date dob) {
		this.dob = dob;
	}
	public Date getDate() {
		return dob;
		
	}
	public void setaddress(String Address) {
		this.Address = Address;
	}
	public String getAddress() {
		return Address;
	
	}
}
