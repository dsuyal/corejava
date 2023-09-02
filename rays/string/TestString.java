package com.rays.string;

public class TestString {

	public static void main(String[] args) {
		
		String name = "Dinesh suyal";{
			
			System.out.println("String length" +name.length());
			System.out.println("6th character is-"+name.charAt(5));
			System.out.println("index of nesh-"+name.indexOf("nesh"));
			System.out.println("First s position is-"+name.indexOf("s"));
			System.out.println("late s position is-"+name.lastIndexOf("s"));
			System.out.println("a is replace by b-"+name.replace("a","b"));
			System.out.println("small letter-"+name.toLowerCase());
			System.out.println("caps letter-"+name.toUpperCase());
			System.out.println("start with Dinesh-"+name.startsWith("Dinesh"));
			System.out.println("Ends with yal-"+name.endsWith("yal"));
			System.out.println("Substring-"+name.substring(6));
			}


	}

}
