package com.rays.number;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int a = 151;
		int b = a;
		int c = 0;
		int d;
		
		while (b>0) {
			d = b % 10;
			c = c* 10 +d;
			b = b/10;
		}
		if (a==c) {
			System.out.println("yes this is palindrom number");
		}else {
			System.out.println("not this is not palindrom number");
		}
	}

}
