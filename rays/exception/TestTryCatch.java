package com.rays.exception;

public class TestTryCatch {
public static void main(String[] args) {
	
	try {
		
		int a = 10;
		
		int b = 0;
		
		int c = a/b;
		
		System.out.println("Division = " + c);
		
	} catch (Exception e) {
	
	//System.out.println(e);
	//System.out.println(e.getMessage());
	e.printStackTrace();
	}finally {
		System.out.println("Finally Block...!!!");
	}
}

}
