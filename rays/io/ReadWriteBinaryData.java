package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteBinaryData {
	
	public static void main(String[] args) throws Exception {
		
	FileInputStream in = new FileInputStream("C:\\Users\\mksuy\\Desktop\\io\\cow.jpg");
	
	FileOutputStream out = new FileOutputStream("C:\\Users\\mksuy\\Desktop\\io\\cow1.jpg");
	
	int ch = in.read();
	
	while (ch!=1) {
		
		out.write(ch);
		ch = in.read();
		
		
	}
	in.close();
	
	System.out.println("Data copied successfully...!!!");
		
	}

}
