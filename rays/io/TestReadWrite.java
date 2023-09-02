package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TestReadWrite {
	public static void main(String[] args) throws Exception {
		
	BufferedReader in = new BufferedReader(new FileReader
			("C:\\Users\\mksuy\\Desktop\\io\\email.txt"));
	
	PrintWriter out1 = new PrintWriter(new FileWriter
			("C:\\Users\\mksuy\\Desktop\\io\\correct.txt"));
	
	PrintWriter out2 = new PrintWriter(new FileWriter
			("C:\\Users\\mksuy\\Desktop\\io\\incorrect.txt"));
	
	String line = in.readLine();
	
	while(line!=null) {
		 
		if (line.endsWith("@gmail.com")) {
			out1.println(line);
			
		}else {
			out2.println(line);
		}
		
		line = in.readLine();
			}
	out2.close();
	out1.close();
	
	in.close();
	
	System.out.println("data copied successfully...!!!");

		
	}

}
