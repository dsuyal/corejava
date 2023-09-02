package com.rays.array;

public class TestIntigerCount {

	public static void main(String[] args) {
		
		String str = "abc1d2e";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if(Character.isDigit(str.charAt(i))) {
				
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
		
		System.out.println(sum);
	}

}
