package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
 public static void main(String[] args) throws Exception {
	 
	 FileWriter writer = new FileWriter("C:\\Users\\mksuy\\Desktop\\io\\write.txt");
	 
	writer.write("hello");
	
	writer.close();
	
	System.out.println("data write successfully...!!!");
	
	 
}
}
