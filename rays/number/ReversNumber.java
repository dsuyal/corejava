package com.rays.number;

public class ReversNumber {

	public static void main(String[] args) {
		
		int n = 2468;
		int r = 0;
		for (int i = 0; i <= n; i++) {
			r = n % 10;
			System.out.print(r);
			n =n/10;
		}

	}

}
