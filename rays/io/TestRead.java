package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestRead {
	public static void main(String[] args) throws Exception {
		
	FileReader  reader = new FileReader("C:\\Users\\mksuy\\Desktop\\io\\hello.txt");
	
	int ch = reader.read();
	while(ch!= -1) {
		ch= reader.read();
		System.out.print((char)ch);
	}
	
	
	 reader.close();
	}

}
