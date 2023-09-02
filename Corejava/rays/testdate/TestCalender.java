package com.rays.testdate;

import java.util.Calendar;

public class TestCalender {

	public static void main(String[] args) {
		
		
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DATE, 5);
		
		java.util.Date d = cal.getTime();
		
		System.out.println(d);
		

	}

}
