package com.rays.string;

public class TestStringBuffer {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("vijay");
		sb.append(" Dinanath");
		{
		System.out.println(sb);
		System.out.println("length" +sb.length());
		System.out.println("capacity" +sb.capacity());

		}

	}

}
