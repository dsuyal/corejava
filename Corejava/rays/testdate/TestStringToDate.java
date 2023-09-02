package com.rays.testdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringToDate {

	public static void main(String[] args) throws ParseException{
		
		String str = "01/08/2023";
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		
		Date d = sfd.parse(str);
		
		System.out.println(d);
		

	}

}
