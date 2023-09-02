package com.rays.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestExtSerialization {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\mksuy\\Desktop\\io\\ExtObj.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		
		e.id  = 2;
		e.name = "Dinesh";
		e.address = "Nagda";
		e.salary = 50000;
		
		out.writeObject(e);
		
		out.close();
		file.close();
		
		System.out.println("Object write successfully..!!");
		
	}
	
}
