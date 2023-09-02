package com.rays.array;

public class OneDimensionArray {

	public static void main(String[] args) {
		
		int [] table1 = {1,2,3,4,5};
		int [] table2 = new int[5];
		
		for (int i = 0; i < table1.length; i++) {
			table2[i] = 2*(i+1);
			
			System.out.println(table2[i]);
			
		}

	}

}
