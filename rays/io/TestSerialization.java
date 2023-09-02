package com.rays.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args)throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\mksuy\\Desktop\\io\\obj.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Marksheet m = new Marksheet();
		
		m.id = 10;
		m.name = "Dinesh";
		m.physics = 89;
		m.chemistry = 99;
		m.maths = 81;
		m.total = m.physics + m.chemistry + m.maths;
		
		out.writeObject(m);
		
		out.close();
		file.close();
		
		System.out.println("object write successfully...!");
		System.out.println("total = " +m.total);
		
	}
	

}
