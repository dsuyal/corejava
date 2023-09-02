package com.rays.exception;

public class TestLoginException {
public static void main(String[] args) {
	
	String name = "admin";
	
	if (name.equals("admin")) {
		
	System.out.println("Valid User..!!!");
		
	}else {
	LoginException e = new LoginException();
		
	try {
		
	throw e;
		
	} 
	catch (LoginException e1) {
	System.out.println(e1);
	}
		
	}
	System.out.println("after if-else");
}

}
