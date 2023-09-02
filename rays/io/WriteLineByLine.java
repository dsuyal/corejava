package com.rays.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriteLineByLine {
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\mksuy\\Desktop\\io\\write.txt,true");
		PrintWriter out = new PrintWriter(file);
		
		out.print("hello bhai");
		out.print("kkrh??");
		
		file.close();
		
		System.out.println("data write successfully...!");
	}

}
