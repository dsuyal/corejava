package com.rays.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSepratNumber {

	public static void main(String[] args) {
		
		String input = "dinesh 123 suresh 456";
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
			 
	}

}
