package com.rays.number;

public class RandomNumber {

	public static void main(String[] args) {
		
		int max = 10000;
		int min = 1;
		int range = max - min +1;
		for (int i = 1; i <= 4; i++) {
			
			int rd = (int)(Math.random()*range);
			if(rd>999)
			System.out.println(rd);
		}

	}

}
