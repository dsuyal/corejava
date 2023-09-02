package com.rays.testdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
		String str = sfd.format(d);
		System.out.println(str);
		
		
		
		

	}

}
