package com.rays.collection;

public class Employee {
	
	private int id = 0;
	private String name = null;
	private String address = null;
	
	public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
		
	}
	public int getid() {
		return id;
	}
	public void setid(int id)
	{
		this.id = id;
	}
	public String getname() 
	{
		return name;
	} public void setname(String name) {
		this.name = name;
	}
	public String getaddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return id + " " + name + " " + address;
	}
}
