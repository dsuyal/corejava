package com.rays.date;

import java.util.Calendar;

public class TestCalendar {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 5);
		java.util.Date d = cal.getTime();
		System.out.println(d);

	}

}
