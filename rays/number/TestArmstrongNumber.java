package com.rays.number;

public class TestArmstrongNumber {

	public static void main(String[] args) {
		
		int a = 371;
		int b = a;
		int c = 0;
		int d;
		
		while (b>0) {
			d = b % 10;
			c = c+(d*d*d);
			b = b/10;
		}
		if (c==a) {
			System.out.println("yes this is Armstrong number");
		}else {
			System.out.println(" this is not Armstrong number");
		}
	}

}


