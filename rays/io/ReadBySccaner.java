package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadBySccaner {
	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\mksuy\\Desktop\\io\\hello.txt");
		
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			
		System.out.println(sc.nextLine());
			
		}
		sc.close();
		file.close();
		
	}

}
